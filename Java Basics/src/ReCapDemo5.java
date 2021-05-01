public class ReCapDemo5 {
    public static void main(String[]args){

        // kalın sesli harfleri bulma prog.
        char harf='A';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harfitri"); break;
            default: System.out.println("Kalın sesli harf değildir."); break;
        }
    }
}
