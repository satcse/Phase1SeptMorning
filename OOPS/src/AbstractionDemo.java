abstract class Shape
{
    String color; // Concrete variable
    abstract double area();
    public abstract String toString();
    public Shape()
    {

    }
    public Shape(String color)
    {
        System.out.println("Constructor called...");
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
}
class Circle extends Shape{
    double radius;

    public Circle(String color, double radius)
    {
        super(color); //Invoke Line No:10
        System.out.println("Circle Constructor Called...");
        this.radius=radius;

    }
    @Override
    double area() {
        return Math.PI*Math.pow(radius,2); // Pi * R^2
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color + " and area is : " + area();
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color, double length, double width)
    {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color +
                " and area is : " + area();
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",2.3);
        Shape s2 = new Rectangle("Yellow",2,5);
        System.out.println("Output: "+s1.toString());
        System.out.println("Output: "+s2.toString());
    }
}
