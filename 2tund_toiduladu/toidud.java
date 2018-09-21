import java.io.*;
public class toidud{
	private String katalooginimi;
	public toidud(String nimetus){
		katalooginimi=nimetus;
		kataloogiKontroll();
	}
	void kataloogiKontroll(){
		File abi=new File(katalooginimi);
		if(!abi.exists()){abi.mkdir();}
		
	}
	File toiduFail(int toidukood){
		return new File(katalooginimi+File.separator+toidukood+".txt");
	}
	boolean kasToitOlemas(int toidukood){
		return toiduFail(toidukood).exists();
	}
	void looKonto(int toidukood){
		if(!kasToitOlemas(toidukood)){
	try{
		PrintWriter faili=new PrintWriter(new FileWriter(toiduFail(toidukood)));
		faili.println(0);
		faili.close();
		}catch(Exception ex){ex.printStackTrace();}
		}
	}
	int kysiToiduKogus(int toidukood){
	if(kasToitOlemas(toidukood)){
		try{
			BufferedReader failist=new BufferedReader(new FileReader(toiduFail(toidukood)));
			String abi=failist.readLine();
			failist.close();
			return Integer.parseInt(abi);
		}catch(Exception ex){ex.printStackTrace();}
		}
		return -1;
	}
	void kirjutaKogus(int toidukood, int summa){
		if(kasToitOlemas(toidukood)){
		try{
			PrintWriter faili=new PrintWriter(new FileWriter(toiduFail(toidukood)));
			faili.println(summa);
			faili.close();
		}catch(Exception ex){ex.printStackTrace();}
		}
	}
	void lisaToiduKogusele(int toidukood, int summa){
	if(summa>0){
		kirjutaKogus(toidukood, kysiToiduKogus(toidukood)+summa);
	}
	}
	
	//Käsklus summa eemaldamiseks, OLEMAS
	
	void eemaldaToiduKoguselt(int toidukood, int summa){
	if(summa>0 && kysiToiduKogus(toidukood)>=summa){
		kirjutaKogus(toidukood, kysiToiduKogus(toidukood)-summa);
	}
	}

}