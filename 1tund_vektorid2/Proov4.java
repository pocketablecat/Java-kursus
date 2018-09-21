public class Proov4{
public static void main(String[] arg) throws Exception{
	Vektor asukoht=new Vektor(0, 100);
	Vektor kiirus=new Vektor(1, 0);
	Vektor kiirendus= new Vektor(0, -0.1);
	while(asukoht.y()>0){
	System.out.println(asukoht+" "+kiirus);
	asukoht.liida(kiirus);
	kiirus.liida(kiirendus);
	Thread.sleep(1000);
	}
}
}