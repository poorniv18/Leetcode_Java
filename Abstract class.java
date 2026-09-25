public class Main{
    public static void main(String[] args){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        c.area();
        r.area();
        t.area();
    }
}
abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    void area(){
    double r=6;
    double area=3.14*r*r;
    System.out.println("Area of Circle:"+area);
    }
}
class Rectangle extends Shape{
    void area(){
    double l=6;
    double b=10;
    double area=l*b;
    System.out.println("Area of Rectangle:"+area);
}
}
class Triangle extends Shape{
    void area(){
        double h=10;
        double b=6.6;
        double area=0.5*h*b;
        System.out.println("Area of Triangle:"+area);
    }
}
