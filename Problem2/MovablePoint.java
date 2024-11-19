package Problem2;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    //parameterized constructor 
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //No-argument constructor
    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    //parameterized constructor to initialize movablepoint with specifc speed and coordinates
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y); //calling point class (parent) to set x & y
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    //Getters


    //Setters


    //toString
}
