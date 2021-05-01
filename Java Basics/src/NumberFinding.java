public class NumberFinding {
    public static void maim (String[] args){
        int[] sayilar = new int [] {1,2,5,7,9,11};
        int aranacak = 6;
        boolean varMi=false;

        for(int sayi : sayilar) {
            if(sayi==aranacak) {
                varMi=true;
                return;
            }
        }

        if(varMi) {
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut deðildir");
        }
        }
    }
