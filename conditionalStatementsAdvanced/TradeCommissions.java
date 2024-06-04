package conditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        boolean validData = true;


        if (town.equals("Sofia")){
            if (sales >= 0 && sales <= 500){
                commission = 0.05*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 500 && sales <= 1000){
                commission = 0.07*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 1000 && sales <= 10000){
                commission = 0.08*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 10000){
                commission = 0.12*sales;
                System.out.printf("%.2f", commission);
            } else {
                validData = false;
                System.out.printf("error");
            }
        } else if (town.equals("Varna")){
            if (sales >= 0 && sales <= 500){
                commission = 0.045*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 500 && sales <= 1000){
                commission = 0.075*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 1000 && sales <= 10000){
                commission = 0.10*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 10000){
                commission = 0.13*sales;
                System.out.printf("%.2f", commission);
            } else {
                validData = false;
                System.out.printf("error");
            }
        } else if (town.equals("Plovdiv")){
            if (sales >= 0 && sales <= 500){
                commission = 0.055*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 500 && sales <= 1000){
                commission = 0.08*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 1000 && sales <= 10000){
                commission = 0.12*sales;
                System.out.printf("%.2f", commission);
            } else if (sales > 10000){
                commission = 0.145*sales;
                System.out.printf("%.2f", commission);
            } else {
                validData = false;
                System.out.printf("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
