package ForLoop;

public class NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 1000; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
        // for (int i = 7; i <= 997; i = i + 10){
        //      System.out.println(i);
        // }
    }
}
