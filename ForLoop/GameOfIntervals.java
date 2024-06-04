package ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double points = 0.00;
        int numbersFrom0to9 = 0;
        int numbersFrom10to19 = 0;
        int numbersFrom20to29 = 0;
        int numbersFrom30to39 = 0;
        int numbersFrom40to50 = 0;
        int invalidNumbers = 0;

        for (int i=1; i<=moves; i++){
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9){
                points = points + 0.20*number;
                numbersFrom0to9++;
            } else if (number >= 10 && number <= 19){
                points = points + 0.30*number;
                numbersFrom10to19++;
            } else if (number >= 20 && number <= 29){
                points = points + 0.40*number;
                numbersFrom20to29++;
            } else if (number >= 30 && number <= 39){
                points = points + 50;
                numbersFrom30to39++;
            } else if (number >= 40 && number <= 50){
                points = points + 100;
                numbersFrom40to50++;
            } else {
                points = points/2;
                invalidNumbers++;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", numbersFrom0to9 * 1.0 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", numbersFrom10to19 * 1.0 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", numbersFrom20to29 * 1.0 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", numbersFrom30to39 * 1.0 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", numbersFrom40to50 * 1.0 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumbers * 1.0 / moves * 100);
    }
}
