import javax.swing.*;
public class JooniseKaivitus{
	public static void main(String[] arg){
		JFrame f=new JFrame("Tervitusaken");
		f.setSize(400,300);
		f.getContentPane().add(new Joonis1());
		f.setVisible(true);
		f.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}