package shapes;

import org.w3c.dom.css.Rect;

public class Square extends Rectangle {
    public Square(double side){
        super(side,side);
    }

    public double getArea(){
        System.out.println("Square implementation of area");
        return length * length;
    }

    public double getPerimeter(){
        System.out.println("Square implementation of perimeter");
        return 4 * length;
    }
}
