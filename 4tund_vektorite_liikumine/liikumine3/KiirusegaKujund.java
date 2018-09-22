package liikumine3;

public class KiirusegaKujund extends Kujund implements Liigutatav {
	protected Vektor kiirus;
    public KiirusegaKujund(double ux, double uy, 
    		double kx, double ky){
    	super(ux, uy);    
    	kiirus=new Vektor(kx, ky);
    }
	
	public void teeSamm() {
		uusAsukoht(x()+kiirus.x(), y()+kiirus.y());
	}

}
