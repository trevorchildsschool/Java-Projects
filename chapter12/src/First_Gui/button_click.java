package First_Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Calendar;



public class button_click implements ActionListener{
	JFrame clickFrame;
	FlowLayout flowLayout;
	JLabel instructions_lbl;
	JButton button;
	JLabel time;
	int num_clicks = 0;
	JButton button10;
	JButton button50;
	public button_click() {
		clickFrame = new JFrame();
		flowLayout = new FlowLayout();
		clickFrame.setLayout(flowLayout);
		clickFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		clickFrame.setTitle("CLICKER");
		clickFrame.setSize(1920,1080);
		clickFrame.setLocation(0,0);
		
		instructions_lbl = new JLabel();
		instructions_lbl.setText("Click the button ");
		button = new JButton();
		button.addActionListener(this); 
		instructions_lbl.setText(Integer.toString(num_clicks));
		button.setText("1 Clicks");
		
		time = new JLabel();
		button10 = new JButton();
		button50 = new JButton();
		
		
		clickFrame.add(instructions_lbl);
		clickFrame.add(button);
		clickFrame.add(button10);
		clickFrame.add(button50);
		
		clickFrame.setVisible(true);
		
	}

	public static void main(String[] args) {

		new button_click();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		num_clicks ++;
		button.setText("Clicks = "+Integer.toString(num_clicks));
		if (num_clicks>=5){
			clickFrame.getContentPane().setBackground(Color.RED);
		}
		if (num_clicks>=10){
			clickFrame.getContentPane().setBackground(Color.BLUE);
		}
		if (num_clicks>=15){
			clickFrame.getContentPane().setBackground(Color.GREEN);
		}
		if (num_clicks>=20){
			clickFrame.getContentPane().setBackground(Color.ORANGE);
		}
		if (num_clicks>=25){
			clickFrame.getContentPane().setBackground(Color.CYAN);
		}
		if (num_clicks>=30){
			clickFrame.getContentPane().setBackground(Color.YELLOW);
		}
		if (num_clicks>=35){
			clickFrame.getContentPane().setBackground(Color.PINK);
		}
		if (num_clicks>=40){
			clickFrame.getContentPane().setBackground(Color.GREEN);
		}
		if (num_clicks>=45){
			clickFrame.getContentPane().setBackground(Color.YELLOW);
		}
		if (num_clicks>=50){
			clickFrame.getContentPane().setBackground(Color.CYAN);
		}
		if (num_clicks>=55){
			clickFrame.getContentPane().setBackground(Color.BLUE);
		}
		if (num_clicks>=60){
			clickFrame.getContentPane().setBackground(Color.RED);
		}
		if (num_clicks>=65){
			clickFrame.getContentPane().setBackground(Color.ORANGE);
		}
		if (num_clicks>=70){
			clickFrame.getContentPane().setBackground(Color.GREEN);
		}
		if (num_clicks>=75){
			clickFrame.getContentPane().setBackground(Color.YELLOW);
		}
		if (num_clicks>=80){
			clickFrame.getContentPane().setBackground(Color.RED);
		}
		if (num_clicks>=85){
			clickFrame.getContentPane().setBackground(Color.BLUE);
		}
		if (num_clicks>=90){
			clickFrame.getContentPane().setBackground(Color.PINK);
		}
		if (num_clicks>=95){
			clickFrame.getContentPane().setBackground(Color.RED);
		}
		if (num_clicks>=100){
			clickFrame.getContentPane().setBackground(Color.ORANGE);
			button.setVisible(false);
			JOptionPane.showMessageDialog(null, "YOU REACHED 100 at "+Calendar.getInstance().getTime());
			clickFrame.dispatchEvent(new WindowEvent(clickFrame, WindowEvent.WINDOW_CLOSING));
		}
		
	}

}
