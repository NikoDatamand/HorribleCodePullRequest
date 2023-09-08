package kea.project;
import java.util.Random; // Import the Random class for generating random troll sentences.
import java.util.Scanner; // Import the Scanner class for user input.

public class Main { // Define the main class.
        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            // Create a Random object to generate random numbers
            Random random = new Random();

            // Prompt the user to press the spacebar and hit Enter
            System.out.println("Press the spacebar and hit Enter to see a troll sentence (or type 'exit' to quit):");
            while (true) {
                // Read user input
                String userInput = scanner.nextLine();

                // Check if the user wants to exit
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    // Exit the loop
                    break;
                }

                // Check if the user's input is empty (spacebar pressed)
                if (userInput.equals(" ")) {
                    // Generate a random index between 0 and 19
                    int randomIndex = random.nextInt(20);
                    // Use a switch statement to select a troll sentence based on the random index
                    switch (randomIndex) {
                        case 0:
                            System.out.println("You must be a professional keyboard smasher!");
                            break;
                        case 1:
                            System.out.println("Wow, you're really good at pressing that spacebar!");
                            break;
                        case 2:
                            System.out.println("Congratulations, you just discovered the spacebar!");
                            break;
                        case 3:
                            System.out.println("Is the spacebar your best friend?");
                            break;
                        case 4:
                            System.out.println("Keep pressing that spacebar, it's making my day!");
                            break;
                        // Add the remaining troll sentences here...
                        default:
                            System.out.println("You are the spacebar champion!");
                    }
                } else {
                    // Inform the user that they didn't press the spacebar
                    System.out.println("You didn't press the spacebar!");
                }
            }

            // Close the Scanner object
            scanner.close();
        }

    private static class ExtraFunctionality {
        private int importantNumber;

        public ExtraFunctionality() {
            this.importantNumber = 42;
        }

        public void method() {
            System.out.println("Lorem ipsum dolor sit amet...");
        }
    }





}