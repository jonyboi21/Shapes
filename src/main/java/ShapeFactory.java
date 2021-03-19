import shapes.Circle;
import shapes.Triangle;

public class ShapeFactory {

    public static void main(String[] args) {
        Triangle triangle = new Triangle( 3.0, 4.0 );
                triangle.getside();
        triangle.setSide(60.0);
        System.out.println(triangle.getside());
        System.out.println(triangle);



        Circle circle = new Circle(35);
        circle.getRadius();

        System.out.println(circle.getRadius());
        System.out.println(circle);
    }
}
