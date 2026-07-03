import java.util.Scanner;
public class Student_record_management {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of students : ");
    int n = input.nextInt();

    String[] names = new String[n];
    int[] marks = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the name of student " + (i + 1) + " : ");
      names[i] = input.next();

      System.out.print("Enter the marks of student " + (i + 1) + " : ");
      marks[i] = input.nextInt();
    }

    System.out.println("\nStudent Records:");
    for (int i = 0; i < n; i++) {
      System.out.println("Name: " + names[i] + " | Marks: " + marks[i]);
    }
  }
}