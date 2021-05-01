public class Switch {
    public static void main(String[]args){

        char grade = 'A';

        switch (grade) {

            case 'A': System.out.println("Mukemmel : Geçtiniz."); break;
            case 'B': System.out.println("çok iyi  : Geçtiniz."); break;
            case 'C': System.out.println("iyi : Geçtiniz."); break;
            case 'D': System.out.println("Fena değil : Geçtiniz."); break;
            case 'F': System.out.println("Maalesef : Kaldınız."); break;

            default: System.out.println("Geçersiz not girdiniz"); break;
        }
    }
}
