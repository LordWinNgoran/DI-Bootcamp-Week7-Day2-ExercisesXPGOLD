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

public class Line {
	 private Point begin;
	    private Point end;

	    public Line(int x1, int y1, int x2, int y2) {
	        this.begin = new Point(x1, y1);
	        this.end = new Point(x2, y2); 

	    }

	    public Line(Point begin, Point end) {
	        this.begin = begin;
	        this.end = end;
	    }

	    public Point getBegin() {
	        return this.begin;
	    }

	    public void setBegin(Point begin) {
	        this.begin = begin;
	    }

	    public Point getEnd() {
	        return this.end;
	    }

	    public void setEnd(Point end) {
	        this.end = end;
	    }

	    public int getBeginX(){
	        return this.begin.getX();
	    }

	    public int getBeginY(){
	        return this.begin.getY();
	    }

	    public void setBeginX(int x){
	        this.begin.setX(x) ;
	    }

	    public void setBeginY(int y){
	        this.begin.setY(y) ;
	    }

	    public int[] getBeginXY(){
	        return this.begin.getXY();
	    }



	    public int getEndX(){
	        return this.end.getX();
	    }

	    public int getEndY(){
	        return this.end.getY();
	    }

	    public void setEndX(int x){
	        this.end.setX(x) ;
	    }

	    public void setEndY(int y){
	        this.end.setY(y) ;
	    }

	    public int[] getEndXY(){
	        return this.end.getXY();
	    }

	    public void setEndXY(int x, int y){
	        this.end.setXY(x,y);
	    }

	    public String toString() {
	        return "Line[" +
	                "begin=(" + getBeginX() +"," + getBeginY() +"), end =(" + getEndX() + "," + getEndY() + ")]";
	    }

	    public double getLenght(){
	        return begin.distance(end);
	    }
}
