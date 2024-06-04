package conditionalStatements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double foodPerDayForDog = Double.parseDouble(scanner.nextLine()); //в килограми
        double foodPerDayForCat = Double.parseDouble(scanner.nextLine()); //в килограми
        double foodPerDayForTurtle = Double.parseDouble(scanner.nextLine()); //в грамове

        double turtleFoodInKG = foodPerDayForTurtle / 1000;
        double dogFood = foodPerDayForDog * days;
        double catFood = foodPerDayForCat * days;
        double turtleFood = turtleFoodInKG * days;

        double totalFood = dogFood + catFood + turtleFood;

        if (totalFood <= food){
            System.out.printf("%.0f kilos of food left.", Math.floor(food - totalFood));
        } else if (food < totalFood){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - food));
        }
    }
}
