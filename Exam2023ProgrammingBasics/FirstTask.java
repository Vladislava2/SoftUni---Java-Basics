package Exam2023ProgrammingBasics;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardForTransport = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double priceForNights = nights * 20;
        double priceForCard = cardForTransport * 1.60;
        double priceForTickets = tickets * 6;

        double totalSum = priceForNights + priceForCard + priceForTickets;
        double sumForGroup = totalSum * peopleInGroup;

        double expenses = sumForGroup + (sumForGroup * 0.25);

        System.out.printf("%.2f", expenses);

    }
}
