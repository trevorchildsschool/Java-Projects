package First_Gui;

import javax.swing.*;
import java.awt.*;


public class frames {
	JFrame myFrame;
	JPanel contentPane;
	public frames() {
		myFrame = new JFrame(); //creates JFrame window
		contentPane = new JPanel();//creates a new content pane
		myFrame.setContentPane(contentPane);//replace old jpanel w our new one
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("");
		myFrame.setSize(300,200);
		myFrame.setLocation(0,0);
		
		GridLayout grid = new GridLayout(2,2);
		myFrame.setLayout(grid);
		BorderLayout border = new BorderLayout();
		BoxLayout box1 = new BoxLayout(contentPane,BoxLayout.Y_AXIS);
		BoxLayout box2 = new BoxLayout(contentPane,BoxLayout.X_AXIS);
		
		JPanel topleft = new JPanel();
		JPanel topright = new  JPanel();
		JPanel bottomleft = new JPanel();
		JPanel bottomright = new JPanel();
		
		topleft.setLayout(grid);
		myFrame.add(topleft);
		topright.setLayout(border);
		myFrame.add(topright);
		bottomleft.setLayout(box1);
		myFrame.add(bottomleft);
		bottomright.setLayout(box2);
		myFrame.add(bottomright);
		
		topleft.add(new JButton("B1"));
		topleft.add(new JButton("B2"));
		topleft.add(new JButton("B3"));
		topleft.add(new JButton("B4"));
		
		
		myFrame.setVisible(true);
		contentPane.setVisible(true);
	}

	public static void main(String[] args) {
		

	}

}
