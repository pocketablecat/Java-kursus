public class Proov2{
public static void main(String[] arg){
	Vektor v1=new Vektor(3, 4);
	Vektor v2=new Vektor(2, 3);
	Vektor v3=v1.koopia();
	v1.liida(v2);
	//v1.liida(v2);
	System.out.println(v1);
	System.out.println(v3);
	v2.korruta(2);
	System.out.println(v2);
	v2.tagurpidi();
	System.out.println(v2);
}
}