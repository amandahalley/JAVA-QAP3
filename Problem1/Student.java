package Problem1;

class Student extends Person {
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa)  {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }    

    //Getters
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    //Setters
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGpa(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
 }
    