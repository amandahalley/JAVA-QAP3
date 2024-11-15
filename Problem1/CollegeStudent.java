package Problem1;

public class CollegeStudent extends Student {
    protected String myMajor; //Major of College Student
    protected int myYear; //Current year in attendance (FROSH = 1,  SOPH = 2, …)

    public CollegeStudent(String name, int age, String gender, String idNum, int GPA, String major, int year) {
        //super class constructor (calling Student)
        super(name, age, gender, idNum, GPA); 

        //Initialize new info to CollegeStudent
        myMajor = major;
        myYear = year;
        
    }


}
