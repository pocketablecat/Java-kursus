public class Proov1{
	public static void main(String[] arg){
		toidud RohelineEesti6un=new toidud("storagekaust");
		toidud VeneJuust=new toidud("storagekaust");
		toidud HollandiJuust=new toidud("storagekaust");
//		System.out.println(RohelineEesti6un.kasToitOlemas(00001));
		RohelineEesti6un.looKonto(00001);
		VeneJuust.looKonto(00063);
		HollandiJuust.looKonto(00065);
		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
//		System.out.println(VeneJuust.kysiToiduKogus(00063));
//		System.out.println(HollandiJuust.kysiToiduKogus(00065));
		System.out.println("Lisab kogusele +5");
		RohelineEesti6un.lisaToiduKogusele(00001, 5);
		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
//		VeneJuust.lisaToiduKogusele(00063, 10);
//		HollandiJuust.lisaToiduKogusele(00065, 8);
		System.out.println("Siit tuleb eemaldamine, -3");
		RohelineEesti6un.eemaldaToiduKoguselt(00001, 3);
		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
		System.out.println("Siin tuleb koguse kindlaksm22ramine, number 44");
		RohelineEesti6un.kirjutaKogus(00001, 44);
		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
		
//		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
//		RohelineEesti6un.lisaToiduKogusele(00001, 20);
//		System.out.println(VeneJuust.kysiToiduKogus(00063));
//		VeneJuust.lisaToiduKogusele(00063, 5);
//		System.out.println(RohelineEesti6un.kysiToiduKogus(00001));
	}
}

//algandmed 52 ja 10