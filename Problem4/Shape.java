package Problem4;

//Abstract class that implements Scalable interface  
public abstract class Shape implements Scalable {
    protected String name;
    
    //Constructor, initializing shapes name
    public Shape(String name) {
        this.name = name;
    }

    //Abstract methods for calculating area and perimeter of shapes
    //These methods should be used by any subclass of this Shape class
    public abstract double getPerimeter();

    public abstract double getArea();

    //toString method to give representation of the shape
    @Override
    public String toString() {
        return "Shape: " + name + " Perimeter: " +getPerimeter() + " Area: " + getArea();
    }
}

