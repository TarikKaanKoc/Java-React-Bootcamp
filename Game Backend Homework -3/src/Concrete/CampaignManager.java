package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService {

    @Override
    public void add(Campaign campaign) {

        System.out.println(campaign.getCampaignName()+" "+"kampanya eklendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" "+"Adlı kampanya Silindi.");

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" "+"Adlı kampanya güncellendi.");

    }
}
