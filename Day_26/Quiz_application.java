import java.util.Scanner;

public class Quiz_application {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] questions = {
      "What is the capital of France?",
      "What is the value of π (pi) rounded to two decimal places?",
      "What is the largest planet in our solar system?",
      "What is the chemical symbol for water?",
      "What is the national flower of India?"
    };

    String[][] options = {
      {"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
      {"A. 3.14", "B. 4.14", "C. 5.14", "D. 6.14"},
      {"A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"},
      {"A. H2O", "B. CO2", "C. NaCl", "D. O2"},
      {"A. Lotus", "B. Rose", "C. Sunflower", "D. Jasmine"}
    };

    char[] answers = {'A', 'A', 'C', 'A', 'A'};

    int score = 0;

    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      for (String option : options[i]) {
        System.out.println(option);
      }
      System.out.print("Enter your answer (A, B, C, D): ");
      char userAnswer = input.next().toUpperCase().charAt(0);

      if (userAnswer == answers[i]) {
        score++;
        System.out.println("Correct!");
      } else {
        System.out.println("Incorrect! The correct answer is: " + answers[i]);
      }
      System.out.println();
    }

    System.out.println("Your final score is: " + score + "/" + questions.length);
  }
  
}
