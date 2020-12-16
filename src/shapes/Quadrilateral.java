package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    // Properties
    protected double length;
    protected double width;


    // Constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement Override Methods
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    // Implement these setters in a class that extends this abstract class
    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    // Implement these setters in a class that extends this abstract class
    public abstract void setWidth(double width);

}
