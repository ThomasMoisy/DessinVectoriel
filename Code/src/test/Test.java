package test;


import builders.AffectationFormeBuilder;
import builders.DessinerBuilder;
import builders.EtiqueterBuilder;
import builders.ForBuilder;
import builders.ListePointsBuilder;
import builders.RemplirBuilder;
import builders.SequenceBuilder;
import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Image;
import dessin_vectoriel.Orientation;
import script.AffectationVariable;
import script.Script;



public class Test {
	public static void main(String[] args) {
		Script script;
		try {
			script = new SequenceBuilder()
				.add(new DessinerBuilder()
						.cercle()
						.centre(0, 0)
						.rayon(2)
						.couleur(Couleur.ROUGE)
						.script())
				.add(new ListePointsBuilder()
						.point(0,0)
						.point(3,7)
						.point(2,1)
						.couleur(Couleur.BLEU)
						.script())
				.add(new ForBuilder()
						.to(2)
						.variable("i")
						.add(new ListePointsBuilder()
								.point("i", 3)
								.point(1, 2))
						.add(new DessinerBuilder()
								.triangle()
								.point1(0,0)
								.point2(1,1)
								.point3(2,0)
								.couleur(Couleur.ROSE))
						.script())
				.add(new AffectationVariable("x", 1))
				.add(new AffectationVariable("y", 2))
				.add(new DessinerBuilder()
						.triangle()
						.point1(0,"x")
						.point2("y", "y")
						.point3(1, 3)
						.couleur(Couleur.BLANC)
						.script())
				.add(new AffectationFormeBuilder("f", new DessinerBuilder()
												.cercle()
												.centre(3, 5)
												.rayon(6)
												.couleur(Couleur.NOIR))
						.script())
				.add(new RemplirBuilder()
						.selectionne("f")
						.couleur(Couleur.VERT)
						.script())
				
			.add(new EtiqueterBuilder()
					.etiqueter("f")
					.couleur(Couleur.VERT)
					.epaisseur(10)
					.orientation(Orientation.NORTH)
					.script())
			.script();
			//Exécution du script qui va créer un objet de type Image qui sera notre dessin vectoriel
			Image image = script.executer(new Image());
			System.out.println(image.getElements());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Fabrique fab = new FabriqueSVG();
		//fab.traduire(script)
		
		
	}
}
