package proovid1;
import liikumine3.*;
public class Proov4 {
	public static void main(String[] args) {
       KiirendusegaKujund kk=new KiirendusegaKujund(
    		 0, 0, 1, 0, 0, 1);
       for(int i=0; i<10; i++){    	   
    	   System.out.println(kk.x()+" "+kk.y());
    	   kk.teeSamm();
       }
	}
}
