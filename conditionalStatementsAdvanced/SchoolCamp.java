package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;
        String sport = "";

        switch (season){
            case ("Winter"):
                if (group.equals("girls")){
                    sport = "Gymnastics";
                    sum = students * 9.60 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("boys")){
                    sport = "Judo";
                    sum = students * 9.60 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("mixed")){
                    sport = "Ski";
                    sum = students * 10.00 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                }
                break;
            case ("Spring"):
                if (group.equals("girls")){
                    sport = "Athletics";
                    sum = students * 7.20 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("boys")){
                    sport = "Tennis";
                    sum = students * 7.20 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("mixed")){
                    sport = "Cycling";
                    sum = students * 9.50 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                }
                break;
            case ("Summer"):
                if (group.equals("girls")){
                    sport = "Volleyball";
                    sum = students * 15.00 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("boys")){
                    sport = "Football";
                    sum = students * 15.00 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                } else if (group.equals("mixed")){
                    sport = "Swimming";
                    sum = students * 20.00 * nights;
                    if (students >= 10 && students < 20){
                        sum = sum - (0.05*sum);
                    } else if (students >= 20 && students < 50){
                        sum = sum - (0.15*sum);
                    } else if (students >= 50){
                        sum = sum - (0.50*sum);
                    }
                }
                break;
        }
        System.out.printf("%s %.2f lv.", sport, sum);
    }
}
