package Problem3;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side); //call constructor of superclass (triangle) to obtain sides
        name = "Equilateral Triangle"; //asign name to shape
    }
}
