# DessinVectoriel
Projet d'architecture logicielle - Un langage de dessin vectoriel (membres : Baptiste Maillot, Micaël Mbagira, Thomas Moisy)


##Organisation du projet

````
├── README.md
├── Code
|   ├── dessin.svg #dessin généré après traduction SVG
│   ├── src
│   │   ├── builders      #builders de scripts
│   │   ├── dessin_vectoriel   #forme et elements d'un dessin vectoriel
│   │   ├── script        #scripts de dessin
│   │   ├── main          #classe de test
│   │   └── traducteurs   #implementation des traducteurs


````

##Langage
###Scripts
####Séquence
Pour entrer une liste d'instructions : 

1. Créer un SequenceBuilder avec `new SequenceBuilder()`
2. Ajouter des instructions en utilisant la fonction `add(Script s)`

####For
Cette instruction permet de créer une boucle d'itération qui exécutera des instructions un certain nombre de fois, donné en paramètre.  

1. Créer un ForBuilder avec `new ForBuilder()`
2. `to(int n)` permet de spécifier le nombre d'itérations
4. `variable(String s)` permet de spécifier l'identifiant de la boucle
5. Ajouter des instructions en utilisant la fonction `add(Script s)`


````java
new ForBuilder()
	.to(5)
	.variable("i")
	.add(...)
	.add(...)
````

####Affectation de variable entière 
Il est possible de mémoriser un entier dans une variable réutilisée plus tard.  
Ex : `new AffectationVariable("x", 1)`

####Affectation de variable de type Forme
De même, on peut mémoriser une forme dans une variable.  
Ex:   

````java
new AffectationFormeBuilder("f", new DessinerBuilder()
										.cercle()
										.centre(300, 500)
										.rayon(60)
										.couleur(Couleur.GREEN))
````


###Dessiner
####Couleur
Les couleurs disponibles sont les suivantes :   
`BLUE, GREEN, RED, YELLOW, PINK, ORANGE, BLACK, GREY, WHITE` et doivent être préfixée par `Couleur`. Ex: `Couleur.GREY`.

####Carré/Rectangle
````java
new RectangleBuilder()
	.hauteur(50)
	.longueur(60)
	.barycentre(250,250)
	.couleur(Couleur.YELLOW)
	.epaisseur(20)
	.script()
````

####Cercle
````java
new DessinerBuilder()
	.cercle()
	.centre(105, 45)
	.rayon(30)
	.couleur(Couleur.RED)
	.script()

````

####Chemin
On peut dessiner un chemin en utilisant les courbes de Bézier.

- `depart(int x, int y)` permet de spécifier le point de départ du chemin
- `add(cx, cy, x, y)` permet d'ajouter un point de contrôle et un point d'arrivée autant de fois que voulu.


````java
new CheminBuilder()
		.depart(10,150)
		.add(100,20,180,180)
		.add(260,40,280,120)
		.add(310,80,310,190)
		.couleur(Couleur.RED)
		.script()
````

####Liste de points
On peut aussi entrer une liste de points qui sera interprétée en affichant des droites reliant les points deux à deux.

````java
new ListePointsBuilder()
		.point(0,0)
		.point(200,200)
		.point(400,300)
		.couleur(Couleur.BLUE)
		.script()
````

###Remplir
Il est possible de remplir une forme après l'avoir selectionné. Il faut donc que la forme ait été au préalable mémorisée dans une variable. 

````java
new RemplirBuilder()
	.selectionne("f")
	.couleur(Couleur.GREEN)
	.script()
````
###Etiqueter
De la mêem manière, il est possible d'étiqueter une forme.

````java
new EtiqueterBuilder()
		.couleur(Couleur.GREEN)
		.epaisseur(1)
		.orientation(Orientation.NORTH)
		.texte("R=10")
		.etiqueter("f")
		.position(Point.creer(300, 300))
		.script()
````	

##Test
Pour tester un exemple déjà construit, executer la classe `Main.java`.

###Traducteur SVG
Après exécution de la classe `Main`, le dessin est traduit en SVG dans un fichier de trouvant dans `Code/dessin.svg`. Ouvrir dans un navigateur.

###Traducteur Java2D
Une fenêtre graphique Java2D s'ouvre.