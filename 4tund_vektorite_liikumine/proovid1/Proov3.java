package proovid1;
import liikumine3.*;
public class Proov3 {
	public static void paigutaNulli(Paigutatav p){		
		p.uusAsukoht(0, 0);
	}
	public static String asukohtTekstina(Paiknev p){
		return "("+p.x()+", "+p.y()+")";		
	}
	public static void main(String[] args) {
		KiirusegaKujund k1=new KiirusegaKujund(3, 5, 1, 0);
		System.out.println(k1.x()+" "+k1.y());
		k1.uusAsukoht(4, 7);
		System.out.println(k1.x()+" "+k1.y());
		System.out.println(asukohtTekstina(k1));
		k1.teeSamm();
		System.out.println(asukohtTekstina(k1));
		paigutaNulli(k1);
		System.out.println(asukohtTekstina(k1));
	}
}
