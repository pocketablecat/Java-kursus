import java.io.*;
public class Failid2{
	public static void main(String[] arg) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("sisu.txt"));
		String tulemus=failist.readLine();
		System.out.println(tulemus);
		failist.close();
	}
}