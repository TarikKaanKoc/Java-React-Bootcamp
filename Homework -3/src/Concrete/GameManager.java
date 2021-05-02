package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {


    @Override
    public void add(Game game) {
         System.out.println(game.getGameName()+" "+"Oyunu Eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" "+"Oyunu Silindi");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" "+"Oyunu Güncellendi");

    }
}
