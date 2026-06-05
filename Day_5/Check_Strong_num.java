import java.util.Scanner;

public class Check_Strong_num {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number : ");

    int n = input.nextInt();

    int i, temp = n, sum = 0;

    while(temp != 0){
     int r = temp % 10;
     
     int fact = 1;
      for(i = 1; i <= r; i++){
        fact = fact * i;
      }
       sum = sum + fact;
       temp = temp / 10;
    }
    if(sum == n){
      System.out.print("A STRONG NUMBER");
    }
    else{
      System.out.print("NOT A STRONG NUMBER");
    }
  }
}