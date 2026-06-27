import java.util.Scanner;

public class Stringlength_without_strlen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    int length = 0;
    for (char c : str.toCharArray()) {
      length++;
    }

    System.out.println("The length of the string is : " + length);
  }
}
