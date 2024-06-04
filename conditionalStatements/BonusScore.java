package conditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        double bonusScore = 0.00;

        if (a <= 100) {
            bonusScore = 5;
        } else if (a > 100 && a <= 1000){
            bonusScore = 0.20*a;
        } else {
            bonusScore = 0.10*a;
        }

        if (a % 2 == 0){
            bonusScore = bonusScore + 1;
        }
        if (a % 10 == 5){
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(bonusScore+a);
    }
}
