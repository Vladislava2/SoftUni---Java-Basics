package ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0.00;
        double averagePointsForTournament = 0.00;
        double pointsForTournament = 0.00;
        int wonTournaments = 0;

        for (int i = 1; i <= tournaments; i++) {
            String stateOfTournament = scanner.nextLine();

            switch (stateOfTournament) {
                case ("W"):
                    pointsForTournament = pointsForTournament + 2000;
                    wonTournaments++;
                    break;
                case ("F"):
                    pointsForTournament = pointsForTournament + 1200;
                    break;
                case ("SF"):
                    pointsForTournament = pointsForTournament + 720;
                    break;
            }
            averagePointsForTournament = pointsForTournament / tournaments * 1.0;
            totalPoints = points + pointsForTournament;

        }
        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePointsForTournament));
        System.out.printf("%.2f%%", wonTournaments * 1.0 / tournaments * 100);
    }
}
