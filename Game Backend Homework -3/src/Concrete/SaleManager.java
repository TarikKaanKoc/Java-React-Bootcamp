package Concrete;

import Abstract.SaleService;
import Entities.*;


public class SaleManager implements SaleService {


    @Override
    public void add(Sale sale, Game game, Gamer gamer) {
        System.out.println("Sayın"+" "+gamer.getFirstName()+" "+sale.getId()+" "+" İd'li Siparişiniz eklenmiştir.");
    }

    @Override
    public void delete(Sale sale, Game game, Gamer gamer) {
        System.out.println(sale.getId()+"'İd'li siparişiniz silinmiştir");

    }

    @Override
    public void update(Sale sale, Game game, Gamer gamer) {
        System.out.println("Sayın "+gamer.getFirstName()+" "+sale.getId()+"İd'li Siparişiniz güncellenmiştir.");

    }
}
