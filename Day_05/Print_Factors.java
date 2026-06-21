import java.util.Scanner;

public class Print_Factors {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number : ");

    int n = input.nextInt();

    int i;

    System.out.print("Factors are : ");

    for(i = 1; i <= n; i++){
      if(n % i == 0){
        System.out.print(i + " ");
      }
    }
  }
}