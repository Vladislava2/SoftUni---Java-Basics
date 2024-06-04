package conditionalStatementsAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double sum = 0.00;
        double sumAfterTax = 0.00;

        switch (season){
            case ("Spring"):
            case ("Autumn"):
                if (kmPerMonth <= 5000){
                    sum = 4*(0.75 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    sum = 4*(0.95 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000){
                    sum = 4*(1.45 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                }
                break;
            case ("Summer"):
                if (kmPerMonth <= 5000){
                    sum = 4*(0.90 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    sum = 4*(1.10 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000){
                    sum = 4*(1.45 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                }
                break;
            case ("Winter"):
                if (kmPerMonth <= 5000){
                    sum = 4*(1.05 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    sum = 4*(1.25 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000){
                    sum = 4*(1.45 * kmPerMonth);
                    sumAfterTax = sum - (0.10*sum);
                }
                break;
        }
        System.out.printf("%.2f", sumAfterTax);
    }
}
