public class Sisestus1{
 public static void main(String[] eesnimed){
	if(eesnimed.length>0){
		System.out.println("Sisestati "+eesnimed.length+
		 ((eesnimed.length==1) ? "eesnimi" : " eesnime"));
		for(int i=0; i<eesnimed.length; i++){
		 System.out.println(eesnimed[i]);
		}
	} else {
		System.out.println("Kasuta kujul java Sisestus 1 Siim Sass Mari");
	}
 }
}