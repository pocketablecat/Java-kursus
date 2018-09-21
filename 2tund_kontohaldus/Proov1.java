public class Proov1{
	public static void main(String[] arg){
		Kontohaldus k1=new Kontohaldus("Viimsivald");
		Kontohaldus k2=new Kontohaldus("Viimsivald");
		System.out.println(k1.kasKontoOlemas(15665));
		k1.looKonto(15665);
		k2.looKonto(15664);
//		System.out.println(k1.kysiSumma(15665));
//		k1.lisaSumma(15665, 5);
//		System.out.println(k1.kysiSumma(15665));
//		k1.eemaldaSumma(15665, 1);
//		System.out.println(k1.kysiSumma(15665));
//		k1.lisaSumma(15665, 20);
//		System.out.println(k2.kysiSumma(15664));
//		k2.lisaSumma(15664, 5);
		System.out.println(k1.kysiSumma(15665));
		k1.ylekanne(15665, 15664, 5);
		System.out.println(k2.kysiSumma(15664));
	}
}

//algandmed 52 ja 10