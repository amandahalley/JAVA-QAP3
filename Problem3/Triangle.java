package Problem3;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    //Constructor
    public Triangle(double side1, double side2, double side3) {
        //Call superclass constructor to asssign name of shape
        super("Triangle");
        //validate side input meets triangle inequality
        // sum of any 2 sides must be greater then the third side
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            //Error if sides are invalid
            throw new IllegalArgumentException("Sides of triangle are invalid.");
        }
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double getArea(){
        //calculate semi-perimeter of triangle for area formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}
