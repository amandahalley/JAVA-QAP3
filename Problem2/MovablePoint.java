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
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    //Setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //getter and setter for both speeds 
    
    //Gets both x and y speed as an array
    public float[] getSpeed() { 
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //To move point by updating coordinates based on speed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    //toString
    @Override
    public String toString() {
        return 
    }
}
