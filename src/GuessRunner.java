import java.util.Scanner;

public class GuessRunner {
    public static void main(String[] args) {
        System.out.println("GuessMyNumber is running!");

        // Ask the user for their number
        // and store it in an int variable
        while (true) {
            System.out.println("Please enter a number between 0 and 10");
            int userNumber = -1;
            try {
                Scanner inputScanner = new Scanner(System.in);
                userNumber = Integer.valueOf(inputScanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("You must use numbers");
                continue;
            }
            try {
                if (!(userNumber > 0 && userNumber < 11)){
                    throw new Exception();
                }
            } catch(Exception ex) {
                System.out.println("you must use a number between 0-10.");
                continue;
            }
            System.out.println("You entered: " + userNumber);

            // Generate a random number between 0 and 10
            // and store it in another int variable
            int computerNumber = (int) (Math.random() * 10);
            System.out.println("Computer generated: " + computerNumber);

            // Compare the two and display who won
            if (userNumber > computerNumber) {
                System.out.println("You win!");
            } else {
                System.out.println("I win!");
            }

            System.out.println("Thank you for playing!");
        }
    }
}
