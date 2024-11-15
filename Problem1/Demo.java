package Problem1;

public class Demo {
    public static void main(String[] args) {

        //Test for Person Class
        Person amanda = new Person("Amanda Halley", 26, "F");
        System.out.println(amanda);

        //Test for Student Class
        Student carson = new Student("Carson Thorne", 30, "M", "J283789", 3.5);
        System.out.println(carson);

        Teacher george = new Teacher("Mr. George", 32, "M", "Chemistry", 50000);
        System.out.println(george);

        CollegeStudent lauren = new CollegeStudent("Lauren Drohan", 26, "F", "J394284", 4, "Communications", 2);
        System.out.println(lauren);
    }

}
