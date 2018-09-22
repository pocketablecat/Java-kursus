import java.io.*;
import java.util.*;
public class LogiHaldus{
   Map<String, Kasutaja> kasutajad=new HashMap<String, Kasutaja>();
   int viimaneAeg=0;
   public boolean kasKasutajaOlemas(String knimi){
      return kasutajad.containsKey(knimi);
   }
   public Kasutaja kysiKasutaja(String knimi){
      if(!kasKasutajaOlemas(knimi)){
	    lisaKasutaja(knimi);
	  }
      return kasutajad.get(knimi);
   }
   public void lisaKasutaja(String knimi){
     kasutajad.put(knimi, new Kasutaja());
   }
   public void t88tleRida(int aeg, String knimi, String tegevus){
      if(aeg<viimaneAeg){throw new RuntimeException(
	    "Aeg tagurpidi "+ aeg + " < " +viimaneAeg);
	  }
	  viimaneAeg=aeg;
      if(tegevus.equals("sisenes")){
	     kysiKasutaja(knimi).sisenes(aeg);
	  } else if(tegevus.equals("lahkus")){
	     kysiKasutaja(knimi).lahkus(aeg);
	  } else {
	     throw new RuntimeException("Tundmatu tegevus: "+tegevus);
	  }
   }
   public void logiK6ikV2lja(int aeg){
      for(String knimi: kasutajanimed()){
	    Kasutaja k=kysiKasutaja(knimi);
		if(k.kasSees()){
		   k.lahkus(aeg);
		}
	  }
   }
   public void t88tleRida(String rida){
      String[] m=rida.split(" ");
	  if(m.length==3){
	     t88tleRida(Integer.parseInt(m[0]), m[1], m[2]);
	  }
      if(m.length==2 && m[1].equals("reset")){
	     logiK6ikV2lja(Integer.parseInt(m[0]));
	  }
   }
   public void t88tleLogi(String failinimi){
     try{
	    BufferedReader failist=new BufferedReader(new FileReader(failinimi));
		String rida=failist.readLine();
		while(rida!=null){
//		   System.out.println(rida);
		   t88tleRida(rida);
		   rida=failist.readLine();
		}
		failist.close();
	 } catch(Exception ex){ex.printStackTrace();}
   }
   public String kasutajadKokkuSees(int aeg){
      if(aeg<viimaneAeg){throw new RuntimeException(
	    "Aeg tagurpidi "+ aeg + " < " +viimaneAeg);
	  }
      String t="";
	  Iterator<Map.Entry<String, Kasutaja>> it=kasutajad.entrySet().iterator();
	  while(it.hasNext()){
	     Map.Entry<String, Kasutaja> k=it.next();
	     t+=k.getKey()+": "+k.getValue().kokkuSees(aeg)+"\n";
	  }
	  return t;
   }
   public String kasutajadKokkuSees(){
      return "Ajal "+viimaneAeg+" kokku sees:\n"+kasutajadKokkuSees(viimaneAeg);
   }
   public String[] kasutajanimed(){
      return kasutajad.keySet().toArray(new String[0]);
   }
}



