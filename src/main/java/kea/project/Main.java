package kea.project;
import java.util.Random; // Import the Random class for generating random troll sentences.
import java.util.Scanner; // Import the Scanner class for user input.

public class Main { // Define the main class.
    public static void main(String[] args) { // Define the main method.
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input.
        Random random = new Random(); // Create a Random object for random troll sentence selection.

        System.out.println("Press the spacebar to get a troll sentence (press any other key to exit).");

        while (true) { // Start an infinite loop.
            char input = scanner.next().charAt(0); // Read the user's input character.

            if (input == ' ') { // Check if the input is the spacebar.
                int randomNumber = random.nextInt(20); // Generate a random number between 0 and 19.
                switch (randomNumber) { // Start a switch statement for troll sentence selection.
                    case 0:
                        System.out.println("You just got trolled!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 1:
                        System.out.println("Haha, you fell for it!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 2:
                        System.out.println("This is a troll message!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 3:
                        System.out.println("You can't escape the troll!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 4:
                        System.out.println("Trolled again!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 5:
                        System.out.println("You're in Troll Town now!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 6:
                        System.out.println("The troll is strong with this one!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 7:
                        System.out.println("Trollolololol!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 8:
                        System.out.println("Trolled!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 9:
                        System.out.println("You fell right into my trap!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 10:
                        System.out.println("Expecto Trollronum!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 11:
                        System.out.println("Trolltastic!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 12:
                        System.out.println("Trollin' ain't easy!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 13:
                        System.out.println("Troll level over 9000!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 14:
                        System.out.println("Trolling you softly!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 15:
                        System.out.println("Prepare for maximum trollage!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 16:
                        System.out.println("Trollception!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 17:
                        System.out.println("You've been trolled, my friend."); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 18:
                        System.out.println("This is just the beginning of the troll parade!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                    case 19:
                        System.out.println("Another troll sentence!"); // Print a troll sentence.
                        break; // Exit the switch statement.
                }
            } else {
                System.out.println("Exiting the program."); // Print an exit message.
                break; // Exit the while loop.
            }
        }
    }

    static class ExtraFunctionality {
        private int importantNumber;

        public ExtraFunctionality() {
            this.importantNumber = 42;
        }

        public void method() {
            System.out.println("Lorem ipsum dolor sit amet...");
        }
    }
}