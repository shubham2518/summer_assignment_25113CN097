import java.util.Scanner;

public class Sort_words_by_length {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of words : ");
    int n = input.nextInt();
    input.nextLine(); // Consume the newline character

    String[] words = new String[n];

    System.out.println("Enter the words : ");
    for (int i = 0; i < n; i++) {
      words[i] = input.nextLine();
    }

    // Sort the words by length using bubble sort
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (words[j].length() > words[j + 1].length()) {

          // Swap words[j] and words[j + 1]
          String temp = words[j];
          words[j] = words[j + 1];
          words[j + 1] = temp;
        }
      }
    }

    System.out.println("The sorted words by length are : ");
    for (String word : words) {
      System.out.println(word);
    }
  } 
}
