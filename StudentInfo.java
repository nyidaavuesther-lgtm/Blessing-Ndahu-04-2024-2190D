import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Collecting Student Information
        System.out.print("Enter Full Name: ");
        String fullName =input.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = input.next().charAt(0);

        input.nextLine(); // consume leftover newline

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Level: ");
        int level = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        // ===== Processing Information =====
        String adultStatus = (age >= 18) ? "YES" : "NO";

        String academicClass;
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0 && gpa < 3.5) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5 && gpa < 3.0) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        // ===== Display Student Profile =====
        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);
        System.out.println("===========================");

        input.close();
    }
}