package conditionalStatements;
import java.util.Scanner;
public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - daysOff;
        double totalTimeForPlaying = (workingDays * 63) + (daysOff * 127);
        double diff = Math.abs(30000 - totalTimeForPlaying);
        double timeInHours = Math.floor(diff / 60);
        double timeInMinutes = diff % 60;

        if (totalTimeForPlaying > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", timeInHours, timeInMinutes);
        } else if (totalTimeForPlaying <= 30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", timeInHours, timeInMinutes);
        }
    }
}
