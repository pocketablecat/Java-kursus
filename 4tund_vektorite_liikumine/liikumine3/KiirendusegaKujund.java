package liikumine3;

public class KiirendusegaKujund extends KiirusegaKujund {
   protected Vektor kiirendus;
   public KiirendusegaKujund(double ux, double uy,
		    double kx, double ky, double kdx, double kdy){
	   super(ux, uy, kx, ky);
	   kiirendus=new Vektor(kdx, kdy);
   }
   public void teeSamm(){
	   kiirus=kiirus.liida(kiirendus);
	   super.teeSamm();
   }
}
