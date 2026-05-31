import java.util.Scanner;

public class Check_palindrome {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");

    int n = input.nextInt();
    int i, rev = 0;
    int temp = n;

    while(temp!=0){
      i = temp % 10;
      rev = rev * 10 + i;
      temp = temp / 10;
    }

    if(rev == n){
      System.out.print("PALINDROME");
    }
    else{
      System.out.print("NOT PALINDROME");
    }
  }
}