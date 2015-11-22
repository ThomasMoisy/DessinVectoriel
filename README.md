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

##Test
Pour tester, executer la classe `Main.java`.

###Traducteur SVG
Après exécution de la classe `Main`, le dessin est traduit en SVG dans un fichier de trouvant dans `Code/dessin.svg`. Ouvrir dans un navigateur.