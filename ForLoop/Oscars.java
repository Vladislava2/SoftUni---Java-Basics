package ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0.00;
        double totalPointSFromJudges = 0.00;

        for (int i = 0; i < judges; i++){
            String judgeName = scanner.nextLine();
            double pointsFromJudges = Double.parseDouble(scanner.nextLine());

            totalPointSFromJudges = totalPointSFromJudges + ((pointsFromJudges * judgeName.length())/2);
            totalPoints = points + totalPointSFromJudges;

            if (totalPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, totalPoints);
                return;
            }

        }

        System.out.printf("Sorry, %s you need %.1f more!", actorsName, (1250.5 - totalPoints));

    }
}
