public class FirendsNumbers {
    public static void main(String[]args){
        //220 ve 284. Kendileri hariç pozitif tam bölenlerinin toplamý birbirine eþit olan sayýlar.

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i=1;i<number1;i++) {
            if(number1%i==0) {
                total1 = total1+i;
            }
        }

        for(int i=1;i<number1;i++) {
            if(number2%i==0) {
                total2 = total2+i;
            }
        }

        if(number1==total2 && number2==total1) {
            System.out.println("Bu iki sayı arkadaştır");
        }else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }

    }
}
