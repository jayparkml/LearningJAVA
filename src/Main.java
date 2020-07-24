import java.util.Scanner; // Import to use the scanner

public class Main {

    public static void main(String[] args) {
//        int studentAge = 15;
        double studentGPA = 3.78;
        String studentFirstName = "Sungju";
        String studentLastName = "Park";
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);
//        boolean hasPerfectAttendance = true;


//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName +
                " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to? ");

        Scanner input = new Scanner(System.in); //new scanner for system.in for users input
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of "
         + studentGPA);

    }
}