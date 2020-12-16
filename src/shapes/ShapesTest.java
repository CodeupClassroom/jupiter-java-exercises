package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Square box2 = new Square(5);

        Measurable myShape;
        myShape = box1;
        System.out.println("Rectangle permiter is: " + myShape.getPerimeter());
        System.out.println("Rectangle area is: " + myShape.getArea());
        myShape = box2;
        System.out.println("Square permiter is: " + myShape.getPerimeter());
        System.out.println("Square area is: " + myShape.getArea());

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}
