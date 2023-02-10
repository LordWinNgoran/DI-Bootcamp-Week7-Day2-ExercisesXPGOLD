package exercise3;

//Exercise 3 :  Encapsulation Rectangle
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this example program, we will make a class Rectangle and declare the variable length and breadth as private.
* date: 08/02/2023
*/

public class Rectangle {
	 private int longeur;
	    private int largeur;

	    public Rectangle(int longeur, int largeur) {
	        this.longeur = longeur;
	        this.largeur = largeur;
	    }

		public int getLongeur() {
	        return longeur;
	    }

	    @Override
		public String toString() {
			return "Rectangle [longeur=" + longeur + ", largeur=" + largeur + "]";
		}

		public void setLongeur(int longeur) {
	        this.longeur = longeur;
	    }

	    public int getLargeur() {
	        return largeur;
	    }

	    public void setLargeur(int largeur) {
	        this.largeur = largeur;
	    }
}
