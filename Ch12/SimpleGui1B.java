// action on button
import javax.swing.*; 		// for GUI
import java.awt.event.*; 	// for ActionListener and ActionEvent

class SimpleGui1B implements ActionListener {
	
	JButton button;
	
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		// associate this object with the button
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
	
}