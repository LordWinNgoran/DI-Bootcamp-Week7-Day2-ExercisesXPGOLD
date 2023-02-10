//Exercise 2 : Encapsulation Test
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create class Number
* Set one field as private in the class Number. So, the field 
* can be accessed only within the class and no one can access it from outside the class.
* date: 08/02/2023
*/
package exercise2;

public class Number {

	 private int nombre;

	    public Number(int nombre) {
	        this.nombre = nombre;
	    }

	    public int getNombre() {
	        return nombre;
	    }

	    public void setNombre(int nombre) {
	        this.nombre = nombre;
	    }
}
