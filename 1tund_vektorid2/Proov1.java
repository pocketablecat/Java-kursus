public class Proov1{
	public static void main(String[] arg){
	Vektor v1=new Vektor(4, 6);
	System.out.println(v1+", pikkus "+v1.pikkus());;
	Vektor v2=new Vektor(1, 8);
	Vektor[] vektorid=new Vektor[2];
	vektorid[0]=v1;
	vektorid[1]=v2;
	for(int i=0; i<vektorid.length; i++){
	System.out.println(vektorid[i].pikkus());
	}
	}
}