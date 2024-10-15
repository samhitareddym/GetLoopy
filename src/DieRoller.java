import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;
            boolean tripleFound = false;

            System.out.println("Roll  Die1  Die2  Die3  Sum");
            System.out.println("----------------------------------");

            // Keep rolling until a triple is found
            while (!tripleFound) {
                rollCount++;

                // Generate 3 random dice values between 1 and 6
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;

                // Calculate the sum of the three dice
                int sum = die1 + die2 + die3;

                // Display the current roll in table format
                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", rollCount, die1, die2, die3, sum);

                // Check if all three dice have the same value (triple)
                if (die1 == die2 && die2 == die3) {
                    tripleFound = true;
                }
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to play again? (Y/N): ");
            String response = in.nextLine();

            if (!response.equalsIgnoreCase("Y")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        in.close();
    }
}

