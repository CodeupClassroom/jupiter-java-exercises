package shapes;

import org.w3c.dom.css.Rect;

public class Square extends Quadrilateral {
    public Square(double side){
        super(side,side);
    }

    // Constructor

    public double getArea(){
        System.out.println("Square implementation of area");
        return length * length;
    }

    public double getPerimeter(){
        System.out.println("Square implementation of perimeter");
        return 4 * length;
    }

    // Setters for the width and length (Quadrilateral abstract class says we have to define these here)
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
}
