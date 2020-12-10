package shapes;

public class Circle {
    private double radius;
    private static int circleCount = 0;

    public Circle(double rad){
        this.radius = rad;
        circleCount++;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getCircleCount(){
        return circleCount;
    }
}
