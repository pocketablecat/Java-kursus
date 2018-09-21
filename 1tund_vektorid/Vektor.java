public class Vektor{
	private double vx;
	private double vy;
	public Vektor(double ux, double uy){
		vx=ux;
		vy=uy;
	}
	public double pikkus(){
		return Math.sqrt(vx*vx+vy*vy);
	}
	public String toString(){
		return "("+vx+", "+vy+")";
	}
}