package ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int taxes = 0;

        for (int i = 0; i < n; i++){ //започва се от нула, защото ако се започне от 1 няма да преброи пър
            String website = scanner.nextLine();

            switch (website){
                case ("Facebook"):
                    taxes = taxes + 150;
                    break;
                case ("Instagram"):
                    taxes = taxes + 100;
                    break;
                case ("Reddit"):
                    taxes = taxes + 50;
                    break;
            }

            if (taxes >= salary){
                System.out.println("You have lost your salary.");
                return;
            }
        }
        if ((salary - taxes) > 0) {
            System.out.printf("%d", salary - taxes);
        }
    }
}
