package conditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int durationTime = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = 0.125*lunchBreak;
        double restTime = 0.25*lunchBreak;

        double totalTime = lunchTime + restTime + durationTime;

        if (totalTime <= lunchBreak){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(Math.abs(lunchBreak-totalTime)));
        } else if (lunchBreak < totalTime){
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(Math.abs(totalTime - lunchBreak)));
        }
    }
}
