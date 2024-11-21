package Problem3;

public class Demo {
    public static void main(String[] args) {
        
    //Testing classes
    Circle circle = new Circle(5.0);
    System.out.println(circle);

    Ellipse ellipse = new Ellipse(3, 4);
    System.out.println(ellipse);
    
    Triangle triangle = new Triangle(3,4,5);
    System.out.println(triangle);

    try{
        Triangle triangle2 = new Triangle(2,2,6);
        System.out.println(triangle2);
    } catch (IllegalArgumentException e) {
        System.out.println("Error:" + e.getMessage());
    }
    
    EquilateralTriangle eTriangle = new EquilateralTriangle(2);
    System.out.println(eTriangle);


    //Create array of Shape objects 
   Shape[] shapes = new Shape[4];

   //Initialize array, with the different shape
   shapes[0] = new Circle(10);
   shapes[1] = new Ellipse(8,5);
   shapes[2] = new Triangle(2,3,4);
   shapes[3] = new EquilateralTriangle(4);

   //Loops through array and prints the shapes details
   for (Shape shape : shapes) {
    System.out.println(shape);
   }

 }    
}
