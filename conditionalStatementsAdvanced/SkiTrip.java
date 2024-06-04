package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double sum = 0.00;
        switch (room){
            case("room for one person"):
                sum = (days-1) * 18;
                break;
            case("apartment"):
                if (days < 10){
                    sum = ((days-1) * 25) - (0.30*((days-1) * 25));
                } else if (days >= 10 && days <= 15){
                    sum = ((days-1) * 25) - (0.35*((days-1) * 25));
                } else {
                    sum = ((days-1) * 25) - (0.50*((days-1) * 25));
                }
                break;
            case("president apartment"):
                if (days < 10){
                    sum = ((days-1) * 35) - (0.10*((days-1) * 35));
                } else if (days >= 10 && days <= 15){
                    sum = ((days-1) * 35) - (0.15*((days-1) * 35));
                } else {
                    sum = ((days-1) * 35) - (0.20*((days-1) * 35));
                }
                break;
        }
        if (rating.equals("positive")){
            sum = sum + (0.25*sum);
        } else if (rating.equals("negative")){
            sum = sum - (0.10*sum);
        }

        System.out.printf("%.2f", sum);
    }
}
