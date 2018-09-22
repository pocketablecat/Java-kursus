package liikumine3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Vektor {
   private double vx, vy;
   public Vektor(double ux, double uy){
	   vx=ux; 
	   vy=uy;
   }
   public double x(){return vx;}
   public double y(){return vy;}
   @Override
   public String toString(){
	   DecimalFormatSymbols symbolid=new DecimalFormatSymbols();
	   symbolid.setDecimalSeparator('.');
	   DecimalFormat formaat=new DecimalFormat("#.##",symbolid);
	   return "("+formaat.format(vx)+", "+formaat.format(vy)+")";
   }
   public Vektor liida(Vektor v){
	   return new Vektor(vx+v.x(), vy+v.y());	   
   }

   public Vektor korruta(double arv){
	   return new Vektor(vx*arv, vy*arv);	   
   }
   public Vektor tagurpidi(){
	   return this.korruta(-1);	   
   }
   public Vektor keera(double kraadid){
	   double radiaanid=Math.toRadians(kraadid);
	   return new Vektor(
		 vx*Math.cos(radiaanid)-vy*Math.sin(radiaanid),
		 vx*Math.sin(radiaanid)+vy*Math.cos(radiaanid)
	   );
   }
}



