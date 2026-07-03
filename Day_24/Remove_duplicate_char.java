import java.util.Scanner;

public class Remove_duplicate_char {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (result.indexOf(String.valueOf(c)) == -1) {
        result.append(c);
      }
    }

    System.out.println("String after removing duplicate characters : " + result.toString());
  }
  
}
