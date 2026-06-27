import java.utiil.Scanner;
public class First_repeating_char {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    int char result = '\0';

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {

        if (str.charAt(i) == str.charAt(j)) {
          result = str.charAt(i);
          break;
        }
      }
      if (result != '\0') {
        break;
      }
    }

    if (result != '\0') {
      System.out.print("First repeating character is : " + result);
    } else {
      System.out.print("No repeating character found.");
    }
  }
}