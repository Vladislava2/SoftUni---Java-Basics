package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        if (projection.equals("Premiere")) {
            sum = (rows * columns) * 12.00;
        } else if (projection.equals("Normal")) {
            sum = (rows * columns) * 7.50;
        } else if (projection.equals("Discount")) {
            sum = (rows * columns) * 5.00;
        }

        System.out.printf("%.2f", sum);
    }
}
