package conditionalStatements;
import java.util.Scanner;
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine(); //day or night

        if (timeOfTheDay.equals("day") && n < 20){
            System.out.printf("%.2f", (0.70+(n*0.79)));
        } else if (timeOfTheDay.equals("night") && n < 20){
            System.out.printf("%.2f", (0.70+(n*0.90)));
        }

        if (n >= 20 && n < 100){
            System.out.printf("%.2f", (n*0.09));
        }

        if (n >= 100){
            System.out.printf("%.2f", (n*0.06));
        }
    }
}
