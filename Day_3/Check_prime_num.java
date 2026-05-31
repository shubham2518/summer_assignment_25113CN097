import java.util.Scanner;

public class Check_prime_num {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive number : ");

    int n = input.nextInt();
    int i, count = 0;

    for(i=1; i<=n; i++){
      if(n%i==0)
        count++;
    }

    if(count==2)
      System.out.print("A PRIME NUMBER");
    else
      System.out.print("NOT A PRIME NUMBER");
  }
}

