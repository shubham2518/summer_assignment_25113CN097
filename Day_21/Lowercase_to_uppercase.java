import java.util.Scanner;

public class Lowercase_to_uppercase {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a lowercase letter : ");
    char lowercase = input.next().charAt(0);

    if (lowercase >= 'a' && lowercase <= 'z') {
      char uppercase = (char) (lowercase - 'a' + 'A');
      System.out.println("The uppercase letter is : " + uppercase);
    } else {
      System.out.println("Invalid input. Please enter a lowercase letter.");
    }
  } 
}
