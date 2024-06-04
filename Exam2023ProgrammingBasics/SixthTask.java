package Exam2023ProgrammingBasics;
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = 0;
        int count = 1;

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (input.equals("Yes")) {
                count++;
            }

            int climbedMeters = Integer.parseInt(scanner.nextLine());
            height = height + climbedMeters;

            if (height + 5364 >= 8848) {
                break;
            }
            if (count == 5) {
                break;
            }

            input = scanner.nextLine();
        }
        if (height + 5364 < 8848) {
            System.out.println("Failed!");
            System.out.printf("%d", 5364 + height);
        } else {
            System.out.printf("Goal reached for %d days!", count);
        }
    }
}
