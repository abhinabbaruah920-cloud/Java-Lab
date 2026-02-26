import java.util.*;
public class Shape{
    void area(){

    }
}

class Square extends Shape{
    double side;
    Square(double s){
        side=s;
    }
    @Override
    void area(){
        double result = side*side;
        System.out.println("Area of square: "+result);

    }
}

class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double l, double b){
        length=l;
        breadth=b;
    }
    @Override
    void area(){
        double result =length*breadth;
        System.out.println("Area of Rectangle: "+result);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    @Override
    void area(){
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle: "+result);
    }
}


@SuppressWarnings("unused")
class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the side of the square: ");
            double s = sc.nextDouble();

            System.out.println("Enter the length and breadth of the rectangle: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println("Enter the radius of the circle: ");
            double r = sc.nextDouble();

            Shape sq = new Square(s);
            Shape rect = new Rectangle(l, b);
            Shape circ = new Circle(r);

            sq.area();
            rect.area();
            circ.area();
        }
    }
}