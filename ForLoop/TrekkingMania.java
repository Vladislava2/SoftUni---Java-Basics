package ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int totalPeople = 0;

        int MusalaPeople = 0;
        int MontblancPeople = 0;
        int KilimanjaroPeople = 0;
        int K2People = 0;
        int EverestPeople = 0;

        for (int i = 0; i < groups; i++) {
            int peopleInGroups = Integer.parseInt(scanner.nextLine());

            totalPeople = totalPeople + peopleInGroups;

            if (peopleInGroups <= 5){
                MusalaPeople = MusalaPeople + peopleInGroups;
            } else if (peopleInGroups <= 12){
                MontblancPeople = MontblancPeople + peopleInGroups;
            } else if (peopleInGroups <= 25){
                KilimanjaroPeople = KilimanjaroPeople + peopleInGroups;
            } else if (peopleInGroups <= 40){
                K2People = K2People + peopleInGroups;
            } else if (peopleInGroups >= 41) {
                EverestPeople = EverestPeople + peopleInGroups;
            }
        }
        System.out.printf("%.2f%%%n", MusalaPeople * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", MontblancPeople * 1.0/ totalPeople * 100);
        System.out.printf("%.2f%%%n", KilimanjaroPeople * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", K2People * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", EverestPeople * 1.0 / totalPeople * 100);
    }
}
