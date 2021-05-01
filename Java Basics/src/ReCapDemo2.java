public class ReCapDemo2 {
    public static void main(String[] args) {

        double[] myList={1.1,1.2,1.3,1.4,1.5};
        double  total=0;
        double maximum= myList[0];

        for (double number: myList){
            if(number>maximum){
                maximum=number;
            }
            total=total+number;
            System.out.println(number);
        }

        System.out.println("********************");

        System.out.println("Toplam : "+total);
        System.out.println("En büyük ondalıklı sayı : "+maximum);
    }
}