package conditionalStatementsAdvanced;
import java.util.Scanner;
public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday")){
            if (number == 10 || number == 11 || number == 12 || number == 13 || number == 14 || number == 15 || number == 16 || number == 17 || number == 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        }
    }
}
