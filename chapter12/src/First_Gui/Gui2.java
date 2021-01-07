package First_Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui2 implements ActionListener{
	String name;
	JTextField name_tb;
	JLabel dontClick_lbl;
	JButton dontClick_bttn;
	JFrame mainFrame;
	JLabel text;
	public Gui2() {
		// Initial default setup of the frame
		mainFrame = new JFrame();
		FlowLayout flowlayout = new FlowLayout();
		mainFrame.setLayout(flowlayout);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.setTitle("Graphical User Interface 2");
		mainFrame.setSize(500,300);
		mainFrame.setLocation(200,200);
		
		//Building the widgets
		dontClick_lbl = new JLabel("JLabel");
		dontClick_lbl.setText("Enter Your Name");
		
		dontClick_bttn = new JButton("");
		dontClick_bttn.addActionListener(this);
		
		text = new JLabel("Text");
		
		name_tb = new JTextField();
		name_tb.setPreferredSize(new Dimension(100,20));
		

		dontClick_bttn.setPreferredSize(new Dimension(30,20));
		
		//adding widgets
		mainFrame.add(dontClick_lbl);
		mainFrame.add(name_tb);
		mainFrame.add(dontClick_bttn);
		
		
		
		//last line that is ran
		mainFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Gui2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name = name_tb.getText();
		JOptionPane.showMessageDialog(null, "I said dont click, "+name+"!" );
		mainFrame.getContentPane().setBackground(Color.BLACK);
		dontClick_lbl.setForeground(Color.WHITE);
		
	}

}
