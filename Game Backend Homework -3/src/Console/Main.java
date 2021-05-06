package Console;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.*;

public class Main {

    public static void main(String[] args) {


        // Game - oyun
        Game game = new Game();
        game.setGameName("Pubg");
        game.setPrice(100);
        game.setId(1);

        // Gamer - oyuncu
        Gamer gamer = new Gamer();
        gamer.setId(1);
        gamer.setFirstName("Tarık kaan");
        gamer.setLastName("Koç");
        gamer.setNationalId("49859342311");
        gamer.setYearOfbirth(2001);

        // Sale - Satış
        Sale sale = new Sale();
        sale.setGameId(1);
        sale.setGamerId(1);
        sale.setId(1321313);

        // Campaign - kampanya
        Campaign campaign = new Campaign();
        campaign.setCampaignName("Sevgililer günü kampanyası");
        campaign.setDiscount(25);
        campaign.setGameId(1);
        campaign.setId(1);

        GameManager gameManager = new GameManager();
        gameManager.add(game);

        System.out.println("********************");

        GamerManager gamerManager= new GamerManager();
        gamerManager.add(gamer);
        System.out.println("********************");

        SaleManager saleManager = new SaleManager();
        saleManager.add(sale,game,gamer);
        System.out.println("********************");

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.delete(campaign);
        System.out.println("********************");

    }
}