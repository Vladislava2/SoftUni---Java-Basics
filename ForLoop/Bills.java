package ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityBills = 0.00;
        double waterBills = 20.0;
        double internetBills = 15.00;
        double otherBills = (electricityBills + waterBills + internetBills) + 0.20*(electricityBills + waterBills + internetBills);
        double avg = 0.00;

        for(int i = 1; i<= months; i++){
            Double electricity = Double.parseDouble(scanner.nextLine());

            electricityBills = electricityBills + electricity;
            waterBills = waterBills + 20;
            internetBills = internetBills + 15;


        }
    }
}
