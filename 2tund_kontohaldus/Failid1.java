import java.io.*;
public class Failid1{
	public static void main(String[] arg) throws IOException{
		PrintWriter faili=new PrintWriter(new FileWriter("sisu.txt"));
		faili.println(125);
		faili.close();
		}
}