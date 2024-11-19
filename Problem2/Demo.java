package Problem2;

public class Demo {
    public static void main(String[] args) {
        
        //Test for Point class
        Point p1 = new Point(2.3f, 3.4f);
        System.out.println("Point: " + p1);

        p1.setXY(4.5f, 5.5f);
        System.out.println("Updated Point: " + p1);

        //Test for MovablePoint class
        MovablePoint mpoint1 = new MovablePoint(1.0f,2.0f,0.3f,0.4f);
        System.out.println("MovablePoint:" + mpoint1);

        mpoint1.move();
        System.out.println("Point after move: " + mpoint1 );

        mpoint1.setSpeed(1.0f, 1.3f);
        mpoint1.move();
        System.out.println("Point after move 2: " + mpoint1);
    }
}
