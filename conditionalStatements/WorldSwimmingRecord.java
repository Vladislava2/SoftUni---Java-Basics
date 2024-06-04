package conditionalStatements;
import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        double delayedTime = Math.floor(distance / 15);
        double totalTime = (distance * timeInSecondsPerMeter) + (delayedTime*12.5);

        if (totalTime > recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else if (totalTime < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
