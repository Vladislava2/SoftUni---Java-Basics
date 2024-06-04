package Exam2023ProgrammingBasics;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computers = Integer.parseInt(scanner.nextLine());

        double totalSales = 0;
        int ratingSum = 0;
        double ratingAverage = 0;

        for (int i = 0; i < computers ; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            int rating = (n % 10);
            double sales = (n * 1.0 / 10);

            switch (rating){
                case (2):
                    totalSales += sales * 0;
                    break;
                case (3):
                    totalSales += sales * 0.5;
                    break;
                case (4):
                    totalSales += sales * 0.7;
                    break;
                case (5):
                    totalSales += sales * 0.85;
                    break;
                case (6):
                    totalSales += sales * 1;
                    break;
            }

            ratingSum += rating;
            ratingAverage = ratingSum * 1.0 / computers;
        }
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", ratingAverage);

    }
}
