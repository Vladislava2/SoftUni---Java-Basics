package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTickets = 0;
        int countTicketsStandard = 0;
        int countTicketsStudent = 0;
        int countTicketsKid = 0;
        double StudentTicketPercent = 0;
        double StandardTicketPercent = 0;
        double KidTicketPercent = 0;
        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")){
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeOfProjection = scanner.nextLine();

            while (!typeOfProjection.equals("End")){
                switch (typeOfProjection){
                    case ("student"):
                        countTicketsStudent++;
                        break;
                    case ("standard"):
                        countTicketsStandard++;
                        break;
                    case ("kid"):
                        countTicketsKid++;
                        break;
                }
                countTickets = countTicketsKid + countTicketsStandard + countTicketsStudent;
                if (countTickets == freeSeats){
                    break;
                }
                typeOfProjection = scanner.nextLine();
            }
            double hallFullness = countTickets * 1.0 / freeSeats * 100;
            StudentTicketPercent = countTicketsStudent * 1.0 / countTickets * 100;
            StandardTicketPercent = countTicketsStandard * 1.0 / countTickets * 100;
            KidTicketPercent = countTicketsKid * 1.0 / countTickets * 100;

            System.out.printf("%s - %.2f%% full.%n", movieName, hallFullness);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countTickets);
        System.out.printf("%.2f%% student tickets.%n", StudentTicketPercent);
        System.out.printf("%.2f%% standard tickets.%n", StandardTicketPercent);
        System.out.printf("%.2f%% kids tickets.%n", KidTicketPercent);

    }
} // грешна

