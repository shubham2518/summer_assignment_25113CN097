import java.util.Scanner;
public class Multiplication_table {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer : ");

    int n = input.nextInt();

    for (int i=1; i<=10; i++){
      System.out.print(n + " x " + i + " = ");
      System.out.println(n*i);
    }
  }
}
