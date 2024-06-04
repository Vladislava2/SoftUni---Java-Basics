package ForLoop;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double lillyMoney = 0.00;
        double birthdayMoney = 10;


        for(int i = 1; i <= age; i++){
            if (i % 2 == 0){
                lillyMoney = lillyMoney + birthdayMoney - 1.00;
                birthdayMoney = birthdayMoney + 10;
            } else {
                toysCount++;
            }
        }

        lillyMoney = lillyMoney + (toysCount * toyPrice);
        if (washingMachinePrice <= lillyMoney){
            System.out.printf("Yes! %.2f", lillyMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - lillyMoney);
        }
    }
}
