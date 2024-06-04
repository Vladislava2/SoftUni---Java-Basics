package conditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;
        boolean validData = true;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
            if(fruit.equals("banana")){
                sum = quantity * 2.5;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")){
                sum = quantity * 1.2;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")){
                sum = quantity * 0.85;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")){
                sum = quantity * 1.45;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")){
                sum = quantity * 2.70;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")){
                sum = quantity * 5.50;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")){
                sum = quantity * 3.85;
                System.out.printf("%.2f", sum);
            } else {
                validData = false;
                System.out.println("error");
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            if(fruit.equals("banana")){
                sum = quantity * 2.7;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")){
                sum = quantity * 1.25;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")){
                sum = quantity * 0.90;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")){
                sum = quantity * 1.60;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")){
                sum = quantity * 3.00;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")){
                sum = quantity * 5.60;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")){
                sum = quantity * 4.20;
                System.out.printf("%.2f", sum);
            } else {
                validData = false;
                System.out.println("error");
            }
        } else {
            validData = false;
            System.out.println("error");
        }
    }
}
