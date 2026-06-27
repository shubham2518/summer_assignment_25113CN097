import java.util.Scanner;
public class Max_occuring_char {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    int[] freq = new int[256];

    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i)]++;
    }

    char maxChar = '\0';
    int maxFreq = 0;

    for (int i = 0; i < 256; i++) {
      if (freq[i] > maxFreq) {
        maxFreq = freq[i];
        maxChar = (char) i;
      }
    }

    System.out.println("Maximum occurring character is : " + maxChar);
  }
}