package ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoads = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;
        int totalTonnage = 0;
        double avgForTonnage = 0.00;
        double tonnageVan = 0.00;
        double tonnageTruck = 0.00;
        double tonnageTrain = 0.00;


        for (int i = 1; i <= numOfLoads; i++){
            int cargoTonnage = Integer.parseInt(scanner.nextLine());

            totalTonnage = totalTonnage + cargoTonnage;

            //До 3 тона – микробус (200 лева на тон)
            //От 4 до 11 тона – камион (175 лева на тон)
            //12 и повече тона – влак (120 лева на тон)

            if (cargoTonnage <= 3){
                sum = sum + cargoTonnage * 200;
                tonnageVan += cargoTonnage;
            } else if (cargoTonnage <= 11){
                sum = sum + cargoTonnage * 175;
                tonnageTruck += cargoTonnage;
            } else {
                sum = sum + cargoTonnage * 120;
                tonnageTrain += cargoTonnage;
            }

            avgForTonnage = sum / totalTonnage;
        }
        System.out.printf("%.2f%n", avgForTonnage);
        System.out.printf("%.2f%%%n", tonnageVan * 1.0/totalTonnage * 100);
        System.out.printf("%.2f%%%n", tonnageTruck * 1.0/totalTonnage * 100);
        System.out.printf("%.2f%%%n", tonnageTrain * 1.0/totalTonnage * 100);
    }
}
