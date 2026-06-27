import java.util.Scanner;
public class Count_words_sentence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a sentence : ");
    String str = input.nextLine();

    int count = 1;

    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ' ') {
        count++;
      }
    }
    System.out.print("Number of words = " + count);
  }
}