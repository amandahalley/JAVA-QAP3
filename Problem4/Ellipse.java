package Problem4;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    //Constructor
    public Ellipse(double a, double b) {
        // call superclass constructor to set the name
        super("Ellipse");
        //To assign largest value to majorAxis always
        if (a > b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    //Formula to calculate perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2) - Math.pow(majorAxis - minorAxis, 2) / 2);
    }

    //Formula to calculate area 
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    //implements scale method
    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}
