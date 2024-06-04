package Exam2023ProgrammingBasics;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        int metersPerDay = 0;

        while (!input.equals("END")){

            int climbedMeters = Integer.parseInt(scanner.nextLine());
            count++;

            switch (input){
                case ("Yes"):
                    metersPerDay += climbedMeters;
                    if (count==1) {
                        metersPerDay += 5364 + climbedMeters;
                    }
                    break;
                case ("No"):
                    metersPerDay += climbedMeters;
                    break;
            }

            if (metersPerDay >= 8848){
                System.out.printf("Goal reached for %d days!", count);
                return;
            }

            if (metersPerDay < 8848 && count==5){
                System.out.printf("Failed!%n");
                System.out.printf("%d", climbedMeters);
            }

            input = scanner.nextLine();
        }
        if (metersPerDay >= 8848){
            System.out.printf("Goal reached for %d days!", count);
        } else if (metersPerDay < 8848 && count==5) {
            System.out.printf("Failed!%n");
            System.out.printf("%d", metersPerDay);
        }
    }
}
