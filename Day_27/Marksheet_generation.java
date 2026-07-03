import java.util.Scanner;

public class Marksheet_generation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);
        System.out.println("Subject 1    : " + s1);
        System.out.println("Subject 2    : " + s2);
        System.out.println("Subject 3    : " + s3);
        System.out.println("Subject 4    : " + s4);
        System.out.println("Subject 5    : " + s5);
        System.out.println("-------------------------------");
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        if (s1 >= 33 && s2 >= 33 && s3 >= 33 && s4 >= 33 && s5 >= 33)
            System.out.println("Result       : PASS");
        else
            System.out.println("Result       : FAIL");
    }
}