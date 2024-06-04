package Exam2023ProgrammingBasics;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double pricePerPerson = 0;

        switch (season){
            case("spring"):
                if (people > 5){
                    pricePerPerson = 48.00;
                } else {
                    pricePerPerson = 50.00;
                }
                break;
            case ("summer"):
                if (people > 5){
                    pricePerPerson = 45.00;
                    pricePerPerson = pricePerPerson - (pricePerPerson*0.15);
                } else {
                    pricePerPerson = 48.50;
                    pricePerPerson = pricePerPerson - (pricePerPerson*0.15);
                }
                break;
            case ("autumn"):
                if (people > 5){
                    pricePerPerson = 49.50;
                } else {
                    pricePerPerson = 60.00;
                }
                break;
            case ("winter"):
                if (people > 5){
                    pricePerPerson = 85.00;
                    pricePerPerson = pricePerPerson + (pricePerPerson*0.08);
                } else {
                    pricePerPerson = 86.00;
                    pricePerPerson = pricePerPerson + (pricePerPerson*0.08);
                }
                break;
        }
        System.out.printf("%.2f leva.", pricePerPerson * people);
    }
}
