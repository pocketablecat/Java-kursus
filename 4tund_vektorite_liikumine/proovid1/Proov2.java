package proovid1;
import liikumine1.*;
public class Proov2 {
	public static void paigutaNulli(Paigutatav p){		
		p.uusAsukoht(0, 0);
	}
	public static String asukohtTekstina(Paiknev p){
		return "("+p.x()+", "+p.y()+")";		
	}
	public static void main(String[] args) {
       Viljandi v=new Viljandi();
       System.out.println(asukohtTekstina(v));
       //paigutaNulli(v);
	}
}
