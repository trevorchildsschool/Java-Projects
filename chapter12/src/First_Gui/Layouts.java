package First_Gui;

import javax.swing.*;
import java.awt.*;

public class Layouts {
	JFrame myFrame;
	JPanel contentPane; //gives access to default contentPane

	public Layouts() {
		myFrame = new JFrame(); //creates JFrame window
		contentPane = new JPanel();//creates a new content pane
		myFrame.setContentPane(contentPane);//replace old jpanel w our new one
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("");
		myFrame.setSize(300,200);
		myFrame.setLocation(0,0);
		
		/*for (int i = 0;i<4;i++) { //loop 4 times
			myFrame.add(new JButton("Button "+i+1));
		}
		*/

		
		
																						
		myFrame.setLayout(new FlowLayout());//option 1 now access to the layout manager
		GridLayout grid = new GridLayout(3,2,10,10); // how many rows/columns
		FlowLayout flowlayout = new FlowLayout();//option 2 you now have access to the layout manager
		grid.setHgap(20);
		grid.setVgap(20);
		BorderLayout border1 = new BorderLayout();
		BorderLayout border2 = new BorderLayout(5,10);
		BoxLayout boxlayout1 = new BoxLayout(contentPane,BoxLayout.Y_AXIS);
		BoxLayout boxlayout2 = new BoxLayout(contentPane,BoxLayout.X_AXIS);
		contentPane.setLayout(boxlayout2); //sets the layout
		/*border layout buttons
		myFrame.add(new JButton("B1"),border2.PAGE_START);
		myFrame.add(new JButton("B2"),border2.PAGE_END);
		myFrame.add(new JButton("B3"),border2.LINE_START);
		myFrame.add(new JButton("B4"),border2.LINE_END);
		myFrame.add(new JButton("B5"),border1.CENTER);
		*/
		JButton button1 = new JButton("B1");
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		myFrame.add(button1);
		JButton button2 = new JButton("B2");
		button2.setAlignmentX(Component.LEFT_ALIGNMENT);
		myFrame.add(button2);
		JButton button3 = new JButton("B3");
		button3.setAlignmentX(Component.TOP_ALIGNMENT);
		myFrame.add(button3);
		JButton button4 = new JButton("B4");
		button4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		myFrame.add(button4);
		JButton button5 = new JButton("B5");
		button5.setAlignmentX(Component.BOTTOM_ALIGNMENT);
		myFrame.add(button5);
		
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
