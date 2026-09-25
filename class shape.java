class Shape {
    void show() {
        System.out.println("There are many shapes:");
    }
}

class Rectangle extends Shape {
    void Area() {
        int l = 10, b = 5;
        int area = l * b;
        System.out.println("Area of the Rectangle: " + area);
    }
}

class Circle extends Shape {
    void Area() {
        int r = 6;
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.show();

        Rectangle r = new Rectangle();
        r.Area();

        Circle c = new Circle();
        c.Area();
    }
}