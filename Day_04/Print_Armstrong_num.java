import java.util.Scanner;

public class Print_Armstrong_num {
  public static void main(String[] args){

     Scanner input = new Scanner(System.in);

     System.out.print("Enter starting number : ");
     int start = input.nextInt();

     System.out.print("Enter ending number : ");
     int end = input.nextInt();
     
     // For only 3 digits numbers
     
      for(int i=start; i<=end; i++){
        int temp = i, r, sum = 0;
  
        while(temp != 0){
          r = temp % 10;
          sum = sum + (r*r*r);
          temp = temp / 10;
        }
        if(sum == i)
          System.out.print(i + " ");
      }
  }
}
