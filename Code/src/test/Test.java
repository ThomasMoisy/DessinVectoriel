package test;


import builders.DessinerBuilder;
import builders.ForBuilder;
import builders.PointsBuilder;
import builders.SequenceBuilder;
import dessin_vectoriel.Image;
import script.Script;


public class Test {
	public static void main(String[] args) {
		Script script = 
			new SequenceBuilder()
				.add(new DessinerBuilder()
						.cercle()
						.centre(0, 0)
						.rayon(2)
						.couleur(9)
						.script())
				.add(new PointsBuilder()
						.point(0,0)
						.point(3,7)
						.point(2,1)
						.couleur(2)
						.script())
				.add(new ForBuilder()
						.to(3)
						.variable("i")
						//.add(new PointsBuilder()
						//		.point(new Variable("i"), new Entier(3)))
						.add(new DessinerBuilder()
								.triangle()
								.point1(0,0)
								.point2(1,1)
								.point3(2,0)
								.couleur(6)
								.script())
						.script())
				.script();
		//Exécution du script qui va créer un objet de type Image qui sera notre dessin vectoriel
		Image image = script.executer(new Image());
		System.out.println(image.getElements());
		
		
		//Fabrique fab = new FabriqueSVG();
		//fab.traduire(script)
		
		
	}
}
