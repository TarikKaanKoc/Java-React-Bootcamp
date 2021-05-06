package Concrete;

import Abstract.GamerService;
import Entities.Gamer;
import Utils.Valiadtion;

public class GamerManager implements GamerService {
    @Override
    public void add(Gamer gamer) {
        boolean result = Valiadtion.userChack(gamer);
        if(result){
            System.out.println(gamer.getFirstName()+" "+"Adlı oyuncu eklendi");
        }
    }
    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" "+"Adlı oyuncu silindi");

    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" "+"Adlı oyuncu güncellendi");

    }
}
