package conditionalStatements;

import java.util.Scanner;

public class PipesINpool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1Debit = pipe1 * hours; //Литрите вода за времето, в което работникът е отсъствал.
        double pipe2Debit = pipe2 * hours; //Литрите вода за времето, в което работникът е отсъствал.

        double totalDebit = pipe1Debit + pipe2Debit; //Общото количество

        double percent = (totalDebit*100)/volume; //Изчислението за намиране на количеството вода в проценти.
        double percentPipe1 = (pipe1Debit*100)/totalDebit; //Изчислението за процентите, с които е спомогнала първата тръба.
        double percentPipe2 = (pipe2Debit*100)/totalDebit; //Изчислението за процентите, с които е спомогнала втората тръба.

        if (totalDebit <= volume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percent, percentPipe1, percentPipe2);
        } else if (volume < totalDebit) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, totalDebit-volume);
        }
    }
}
