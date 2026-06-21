import java.util.Scanner;

public class Sumof_digits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");

    int n = input.nextInt();
    int i, sum = 0;

    while(n!=0){
      i = n % 10;
      sum = sum + i;
      n = n / 10;
    }
    System.out.print("Sum of digits = ");
    System.out.print(sum);
  }
}
