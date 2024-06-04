package conditionalStatementsAdvanced;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Срок на договор – текст – "one", или "two"
        //2. Тип на договор – текст – "Small", "Middle", "Large"или "ExtraLarge"
        //3. Добавен мобилен интернет – текст – "yes" или "no"
        //4. Брой месеци за плащане - цяло число в интервала [1 … 24]

        String durationOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String mobileNet = scanner.nextLine();
        Integer monthForPay = Integer.parseInt(scanner.nextLine());
        double sum = 0.00;

        switch (durationOfContract){
            case ("one"):
                if (typeOfContract.equals("Small")){
                    if (mobileNet.equals("yes")){
                        sum = (9.98 + 5.50)*monthForPay;
                    } else if (mobileNet.equals("no")){
                        sum = 9.98*monthForPay;
                    }
                } else if (typeOfContract.equals("Middle")){
                    if (mobileNet.equals("yes")){
                        sum = (18.99 + 4.35)*monthForPay;
                    } else if (mobileNet.equals("no")){
                        sum = 18.99*monthForPay;
                    }
                } else if (typeOfContract.equals("Large")){
                    if (mobileNet.equals("yes")){
                        sum = (25.98 + 4.35)*monthForPay;
                    } else if (mobileNet.equals("no")){
                        sum = 25.98*monthForPay;
                    }
                } else if (typeOfContract.equals("ExtraLarge")){
                    if (mobileNet.equals("yes")){
                        sum = (35.99 + 3.85)*monthForPay;
                    } else if (mobileNet.equals("no")){
                        sum = 35.99*monthForPay;
                    }
                }
                break;
            case ("two"):
                if (typeOfContract.equals("Small")){
                    if (mobileNet.equals("yes")){
                        sum = ((8.58 + 5.50)*monthForPay) - (0.0375*((8.58 + 5.50)*monthForPay));
                    } else if (mobileNet.equals("no")){
                        sum = (8.58*monthForPay) - (0.0375*(8.58*monthForPay));
                    }
                } else if (typeOfContract.equals("Middle")){
                    if (mobileNet.equals("yes")){
                        sum = ((17.09 + 4.35)*monthForPay) - (0.0375*((17.09 + 4.35)*monthForPay));
                    } else if (mobileNet.equals("no")){
                        sum = (17.09*monthForPay) - (0.0375*(17.09*monthForPay));
                    }
                } else if (typeOfContract.equals("Large")){
                    if (mobileNet.equals("yes")){
                        sum = ((23.59 + 4.35)*monthForPay) - (0.0375*((23.59 + 4.35)*monthForPay));
                    } else if (mobileNet.equals("no")){
                        sum = (23.59*monthForPay) - (0.0375*(23.59*monthForPay));
                    }
                } else if (typeOfContract.equals("ExtraLarge")){
                    if (mobileNet.equals("yes")){
                        sum = ((31.79 + 3.85)*monthForPay) - (0.0375*((31.79 + 3.85)*monthForPay));
                    } else if (mobileNet.equals("no")){
                        sum = (31.79*monthForPay) - (0.0375*(31.79*monthForPay));
                    }
                }
                break;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
