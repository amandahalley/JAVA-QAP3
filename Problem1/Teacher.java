package Problem1;

public class Teacher extends Person {

protected String mySubject; //Subject taught
protected double mySalary; //Teachers salary

public Teacher (String name, int age, String gender, String subject, double salary) {
    //super class constructor
    super(name, age, gender);

    //Initialize what is new to Teacher
    mySubject = subject;
    mySalary = salary;

}
    //Getters
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    //Setters
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    //Print format

    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + mySalary + ", Subject: " + mySubject;
    }



    
}
