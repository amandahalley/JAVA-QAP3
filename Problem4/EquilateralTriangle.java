package Problem4;

public class EquilateralTriangle extends Shape {
    private double side;

    // Constructor initializes equilateral triangle with given side
    public EquilateralTriangle(double side) {
        //call super class, pass in name 
        super("EquilateralTriangle");
        this.side = side;
    }

    // Calculate the perimeter of the triangle
    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    // Calculate the area of the triangle.
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Interface to adjust the size of the triangle.
    @Override
    public void scale(double factor) {
        side *= factor;
    }
}
