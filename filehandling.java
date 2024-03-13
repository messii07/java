import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadStoreStudent {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("students.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter the student's name: ");
                String name = scanner.next();

                System.out.println("Enter the student's age: ");
                int age = scanner.nextInt();

                System.out.println("Enter the student's GPA: ");
                double gpa = scanner.nextDouble();

                writer.write(name + "," + age + "," + gpa + "\n");
            }

            writer.close();
            scanner.close();

            System.out.println("Student data has been saved to students.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}