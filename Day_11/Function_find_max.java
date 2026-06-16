import java.util.Scanner;

public class Function_find_max {
  static int findMax(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number : ");
    int num1 = input.nextInt();

    System.out.print("Enter the second number : ");
    int num2 = input.nextInt();

    int max = findMax(num1, num2);
    System.out.println("The maximum of " + num1 + " and " + num2 + " is : " + max);
  }
}