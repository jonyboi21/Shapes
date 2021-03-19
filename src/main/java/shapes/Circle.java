package shapes;

public class Circle {


    //ivars
    private double radius;

    public Circle( double radius){
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

public void setRadius(double v){
        this.radius = radius;

}

public void calculateArea(){
        double pi = 3.14;
        double Area = (radius * radius) * pi;
    System.out.println("This area is " + Area);
}












}
