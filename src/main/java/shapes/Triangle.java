package shapes;

public class Triangle {
    private double base;
    private double side;


//ivars

    public Triangle(double side, double base){
        this.base = base;
        this.side = side;
    }

    //contructor

    public double getside(){
    return side;
    }

    public void setSide(double side){
        this.side = side;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public  void calculatePerimeter(){
        double perimeter = side + base + side;
        System.out.println(("this Perimeter is " + perimeter));


}






}










//}
//
//
//    private Triangle(int width) {
//        this.width = width;
//    }
//
//    public Triangle(int width, int height){
//        this.width = width;
//        this.height = height;
//        this.base = base;
//
//
//
//
//
//
//    }
//
//
//    public void calcArea() { System.out.println(this.width * this.height * this.base);}
//}
//
//
//    }
//}
