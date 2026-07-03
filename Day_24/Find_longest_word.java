import java.util.Scanner;

public class Find_longest_word {
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

    String longestWord = "";
    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    System.out.println("The longest word is : " + longestWord);
  }
  
}
