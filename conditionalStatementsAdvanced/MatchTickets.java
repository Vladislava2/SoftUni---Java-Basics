package conditionalStatementsAdvanced;
import java.util.Scanner;
public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0.00;
        double sumForVIPTickets = 0.00;
        double sumForNormalTickets = 0.00;
        double totalSum = 0.00;

        switch (ticketType){
            case("VIP"):
                sumForVIPTickets = 499.99 * people;
                if (people >= 1 && people <= 4){
                    transport = 0.75*budget;
                } else if (people >= 5 && people <= 9){
                    transport = 0.60*budget;
                } else if (people >= 10 && people <= 24){
                    transport = 0.50*budget;
                } else if (people >= 25 && people <= 49){
                    transport = 0.40*budget;
                } else {
                    transport = 0.25*budget;
                }
                totalSum = sumForVIPTickets + transport;
                break;
            case("Normal"):
                sumForNormalTickets = 249.99 * people;
                if (people >= 1 && people <= 4){
                    transport = 0.75*budget;
                } else if (people >= 5 && people <= 9){
                    transport = 0.60*budget;
                } else if (people >= 10 && people <= 24){
                    transport = 0.50*budget;
                } else if (people >= 25 && people <= 49){
                    transport = 0.40*budget;
                } else {
                    transport = 0.25*budget;
                }
                totalSum = sumForNormalTickets + transport;
                break;
        }

        if (totalSum > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", totalSum - budget);
        } else if (totalSum <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalSum);
        }
    }
}
