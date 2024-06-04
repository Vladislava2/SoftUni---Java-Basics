package Exam2023ProgrammingBasics;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double TesaMoney = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double expensesForTheWholePeriod = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = 5 * TesaMoney;
        double earnedMoney = 5 * profitPerDay;
        double totalSavedMoney = savedMoney + earnedMoney - expensesForTheWholePeriod;

        if (totalSavedMoney >= giftPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalSavedMoney);
        } else if (totalSavedMoney < giftPrice){
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - totalSavedMoney);
        }
    }
}
