public class Vektor{
	private double vx;
	private double vy;
	public Vektor(double ux, double uy){
		vx=ux;
		vy=uy;
	}
	public double x(){return vx;}
	public double y(){return vy;}
	void liida(Vektor v){
//	vx=vx*v.x();
//	vy=vy*v.y();
	vx+=v.x();
	vy+=v.y();
// vektorite liitmine ja korrutamine
	}
	// Ül. lisa käsklus vektori korrutamiseks arvuga
	public void korruta(double arv){
	vx=vx*arv;
	vy=vy*arv;
	}
	//vektori ümberpööramine (tagurpidi)
	public void tagurpidi(){
	korruta(-1);
	}
	public Vektor koopia(){
	return new Vektor(vx, vy);
	}
	public double pikkus(){
		return Math.sqrt(vx*vx+vy*vy);
	}
	public String toString(){
		return "("+vx+", "+vy+")";
	}
}