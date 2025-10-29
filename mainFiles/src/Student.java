// ---------------------------------------------------------------------------------------------------------

// Create a class student with data members to store rollNum, name of student, marks of three subjects,
//  max , min marks  and obtained marks. 
//  Create an object of the student. 
//  Provide facilities to input data for the data members and display the results of the student.
 
// ----------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Student {
    int rollNumber;
    String name;
    int marks1;
    int marks2;
    int marks3;
    int maxMarks;
    int minMarks;
    int obtainedMarks;

    public Student(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.maxMarks = Math.max(marks1, Math.max(marks2, marks3));
        this.minMarks = Math.min(marks1, Math.min(marks2, marks3));
        this.obtainedMarks = marks1 + marks2 + marks3;
    }

    public void display(){
        System.out.println(rollNumber + " " + name + " " + marks1 + " " + marks2 + " " + marks3 + " " + maxMarks + " " + minMarks + " " + obtainedMarks);
    }

    public static void main(String[] args) {
        Student student;
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        int rollNumber;
        String name;
        int marks1;
        int marks2;
        int marks3;
        System.out.println("Enter your choice:- ");
        while(choice != 0){
            System.out.println("1. Add\n2. Display marks\n0. Exit");
            switch (choice) {
                case 1:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Roll number: ");
                        rollNumber = scanner.nextInt();
                        System.out.print("Name: ");
                        name = scanner.next();
                        System.out.print("Marks1: ");
                        marks1 = scanner.nextInt();
                        System.out.print("Marks2: ");
                        marks2 = scanner.nextInt();
                        System.out.print("Marks3: ");
                        marks3 = scanner.nextInt();
                        student = new Student(rollNumber, name, marks1, marks2, marks3);
                    }

                    break;
                case 2:
                    student.display();

                case 0:
                    exit(0);
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }
        }
    }
}

