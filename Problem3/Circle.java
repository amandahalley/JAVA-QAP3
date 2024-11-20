package Problem3;

public class Circle extends Shape {
    private double radius;


    //Constructor 
    public Circle(double radius) {
        // call constructor of Shape (super class) to set the name to circle
        super("Circle");
        //assign radius to instance variable
        this.radius = radius;
    }

    //implements formula to calculate perimeter of a circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //implements formula to caluclate the area of a circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
