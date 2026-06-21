import java.util.Scanner;

public class Check_perfect_num {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number : ");

    int n = input.nextInt();

    int i, sum = 0;

    for(i = 1; i <= n/2; i++){  //we can also use i < n instead of i <= n/2 but it will take more time to execute 
      if(n % i == 0){
        sum = sum + i;
      }
    }
    if(sum == n){
      System.out.print("A PERFECT NUMBER");
    }
    else{
      System.out.print("NOT A PERFECT NUMBER");
    }
  }
}
