public class Viimsi{
public static void trykiAbi(){
	System.out.println("Kasuta programmi kujul: java Viimsi kask kontonr [summa]");
	System.out.println("kask - kysi | lisa | loo | eemalda");
	System.out.println("V6i kujul: java Viimsi ylekanne algkonto sihtkonto summa");
}
public static void main(String[] arg){
	if(arg.length<2){trykiAbi();return;}	
	Kontohaldus k1=new Kontohaldus("Viimsivald");
	String kask=arg[0];
	int kontonr=Integer.parseInt(arg[1]);
	if(kask.equals("kysi")){System.out.println(k1.kysiSumma(kontonr));}
	if(kask.equals("lisa")){
	int summa=Integer.parseInt(arg[2]);
	k1.lisaSumma(kontonr, summa);
	System.out.println(k1.kysiSumma(kontonr));
	}
	if(kask.equals("loo")){k1.looKonto(kontonr);}
	if(kask.equals("eemalda")){
	int summa=Integer.parseInt(arg[2]);
	k1.eemaldaSumma(kontonr, summa);
	System.out.println(k1.kysiSumma(kontonr));
	}
	if(kask.equals("ylekanne")){
	int algkonto=Integer.parseInt(arg[1]);
	int sihtkonto=Integer.parseInt(arg[2]);
	int summa=Integer.parseInt(arg[3]);
	k1.ylekanne(algkonto, sihtkonto, summa);
	System.out.println(k1.kysiSumma(algkonto));
	System.out.println(k1.kysiSumma(sihtkonto));
	}
	
	
}
}