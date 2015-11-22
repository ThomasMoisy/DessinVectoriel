package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

import dessin_vectoriel.Image;
import traducteurs.Traducteur;
import traducteurs.TraducteurJAVA;

public class DessinJava2D extends JPanel{
	
	private Image image;
	
	public DessinJava2D(Image image) {
		// TODO Auto-generated constructor stub
		super();
		this.image=image;
		this.setSize(600,600);
		this.setPreferredSize(new Dimension(600,600));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2= (Graphics2D)g;
		TraducteurJAVA trad = new TraducteurJAVA(g2);
		super.paintComponent(trad.getG());
		trad.traduire(image);
	}
}
