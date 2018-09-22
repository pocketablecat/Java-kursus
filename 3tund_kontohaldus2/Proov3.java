public class Proov3{
	public static void main(String[] arg){
		LogiHaldus h=new LogiHaldus();
		h.t88tleLogi("logi1.txt");
		System.out.println(h.kasutajadKokkuSees(8));
		System.out.println(h.kasutajadKokkuSees());
		
	}
}