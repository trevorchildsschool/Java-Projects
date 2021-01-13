package game;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;



public class application extends JFrame {
	int width = 1920;
	int height = 1080;
	String title = "shark pog";
	
	public application() {
	
		initUI(); //call to init user interface
	
	}

	private void initUI() {
		
		add(new board());
		
		setSize(width,height);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pack();
		
		
		
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(()->{
			application ex = new application();
			
			ex.setVisible(true);
		});

	}

}
