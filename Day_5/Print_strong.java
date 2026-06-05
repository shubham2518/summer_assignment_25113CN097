import java.util.Scanner;

public class Print_strong {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number : ");

    int n = input.nextInt();
    int i, j;

    for(i = 1; i <= n; i++){
      int temp = i;
      int sum = 0;
    
      while(temp != 0){
        int r = temp % 10;
     
        int fact = 1;
        for(j = 1; j <= r; j++){
          fact = fact * j;
        }
        sum = sum + fact;
        temp = temp / 10;
      }
      if(sum == i)
      System.out.print(i +" ");
    }
  }
}
