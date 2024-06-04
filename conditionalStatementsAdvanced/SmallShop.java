package conditionalStatementsAdvanced;
import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        Double sum = 0.0;

        if (town.equals("Sofia")){
            if (product.equals("coffee")){
                sum = 0.50*quantity;
            } else if (product.equals("water")){
                sum = 0.80*quantity;
            } else if (product.equals("beer")){
                sum = 1.20*quantity;
            } else if (product.equals("sweets")){
                sum = 1.45*quantity;
            } else if (product.equals("peanuts")){
                sum = 1.60*quantity;
            }
        } else if (town.equals("Plovdiv")){
            if (product.equals("coffee")){
                sum = 0.40*quantity;
            } else if (product.equals("water")){
                sum = 0.70*quantity;
            } else if (product.equals("beer")){
                sum = 1.15*quantity;
            } else if (product.equals("sweets")){
                sum = 1.30*quantity;
            } else if (product.equals("peanuts")){
                sum = 1.50*quantity;
            }
        } else if (town.equals("Varna")){
            if (product.equals("coffee")){
                sum = 0.45*quantity;
            } else if (product.equals("water")){
                sum = 0.70*quantity;
            } else if (product.equals("beer")){
                sum = 1.10*quantity;
            } else if (product.equals("sweets")){
                sum = 1.35*quantity;
            } else if (product.equals("peanuts")){
                sum = 1.55*quantity;
            }
        }
        System.out.println(sum);
    }
}
