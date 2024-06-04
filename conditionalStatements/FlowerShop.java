package conditionalStatements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine()); //магнолии
        int hyacinths = Integer.parseInt(scanner.nextLine()); //зюмбюли
        int roses = Integer.parseInt(scanner.nextLine()); //рози
        int cactus = Integer.parseInt(scanner.nextLine()); //кактуси
        double giftPrice = Double.parseDouble(scanner.nextLine());

        //Магнолии – 3.25 лева
        //Зюмбюли – 4 лева
        //Рози – 3.50 лева
        //Кактуси – 8 лева

        double totalPrice = (magnolias*3.25) + (hyacinths*4.00) + (roses*3.50) + (cactus*8);
        double priceWithTax =totalPrice - (0.05*totalPrice);

        if (priceWithTax >= giftPrice) { //Ако е в повече или равна е достатъчна.
            System.out.printf("She is left with %.0f leva.", Math.floor(priceWithTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - priceWithTax));
        }
    }
}
