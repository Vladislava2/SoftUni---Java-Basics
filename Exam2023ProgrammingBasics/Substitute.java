package Exam2023ProgrammingBasics;
import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = k; i <= 8; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 9; j >= l; j--) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int o = m; o <= 8; o++) {
                    if (o % 2 != 0) {
                        continue;
                    }
                    for (int secondD2 = 9; secondD2 >= n; secondD2--) {
                        if (secondD2 % 2 == 0) {
                            continue;
                        }
                        String fistNumber = String.valueOf(firstD1) + String.valueOf(secondD1);
                        String secondNumber = String.valueOf(firstD2) + String.valueOf(secondD2);
                        if (fistNumber.equals(secondNumber)) {
                            System.out.println("Cannot change the same player.");
                        } else {
                            System.out.printf("%s - %s\n", fistNumber, secondNumber);
                            count++;
                            if (count == 6) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
