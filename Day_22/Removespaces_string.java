import java.util.Scanner;
public class Removespaces_string {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    String result = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        result += str.charAt(i);
      }
    }
    System.out.print("String after removing spaces : " + result);
  }
}