package game;
import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class board extends JPanel {
	Image img;
	Image img2;
	String location = "src/res/img/maxresdefault.jpg";
	
	
	private void loadImage() {
		ImageIcon ii = new ImageIcon(location);
		
		img = ii.getImage();
	}
	private void initBoard() {
		loadImage();
		int w = img.getWidth(this);
		int h = img.getHeight(this);
		setPreferredSize(new Dimension(w,h)); //setting size img as itself
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		//drawShape(g);
		g.drawImage(img, 0, 0, null);
	}
	private void drawShape(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY); //both help image quality
		g2d.setRenderingHints(rh);
		
		Dimension size = getSize();
		double w = size.getWidth();
		double h = size.getHeight();
		
		Ellipse2D e = new Ellipse2D.Double(0,0,80,130);
		QuadCurve2D q = new QuadCurve2D.Double(0,0,90,130,60,100);
		g2d.setStroke(new BasicStroke(1));
		g2d.setColor(Color.blue);
		//g2d.draw(at.createTransformedShape(e));
		//g2d.draw(at.createTransformedShape(q));
		
		for(double deg = 0; deg<360; deg+=5) {
			AffineTransform at = AffineTransform.getTranslateInstance(w/2,h/2);
			at.rotate(Math.toRadians(deg));
			g2d.draw(at.createTransformedShape(e));
		}
		
		
	}
	
	
	public board() {
		initBoard();
		
		
		
	}
	
}	
