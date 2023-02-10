//Exercise 1 : The Point And Line Classes
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:As an example of reusing a class via composition, suppose that we have an existing class called Point, 
* defined as shown in the above class diagram. The source code is HERE.
* Suppose that we need a new class called Line, we can design the Line class by re-using the Point class via composition. 
* We say that “A line is composed of two points”, or “A line has two points”. Composition exhibits a “has-a” relationship.
* date: 08/02/2023
*/
package exercise1;

public class Point {
	private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Point("+ x + "," + y +")";
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
    }

    public double distance(Point another){
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2)) ;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2)) ;
    }
}
