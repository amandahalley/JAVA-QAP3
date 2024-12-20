package Problem2;

public class Point {
    private float x; //x coordinate
    private float y; //y coordinate

    //Parameterized constructor 
    public Point(float x, float y) {
    this.x = x;
    this.y = y;
    }

    //No-argument constructor
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    //Getters for x & y
    public float getX() {
        return x;
    }

    public float getY() { 
        return y;
    }

    //Setters for x & y
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y =y;
    }

    //Getter to retrieve both x and y
    public float[] getXY() {
        return new float[]{x, y};
    }

    //Setter to update both x & y
    public void setXY(float x , float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
