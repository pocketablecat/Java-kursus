public class Sisestus3{
 public static void main(String[] arvud){
	int summa=0;
	for(int i=0; i<arvud.length; i++){
		summa=summa+Integer.parseInt(arvud[i]);
	}
	System.out.println(summa);
 }
}
