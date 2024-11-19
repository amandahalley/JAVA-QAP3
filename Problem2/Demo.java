package Problem2;

public class Demo {
    public static void main(String[] args) {
        
        //Test for Point class
        Point p1 = new Point(2.3f, 3.4f);
        System.out.println("Point: " + p1);

        p1.setXY(4.5f, 5.5f);
        System.out.println("Updated Point: " + p1);
    }
}
