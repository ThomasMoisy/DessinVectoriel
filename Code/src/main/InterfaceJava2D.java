package main;

import javax.swing.JFrame;

import dessin_vectoriel.Image;

public class InterfaceJava2D extends JFrame{
	
	private Image image;
	
	public InterfaceJava2D(Image image) {
	// TODO Auto-generated constructor stub
		super("Interface Visualisation Java2D");
		this.image=image;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(new DessinJava2D(image));
		this.setVisible(true);
		this.pack();
	}
	
}
