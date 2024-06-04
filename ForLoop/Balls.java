package ForLoop;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0.00;
        int dividesFromBlackBall = 0;
        int otherColors = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;


        for (int i = 1; i <= n ; i++){
            String colors = scanner.nextLine();

            switch (colors){
                case ("red"):
                    redBalls++;
                    totalPoints += 5;
                    break;
                case ("orange"):
                    orangeBalls++;
                    totalPoints += 10;
                    break;
                case ("yellow"):
                    yellowBalls++;
                    totalPoints += 15;
                    break;
                case ("white"):
                    whiteBalls++;
                    totalPoints += 20;
                    break;
                case ("black"):
                    totalPoints = Math.floor(totalPoints/2);
                    dividesFromBlackBall++;
                    break;
                default:
                    otherColors++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherColors);
        System.out.printf("Divides from black balls: %d%n", dividesFromBlackBall);
    }
}
