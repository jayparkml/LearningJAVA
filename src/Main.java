import java.util.Scanner; // Import to use the scanner

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);

        int inputtedNum = input.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
            //print out "Enjoy the good luck a friend brings you"
        } else {
            //print out ""
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}
