import java.util.Scanner;

public class Repeated_Character_Pattern {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows : ");
    int n = input.nextInt();

    char ch = 'A';

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
      }
      ch++;
      System.out.println();
    }
  } 
}