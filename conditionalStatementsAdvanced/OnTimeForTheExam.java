package conditionalStatementsAdvanced;
import java.util.Scanner;
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examTimeHours = Integer.parseInt(scanner.nextLine());
        int examTimeMinutes = Integer.parseInt(scanner.nextLine());

        int arrivalTimeHours = Integer.parseInt(scanner.nextLine());
        int arrivalTimeMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examTimeHours * 60 + examTimeMinutes;
        int arrivalTimeInMinutes = arrivalTimeHours * 60 + arrivalTimeMinutes;

        int minutesBeforeExam = examTimeInMinutes - arrivalTimeInMinutes;

        int hoursBeforeTheExam = 0;
        int minutesBeforeTheExam = 0;

        int minutesAfterExam = arrivalTimeInMinutes - examTimeInMinutes;

        int hoursAfterTheExam = 0;
        int minutesAfterTheExam = 0;

        if (examTimeInMinutes > arrivalTimeInMinutes) { //on time
            if (minutesBeforeExam <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutesBeforeExam);
            } else if (minutesBeforeExam > 30 && minutesBeforeExam < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", minutesBeforeExam);
            } else {
                hoursBeforeTheExam = minutesBeforeExam / 60;
                minutesBeforeTheExam = minutesBeforeExam % 60;
                System.out.println("Early");
                if (minutesBeforeTheExam < 10) {
                    System.out.printf("%d:%02d hours before the start", hoursBeforeTheExam, minutesBeforeTheExam);
                } else if (minutesBeforeTheExam > 10) {
                    System.out.printf("%d:%d hours before the start", hoursBeforeTheExam, minutesBeforeTheExam);
                }
            }
        } else if (examTimeInMinutes == arrivalTimeInMinutes) { //on time
            System.out.println("On time");
        } else if (examTimeInMinutes < arrivalTimeInMinutes) {
            if (minutesAfterExam >= 1 && minutesAfterExam < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minutesAfterExam);
            } else {
                hoursAfterTheExam = minutesAfterExam / 60;
                minutesAfterTheExam = minutesAfterExam % 60;
                System.out.println("Late");
                if (minutesAfterTheExam < 10) {
                    System.out.printf("%d:%02d hours after the start", hoursAfterTheExam, minutesAfterTheExam);
                } else if (minutesAfterTheExam > 10) {
                    System.out.printf("%d:%d hours after the start", hoursAfterTheExam, minutesAfterTheExam);
                }
            }
        }
    }
}
