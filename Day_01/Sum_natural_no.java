import java.util.Scanner;

public class Sum_natural_no {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer : ");

    int n = input.nextInt();
    
    int i, sum = 0;

    for(i=0; i<=n; i++){
      sum = sum + i;
    }
    System.out.print("Sum of first " + n + " natural numbers : ");
    System.out.print(sum);

  }
}