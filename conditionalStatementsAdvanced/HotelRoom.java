package conditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double apartment = 0.00;
        double studio = 0.00;

        switch (month){
            case("May"):
            case("October"):
                studio = 50.00 * nights;
                apartment = 65.00 * nights;
                if (nights < 14 && nights > 7){
                    studio = (50 * nights) - (0.05*(50*nights));
                } else if (nights > 14){
                    studio = (50 * nights) - (0.30*(50*nights));
                }
                if (nights > 14) {
                    apartment = (65 * nights) - (0.10*(65*nights));
                }
                break;
            case("June"):
            case("September"):
                studio = 75.20 * nights;
                apartment = 68.70 * nights;
                if (nights > 14){
                    studio = (75.20 * nights) - (0.20*(75.20*nights));
                }
                if (nights > 14) {
                    apartment = (68.70 * nights) - (0.10*(68.70*nights));
                }
                break;
            case("July"):
            case("August"):
                studio = 76.00 * nights;
                apartment = 77.00 * nights;
                if (nights > 14) {
                    apartment = (77.00 * nights) - (0.10*(77.00*nights));
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);

    }
}
