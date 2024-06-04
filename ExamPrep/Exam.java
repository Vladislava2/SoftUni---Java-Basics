package ExamPrep;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        double sum = 0;
        double average = 0;

        for (int i = 1; i <= students ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 5.00){
                count1++;
            } else if (grade >= 4.00 && grade <= 4.99){
                count2++;
            } else if (grade >= 3.00 && grade <= 3.99){
                count3++;
            } else if (grade < 3.00){
                count4++;
            }
            sum = sum + grade;
            average = sum / students;

        }
        System.out.printf("Top students: %.2f%%%n", count1 * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", count2 * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", count3 * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", count4 * 1.0 / students * 100);
        System.out.printf("Average: %.2f", average);
    }
}
