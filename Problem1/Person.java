package Problem1; 

public class Person {

    //Attributes
    protected String myName; 
    protected int myAge;
    protected String myGender; 


    //Constructor 
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    //Getters 
    public String getNmae() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    //Setters
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }


    //toString method for print format
}