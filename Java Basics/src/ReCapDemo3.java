public class ReCapDemo3 {

    public static void main(String[]args){

        int number = 26;
        int remender = number%2;
        boolean inPrime = false;

        if(number==1){
            System.out.println("Sayı Asaldır");
            return;
        }
        else if(number<1){
            System.out.println("Lütfen0'dan büyükr bir rakam giriniz");
        return; }

        for(int i=2;i<number;i++){
            if( number %i == 0){
                inPrime = false;
            }
        }
        if(inPrime){
            System.out.println("Sayı Asaldır.");
        } else  System.out.println("Sayı Asal Değildir.");
    }
}
