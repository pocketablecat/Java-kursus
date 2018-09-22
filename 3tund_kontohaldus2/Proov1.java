public class Proov1{
  public static void main(String[] arg){
    Kasutaja juku=new Kasutaja();
	juku.sisenes(2);
    System.out.println(juku.kasSees()); 
    juku.lahkus(5);	
    System.out.println(juku.kasSees()); 
	juku.sisenes(7);
	System.out.println(juku.kokkuSees(10));
//mitu korda on sisenetud, väljasta tulemus	
	System.out.println(juku.loendus());
  }
}