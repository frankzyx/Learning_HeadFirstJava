// drawing widget

import java.awt.*;
import javax.swing.*;

class SimpleGui1C {
	public void go() {
		JFrame frame = new JFrame();
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		
		frame.setSize(1000,800);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		SimpleGui1C gui = new SimpleGui1C();
		gui.go();
	}
	
}

class MyDrawPanel extends JPanel {
	// never call this method myself
	public void paintComponent(Graphics g) {
		// g.setColor(Color.orange);
		// g.fillRect(10,20,100,100);
		
		Image im = new ImageIcon("home_cat.jpg").getImage();
		g.drawImage(im, 10, 15, this);
	}
}