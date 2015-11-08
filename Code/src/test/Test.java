package test;


import builders.DessinerBuilder;
import builders.ForBuilder;
import builders.ListePointsBuilder;
import builders.SequenceBuilder;
import dessin_vectoriel.Image;
import script.For;
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
						.couleur(9)
						.script())
				.add(new ListePointsBuilder()
						.point(0,0)
						.point(3,7)
						.point(2,1)
						.couleur(2)
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
								.couleur(6))
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
