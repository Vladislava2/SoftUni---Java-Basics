package conditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0;

        if (figureType.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (figureType.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figureType.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if (figureType.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
