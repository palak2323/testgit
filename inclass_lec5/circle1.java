/*1.Create a class Circle with instance variable radius and member functions:
a)area( ) b) circumference( ) c) display( ). Write a test application named CircleTest that demonstrates class Circle’s capabilities. (15 minutes)

Definition of Done:
a)One java files to be defined. Both the class definitions to be included in the same file.
b)The Circle class definition should have the following functions:
i.Non-parameterized constructor with default values set to: 1
ii.Parameterized constructor with user defined radius
iii.Methods: area ( ), circumference( ) and Display( )
iv.Make use of this keyword wherever applicable*/



import java.util.*;
class Circle {

     final double PI = 3.14159;
     double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }

    double getDiameter() {
        return radius * 2;
    }

    double getCircumference() {
        return 2 * PI * radius;
    }
    public static void main(String args[]) {

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Ask user to input circle radius
    System.out.print("Enter the radius of a circle: ");
    double radius = keyboard.nextDouble();

   Circle ob;
   ob = new Circle(radius);
    // Create a Circle object passing in user input
   // circle1 circle = new circle1();
   // circle1 circle = circleClass.new Circle(radius);

    // Display circle information
    System.out.println("Area is " + ob.getArea());
    System.out.println("Diameter is " + ob.getDiameter());
    System.out.println("Circumference is " + ob.getCircumference());
}
class circle1{


}
}