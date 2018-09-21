import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Joonis2 extends JApplet implements ActionListener{
	int kogus=5;
	JTextField tf=new JTextField(String.valueOf(kogus));
	
	public Joonis2(){
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e){
		kogus=Integer.parseInt(tf.getText());
		repaint();
	
	}
	
	public void paint(Graphics g){
	for(int i=0; i< kogus; i++){
	g.drawRect(i*20, 10, 10, 10);
	}
	}
}