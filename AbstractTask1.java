abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double perimeter(){
        double pi = 3.14;
        return (2 * pi * radius) ; 
    }
    double area(){
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double perimeter(){
        return (2 * (length + breadth)) ; 
    }
    double area(){
        return length * breadth;
    }
}



public class AbstractTask1{
    public static void main(String args[]){
        Shape s = new Circle(4);
        Shape r = new Rectangle(12.45, 13.34);

        System.out.println("Area and Perimeter of Circle is : " + s.area() + "  " + s.perimeter());
        System.out.println("Area and Perimeter of rectangle is : " + r.area() + "  " + r.perimeter());
    }
    
}
