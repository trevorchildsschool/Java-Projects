package First_Gui;
import javax.swing.*;
import java.awt.*;


public class Gui1 {

	public Gui1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //creating a frame object
		FlowLayout flowlayout = new FlowLayout(); //adding components
		
		frame.setTitle("Gui"); //titling the gui
		frame.setSize(500, 500);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel my_labl = new JLabel("This is a label."); //creating label
		my_labl.setText("test");
		frame.add(my_labl); //adding label
		
		JButton button = new JButton("Dont click pls");
		frame.add(button);
		JButton button1 = new JButton("Dont click pls");
		frame.add(button1);
		JButton button2 = new JButton("Dont click pls");
		frame.add(button2);
		JButton button3 = new JButton("Dont click pls");
		frame.add(button3);
		JButton button4 = new JButton("Dont click pls");
		frame.add(button4);
		JButton button5 = new JButton("Dont click pls");
		frame.add(button5);
		
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.YELLOW);
		
		frame.setLayout(flowlayout);
		my_labl.setForeground(Color.BLUE);
		my_labl.setBackground(Color.GREEN);
		//frame.pack();
	}

}
