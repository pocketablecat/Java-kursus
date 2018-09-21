public class Proov3{
public static void main(String[] arg) throws Exception{
	Vektor asukoht=new Vektor(0, 0);
	Vektor kiirus=new Vektor(1, 0);
	while(true){
	System.out.println(asukoht);
	asukoht.liida(kiirus);
	Thread.sleep(1000);
	}
}
}