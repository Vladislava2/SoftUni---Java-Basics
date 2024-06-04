package ExamPrep;

import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maidenPartyPrice = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int rosesFromWax = Integer.parseInt(scanner.nextLine());
        int keychain = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int luckSurprise = Integer.parseInt(scanner.nextLine());

        int totalProducts = loveLetters + rosesFromWax + keychain + cartoons + luckSurprise;
        double totalSum = loveLetters * 0.60 + rosesFromWax * 7.2 + keychain * 3.60 + cartoons * 18.2 + luckSurprise * 22;

        if (totalProducts >= 25){
            totalSum = totalSum - (totalSum * 0.35);
        }

        double totalSumWithHosting = totalSum - (totalSum * 0.10);

        if (totalSumWithHosting >= maidenPartyPrice){
            System.out.printf("Yes! %.2f lv left.%n", totalSumWithHosting - maidenPartyPrice);
        } else if (totalSumWithHosting < maidenPartyPrice){
            System.out.printf("Not enough money! %.2f lv needed.", maidenPartyPrice - totalSumWithHosting);
        }
    }
}
