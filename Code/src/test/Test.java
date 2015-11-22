package test;



import builders.AffectationFormeBuilder;
import builders.BezierBuilder;
import builders.CheminBuilder;
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
import traducteurs.Traducteur;
import traducteurs.TraducteurSVG;



public class Test {
	public static void main(String[] args) {
		Script script;
		try {
			script = new SequenceBuilder()
				.add(new DessinerBuilder()
						.cercle()
						.centre(105, 45)
						.rayon(30)
						.couleur(Couleur.RED)
						.script())
				.add(new ListePointsBuilder()
						.point(0,0)
						.point(3,7)
						.point(2,1)
						.couleur(Couleur.BLUE)
						.script())
				.add(new ForBuilder()
						.to(2)
						.variable("i")
						.add(new ListePointsBuilder()
								.point("i", 3)
								.point(1, 2))
						.add(new DessinerBuilder()
								.triangle()
								.point1(10,12)
								.point2(80,67)
								.point3(60,180)
								.couleur(Couleur.PINK))
						.script())
				.add(new AffectationVariable("x", 1))
				.add(new AffectationVariable("y", 2))
				.add(new DessinerBuilder()
						.triangle()
						.point1(0,"x")
						.point2("y", "y")
						.point3(1, 3)
						.couleur(Couleur.WHITE)
						.script())
				.add(new AffectationFormeBuilder("f", new DessinerBuilder()
												.cercle()
												.centre(3, 5)
												.rayon(6)
												.couleur(Couleur.BLACK))
						.script())
				.add(new RemplirBuilder()
						.selectionne("f")
						.couleur(Couleur.GREEN)
						.script())
<<<<<<< HEAD
				.add(new EtiqueterBuilder()
						.couleur(Couleur.GREEN)
						.epaisseur(1)
						.orientation(Orientation.NORTH)
						.texte("R=10")
						.etiqueter("f")
						.script())
=======
				.add(new EtiqueterBuilder().couleur(Couleur.GREEN).epaisseur(1).orientation(Orientation.NORTH))
				.add(new CheminBuilder()
					.add(new BezierBuilder()
								.depart(10,150)
								.arrivee(180,180)
								.controle(100,20)
								.script())
					.add(new BezierBuilder()
						.depart(180,180)
						.arrivee(280,120)
						.controle(260,40)
						.script())
					.script())
>>>>>>> 90693998ec440afd2b42aa8726ad82ac85897de6
				
			/*.add(new EtiqueterBuilder()
					.etiqueter("f")
					.couleur(Couleur.VERT)
					.epaisseur(10)
					.orientation(Orientation.NORTH)
					.script())*/
			.script();
			
			//Exécution du script qui va créer un objet de type Image qui sera notre dessin vectoriel
			Image image = script.executer(new Image());
			System.out.println(image.getElements());
			
			//Traduction SVG
			TraducteurSVG traducteurSVG = new TraducteurSVG();
			traducteurSVG.traduire(image);
			traducteurSVG.save();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Fabrique fab = new FabriqueSVG();
		//fab.traduire(script)
		
		
	}
}
