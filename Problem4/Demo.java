package Problem4;

public class Demo {
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
        System.out.println();
        System.out.println("Shapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        // Create an array of shapes implementing Scalable
        Scalable[] shapes = {
            new Circle(10),
            new Ellipse(8,5),
            new Triangle(2,3,4),
            new EquilateralTriangle(4)
        };

        // Test scaling with a factor of 2
        scaleShapes(shapes, 2);
    }
}