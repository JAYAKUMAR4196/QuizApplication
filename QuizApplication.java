import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Answer the following questions:");

        // Question 1
        System.out.println("\nQuestion 1: What is the capital of France?");
        System.out.println("A) Paris");
        System.out.println("B) London");
        System.out.println("C) Berlin");
        System.out.println("D) Madrid");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine().toUpperCase();
        if (answer1.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) Paris.");
        }

        // Question 2
        System.out.println("\nQuestion 2: What is 2 + 2?");
        System.out.println("A) 3");
        System.out.println("B) 4");
        System.out.println("C) 5");
        System.out.println("D) 6");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine().toUpperCase();
        if (answer2.equals("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B) 4.");
        }

        // Question 3
        System.out.println("\nQuestion 3: Who wrote 'Romeo and Juliet'?");
        System.out.println("A) Charles Dickens");
        System.out.println("B) William Shakespeare");
        System.out.println("C) Jane Austen");
        System.out.println("D) Mark Twain");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine().toUpperCase();
        if (answer3.equals("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B) William Shakespeare.");
        }

        // Display final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + " out of 3.");

        scanner.close();
    }
}