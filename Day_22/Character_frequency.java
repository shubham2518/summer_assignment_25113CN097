import java.util.Scanner;
public class Charcter_frequency {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    System.out.print("Enter a character : ");
    char ch = input.next().charAt(0);

    int count = 0;

    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ch) {
        count++;
      }
    }
    System.out.print("Frequency of " + ch + " = " + count);
  }
}