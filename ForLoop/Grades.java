package ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int studentsBetween3and4 = 0;
        int studentsBetween4and5 = 0;
        int failedStudents = 0;
        double avg = 0.00;

        for (int i = 1; i <= students; i++){
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade <= 2.99){
                failedStudents++;
            } else if (grade <= 3.99){
                studentsBetween3and4++;
            } else if (grade <= 4.99){
                studentsBetween4and5++;
            } else if (grade <= 6.00){
                topStudents++;
            }

            avg = avg + grade/students;
        }

        System.out.printf("Top students: %.2f%%%n", topStudents * 1.0/students*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", studentsBetween4and5 * 1.0/students*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", studentsBetween3and4 * 1.0/students*100);
        System.out.printf("Fail: %.2f%%%n", failedStudents*1.0/students*100);
        System.out.printf("Average: %.2f", avg);
    }
}
