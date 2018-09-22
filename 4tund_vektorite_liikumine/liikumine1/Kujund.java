package liikumine1;

public class Kujund implements Paiknev, Paigutatav {
    private Vektor asukoht;
	public Kujund(double ux, double uy){		
		asukoht=new Vektor(ux, uy);
	}
	public void uusAsukoht(double x, double y) {
        asukoht=new Vektor(x, y);
	}
	
	public double x() {
		return asukoht.x();
	}
	
	public double y() {
		return asukoht.y();
	}

}
