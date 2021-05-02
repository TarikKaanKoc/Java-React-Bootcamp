package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService {

    @Override
    public void add(Campaign campaign) {

        System.out.println("kampanya eklendi. "+campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("kampanya Silindi. "+campaign.getCampaignName());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("kampanya Güncellendi. "+campaign.getCampaignName());

    }
}
