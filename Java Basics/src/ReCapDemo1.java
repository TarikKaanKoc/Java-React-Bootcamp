public class ReCapDemo1 {

    public static void main(String[]args) {

        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        int big = number1;

        if (big < number2) {
            big = number2;
        }
        if  (big < number3) {
            big = number3;

        }
        System.out.println(big);
    }
}
