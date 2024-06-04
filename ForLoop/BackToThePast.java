package ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double spentMoney = 0.00;
        int initialAge = 18;
        double totalSum = 0.00;

        for (int i = 1800; i <= year; i++){
            // в 1800 год. той ще е на 18

            if (i % 2 == 0){
                spentMoney = spentMoney + 12000;
            } else {
                spentMoney = spentMoney + (12000 + 50*(initialAge));
            }

            initialAge++;
            totalSum = inheritance - spentMoney;
        }
        if (spentMoney > inheritance){
            System.out.printf("He will need %.2f dollars to survive.", spentMoney - inheritance);
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", totalSum);
        }
    }
}
