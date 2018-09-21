import java.io.*;
public class Kontohaldus{
	private String katalooginimi;
	public Kontohaldus(String nimetus){
		katalooginimi=nimetus;
		kataloogiKontroll();
	}
	void kataloogiKontroll(){
		File abi=new File(katalooginimi);
		if(!abi.exists()){abi.mkdir();}
		
	}
	File kontoFail(int kontonr){
		return new File(katalooginimi+File.separator+kontonr+".txt");
	}
	boolean kasKontoOlemas(int kontonr){
		return kontoFail(kontonr).exists();
	}
	void looKonto(int kontonr){
		if(!kasKontoOlemas(kontonr)){
	try{
		PrintWriter faili=new PrintWriter(new FileWriter(kontoFail(kontonr)));
		faili.println(0);
		faili.close();
		}catch(Exception ex){ex.printStackTrace();}
		}
	}
	int kysiSumma(int kontonr){
	if(kasKontoOlemas(kontonr)){
		try{
			BufferedReader failist=new BufferedReader(new FileReader(kontoFail(kontonr)));
			String abi=failist.readLine();
			failist.close();
			return Integer.parseInt(abi);
		}catch(Exception ex){ex.printStackTrace();}
		}
		return -1;
	}
	private void kirjutaSumma(int kontonr, int summa){
		if(kasKontoOlemas(kontonr)){
		try{
			PrintWriter faili=new PrintWriter(new FileWriter(kontoFail(kontonr)));
			faili.println(summa);
			faili.close();
		}catch(Exception ex){ex.printStackTrace();}
		}
	}
	void lisaSumma(int kontonr, int summa){
	if(summa>0){
		kirjutaSumma(kontonr, kysiSumma(kontonr)+summa);
	}
	}
	
	//Käsklus summa eemaldamiseks, OLEMAS
	
	void eemaldaSumma(int kontonr, int summa){
	if(summa>0 && kysiSumma(kontonr)>=summa){
		kirjutaSumma(kontonr, kysiSumma(kontonr)-summa);
	}
	}
	boolean ylekanne(int algkonto, int sihtkonto, int summa){
	 if(kasKontoOlemas(algkonto) && kasKontoOlemas(sihtkonto)
	 && kysiSumma(algkonto)>=summa){
		eemaldaSumma(algkonto, summa);
		lisaSumma(sihtkonto, summa);
		return true;
	 }
	 return false;
	}
	//Looge uus proovifail, mille abil ülekannet katsetada, OLEMAS
}