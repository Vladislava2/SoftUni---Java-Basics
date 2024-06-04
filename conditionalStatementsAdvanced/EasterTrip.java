package conditionalStatementsAdvanced;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String reservationDates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (destination){
            case ("France"):
                if (reservationDates.equals("21-23")){
                    totalSum = nights * 30;
                } else if (reservationDates.equals("24-27")){
                    totalSum = nights * 35;
                } else if (reservationDates.equals("28-31")){
                    totalSum = nights * 40;
                }
                break;
            case ("Italy"):
                if (reservationDates.equals("21-23")){
                    totalSum = nights * 28;
                } else if (reservationDates.equals("24-27")){
                    totalSum = nights * 32;
                } else if (reservationDates.equals("28-31")){
                    totalSum = nights * 39;
                }
                break;
            case ("Germany"):
                if (reservationDates.equals("21-23")){
                    totalSum = nights * 32;
                } else if (reservationDates.equals("24-27")){
                    totalSum = nights * 37;
                } else if (reservationDates.equals("28-31")){
                    totalSum = nights * 43;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalSum);
    }
}
