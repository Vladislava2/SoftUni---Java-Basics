package conditionalStatements;

import java.util.Scanner;

public class TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours*60 + minutes + 15;

        int hoursAfter15minutes = time / 60;
        int minutesAfter15minutes = time % 60;

        if (hoursAfter15minutes > 23){
            hoursAfter15minutes = 0;
        }

        if (minutesAfter15minutes < 10) {
            System.out.printf("%d:0%d", hoursAfter15minutes, minutesAfter15minutes);
        } else {
            System.out.printf("%d:%d", hoursAfter15minutes, minutesAfter15minutes);
        }
    }
}
