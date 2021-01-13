package ch13;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
		
public class ch13 implements ActionListener,ChangeListener{//adding action listemer for the buttons
		JFrame frame = new JFrame(); //creating a frame object
		String result;
		JPanel contentPane;
		BoxLayout boxlayout;
		JTextField firstName;
		JTextField lastName;
		JButton button;
		JTextArea description;
		JScrollPane scrollpane;
		JSpinner ageSpinner;
		JComboBox cbtestBox;
		String[] gamesList = {"Minecraft","Skyrim","halo 3","skate 3", "red dead redemption","half life 2", "halo reach"};
		
		
		int index=0;
	public ch13 () { //adding action listemer for the buttons
		
		 //limits number for list
		String[][] testarray = new String[3][3];
		testarray[1][1] = "mid";
		String[][][] testarray3=new String[3][3][3];	
		String[][][][] testarray4 = new String[3][3][3][3];
				
		FlowLayout flowlayout = new FlowLayout(); //adding components
		JPanel contentPane = (JPanel)frame.getContentPane();
		boxlayout = new BoxLayout(contentPane,BoxLayout.Y_AXIS);
		//boxlayout.
		
		frame.setLayout(boxlayout);
		frame.setTitle("title"); //titling the gui
		frame.setSize(500, 500);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstName = new JTextField(20); //pass in max chars
		//firstName.setSize(100, 10);
		lastName = new JTextField();
		
		
		ageSpinner = new JSpinner(new SpinnerNumberModel(18,0, 130,1));
		
		JList favGamesJList = new JList(gamesList);
		favGamesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane glistScrollPane = new JScrollPane(favGamesJList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//favGamesJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//favGamesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		favGamesJList.setSelectedIndex(1);
		cbtestBox = new JComboBox(gamesList);
		cbtestBox.setEditable(true);
		
		ageSpinner.addChangeListener(this);
		
		
		description = new JTextArea(5,20); //limit space being used
		description.setLineWrap(true); //once hits end of line it will auto format false will disable that and allow the horizontal scroll bar
		description.setText(gamesList[index]);
		
		scrollpane = new JScrollPane(description, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		button = new JButton("Done");
		button.addActionListener(this);
		
		
		contentPane.add(new JLabel("Game"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("Description"));
		contentPane.add(scrollpane);
		contentPane.add(new JLabel("Age"));
		
		contentPane.add(ageSpinner);
		contentPane.add(button);
		contentPane.add(favGamesJList);
		contentPane.add(glistScrollPane);
		contentPane.add(cbtestBox);
		
		frame.pack();
		
		
		
		
		
		frame.setVisible(true);
		
		
	}	
		
	public static void main(String[] args) {
		new ch13();
		
	}	
		
	@Override
	public void actionPerformed(ActionEvent e) { //using the e parameter
		Object control = e.getSource();
			int index = 0;
		if (control == button) {
			
			index++;
			
			String fName = firstName.getText();
			String lName = lastName.getText();
			String disetxt = description.getText();
			//JOptionPane.showMessageDialog(null,"Hello, "+fName);
			cbtestBox.addItem(fName);
			
		}
		else {
		
		JOptionPane messagebox = new JOptionPane();
		String title = messagebox.showInputDialog(frame,"Set your title.","Title Setter",JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"Your title is "+title);
		frame.setTitle(title);
		}
	}	
		
	@Override
	public void stateChanged(ChangeEvent e) {
		int userAge = (Integer) ageSpinner.getValue(); //uses .getvalue to get the value of the spinner input
		//used a cast to convert into integer
		int targetAge = 25;
		if (userAge < targetAge) {
			
		int toTAge = targetAge - userAge;
		JOptionPane.showMessageDialog(frame, "you are "+toTAge+ " from being 25");
		}
		else {
			JOptionPane.showMessageDialog(frame, "you are past the target age.");
			return;
		}
		
	}	
		
}		
		