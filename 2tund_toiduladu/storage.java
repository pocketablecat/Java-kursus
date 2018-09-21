public class storage{
//kommentaaride ja juhtiste lisa
public static void trykiAbi(){
	System.out.println("ver1.25\nTere tulemast Mahe Maapoe toidulattu!\n \nSiin saate:\n1- luua uusi toidu ja muu kauba kirjeid;\n2- neid eemaldada kui tooteid enam sisse ei osteta;\n3- nende laoseisu muuta(lisada, v2hendada).\n");
	System.out.println("Kasuta seda programmi j2rgnevalt:\njava storage *k2sk %toidukood %[summa]		(*- vt. allpool; %- muutujad)");
	System.out.println(" *k2sk = kysi | lisa | loo | eemalda\n   **kysi-      saab p2rida laoseisu kohta;\n   **lisa-      saab lisada kirjedele;\n   **loo-       saab luua uue tootekirje;\n   **eemalda-   toote eemaldamine");
	System.out.println("\nNB. Selleks et teha p2ringut erinevate toodete varudest laost, peab Teil olema teada toidukood.\nSelleks et lisada uusi tooteid, peab Teil samuti olema toitukood ning ka luba ylemuselt.");
	System.out.println("Kui Teil puudub toidukood v6i olemasolev ei t88ta, p88rduge palun oma ylemuse v6i helistage abi saamiseks\n \n+372 00 00 000 Ivan Ivanovits Ivanov IT-abi (E-R 8-22, L 10-19, P- puhkan).\n\n Näite tooted: 1, 51, 53");
}
//kommentaaride lõpp
public static void main(String[] arg){
	if(arg.length<2){trykiAbi();return;}	
	//kui argument trykiAbi on pikem kui 2, tuleb see printida
	toidud k1=new toidud("storagekaust");
	String kask=arg[0];
	int toidukood=Integer.parseInt(arg[1]);
	if(kask.equals("kysi")){System.out.println(k1.kysiToiduKogus(toidukood));}
	//eelnev lause kysib toidukoodi kui sisestatakse käsk kysi
	if(kask.equals("lisa")){
	int summa=Integer.parseInt(arg[2]);
	k1.lisaToiduKogusele(toidukood, summa);
	System.out.println(k1.kysiToiduKogus(toidukood));
	}
	//lisatakse ning lisatav summa peab olema number; peab olema ka teada toidukood millele lisatakse
	if(kask.equals("loo")){k1.looKonto(toidukood);}
	//loomisel vaja teada koodi
	if(kask.equals("eemalda")){
	int summa=Integer.parseInt(arg[2]);
	k1.eemaldaToiduKoguselt(toidukood, summa);
	System.out.println(k1.kysiToiduKogus(toidukood));
	//eemaldamisel vaja teada toidukoodi ja arvu
	}

}
}