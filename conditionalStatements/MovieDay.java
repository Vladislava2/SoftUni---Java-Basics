package conditionalStatements;
import java.util.Scanner;
public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForShooting = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double fieldPrep = 0.15*timeForShooting;
        int totalTimeForShooting = scenes * sceneDuration;
        double totalTime = fieldPrep + totalTimeForShooting;

        if (totalTime <= timeForShooting) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeForShooting-totalTime);
        } else if (timeForShooting < totalTime) {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(totalTime-timeForShooting));
        }
    }
}
