public class Proov2{
	public static void main(String[] arg){
		LogiHaldus h=new LogiHaldus();
		h.t88tleRida(1, "juku", "sisenes");
		h.t88tleRida(4, "juku", "lahkus");
		h.t88tleRida(7, "juku", "sisenes");
		h.t88tleRida(7, "kati", "sisenes");
		h.t88tleRida("8 kati lahkus");
		System.out.println(h.kysiKasutaja("juku").kokkuSees(9));
		System.out.println(h.kysiKasutaja("kati").kokkuSees(9));
		System.out.println(h.kasutajadKokkuSees(9));
		for(String knimi:h.kasutajanimed()){
			System.out.println(knimi);
		}
	}
}