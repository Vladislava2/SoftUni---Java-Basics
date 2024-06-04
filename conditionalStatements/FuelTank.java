package conditionalStatements;
import java.util.Scanner;
public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        Integer fuel = Integer.parseInt(scanner.nextLine());
        String discountCard = scanner.nextLine();

        double discountPriceGasoline = 2.04*fuel;
        double discountPriceDiesel = 2.21*fuel;
        double discountPriceGas = 0.85*fuel;

        double pricesForGasoline = 2.22*fuel;
        double pricesForDiesel = 2.33*fuel;
        double pricesForGas = 0.93*fuel;

        if (fuelType.equals("Diesel")){
            if (discountCard.equals("Yes")){
                if (fuel>=20 && fuel<=25){
                    System.out.printf("%.2f lv.", discountPriceDiesel-(0.08*discountPriceDiesel));
                } else if (fuel > 25){
                    System.out.printf("%.2f lv.", discountPriceDiesel-(0.10*discountPriceDiesel));
                } else {
                    System.out.printf("%.2f lv.", discountPriceDiesel);
                }
            } else if (discountCard.equals("No")){
                if (fuel>=20 && fuel<=25){
                    System.out.printf("%.2f lv.", pricesForDiesel-(0.08*pricesForDiesel));
                } else if (fuel > 25){
                    System.out.printf("%.2f lv.", pricesForDiesel-(0.10*pricesForDiesel));
                } else {
                    System.out.printf("%.2f lv.", pricesForDiesel);
                }
            }
        } else if (fuelType.equals("Gasoline")){
            if (discountCard.equals("Yes")) {
                if (fuel >= 20 && fuel <= 25) {
                    System.out.printf("%.2f lv.", discountPriceGasoline - (0.08 * discountPriceGasoline));
                } else if (fuel > 25) {
                    System.out.printf("%.2f lv.", discountPriceGasoline - (0.10 * discountPriceGasoline));
                } else {
                System.out.printf("%.2f lv.", discountPriceDiesel);
                }
            } else if (discountCard.equals("No")) {
                if (fuel >= 20 && fuel <= 25) {
                    System.out.printf("%.2f lv.", pricesForGasoline - (0.08 * pricesForGasoline));
                } else if (fuel > 25) {
                    System.out.printf("%.2f lv.", pricesForGasoline - (0.10 * pricesForGasoline));
                } else {
                System.out.printf("%.2f lv.", pricesForDiesel);
                }
            }
        } else if (fuelType.equals("Gas")) {
            if (discountCard.equals("Yes")) {
                if (fuel >= 20 && fuel <= 25) {
                    System.out.printf("%.2f lv.", discountPriceGas - (0.08 * discountPriceGas));
                } else if (fuel > 25) {
                    System.out.printf("%.2f lv.", discountPriceGas - (0.10 * discountPriceGas));
                } else {
                System.out.printf("%.2f lv.", discountPriceDiesel);
                }
            } else if (discountCard.equals("No")) {
                if (fuel >= 20 && fuel <= 25) {
                    System.out.printf("%.2f lv.", pricesForGas - (0.08 * pricesForGas));
                } else if (fuel > 25) {
                    System.out.printf("%.2f lv.", pricesForGas - (0.10 * pricesForGas));
                } else {
                System.out.printf("%.2f lv.", pricesForDiesel);
                }
            }
        }
    }
}
