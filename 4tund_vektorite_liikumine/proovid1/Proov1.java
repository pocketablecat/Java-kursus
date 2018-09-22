package proovid1;
import liikumine1.*;
public class Proov1 {
	public static void paigutaNulli(Paigutatav p){		
		p.uusAsukoht(0, 0);
	}
	public static String asukohtTekstina(Paiknev p){
		return "("+p.x()+", "+p.y()+")";		
	}
	public static void main(String[] args) {
		Kujund k1=new Kujund(3, 5);
		System.out.println(k1.x()+" "+k1.y());
		k1.uusAsukoht(4, 7);
		System.out.println(k1.x()+" "+k1.y());
		System.out.println(asukohtTekstina(k1));
		paigutaNulli(k1);
		System.out.println(asukohtTekstina(k1));
	}
}
