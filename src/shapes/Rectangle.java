package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double length;
    protected double width;

    public Rectangle(double l, double w){
        // this.length = l;
        // this.width = w;
        // Use the super class' constructor
        super(l, w);
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    // Setters that were defined abstract in the abstract class "Quadrilateral"
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
}
