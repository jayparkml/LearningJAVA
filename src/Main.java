import java.util.Scanner; // Import to use the scanner

public class Main {

    public static void main(String[] args) {
        String question = "What is 1 * 2? ";
        String choiceOne = "one";
        String choiceTwo = "two";
        String choiceThree = "three";
        boolean getAnswerWrong = true;

        String correctAnswer = choiceTwo;

        System.out.println(question);

        Scanner input = new Scanner(System.in);



        while (getAnswerWrong) {
            String uinput = input.next();
            if (uinput.toLowerCase().equals(correctAnswer)) { //.equals = case sensitive so make all lowercase
                System.out.println("Congratulation!!");
                getAnswerWrong = false;
            } else {
                System.out.println("Try again");
            }
        }


        ////////////////////////////////////////////////////
//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//
//        while (isOnRepeat) {
//            System.out.println("Playing current song");
//            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
//            String userInput = input.next();
//            if (userInput.equals("yes")) { //equals = string operation
//                isOnRepeat = false;
//            }
//
//        }
//        System.out.println("Playing next song");







        ///////////////////////////////////////////////////////////////////////////
//        System.out.println("Pick a number between 1 and 10");
//        Scanner input = new Scanner(System.in);
//
//        int inputtedNum = input.nextInt();
//
//        if (inputtedNum < 5) {
//            System.out.println("Enjoy the good luck a friend brings you");
//            //print out "Enjoy the good luck a friend brings you"
//        } else {
//            //print out ""
//            System.out.println("Your shoe selection will make you very happy today");
//        }
    }
}
