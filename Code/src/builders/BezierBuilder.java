package builders;

import java.util.ArrayList;
import java.util.List;

import script.Dessiner;
import script.Script;
import dessin_vectoriel.Bezier;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;

public class BezierBuilder extends FormeBuilder{
	Point depart;
	Point arrivee;
	Point controle;

	@Override
	public Element getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Script script() throws Exception {
		//cree une courbe de bezier avec les bons parametres
		Bezier bezier = new Bezier(true, couleur, epaisseur, depart, arrivee, controle);
		//ajoute cette courbe a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(bezier);
		//retourne l'instruction Dessiner
		return new Dessiner(list);
	}
	
	public BezierBuilder couleur(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}

	public BezierBuilder depart(int i, int j) {
		depart = new Point(true, Couleur.BLACK, 1, i, j);
		return this;
	}
	
	public BezierBuilder arrivee(int i, int j) {
		arrivee = new Point(true, Couleur.BLACK, 1, i, j);
		return this;
	}
	
	public BezierBuilder controle(int i, int j) {
		controle = new Point(true, Couleur.BLACK, 1, i, j);
		return this;
	}

}
