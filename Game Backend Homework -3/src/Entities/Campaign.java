package Entities;

import Abstract.Entity;

public class Campaign implements Entity {

    private int Id;
    private int gameId;
    private String campaignName;
    private double discount;

    public Campaign(){

    }
    public Campaign(int id, int gameId, String campaignName, double discount) {
        setId(id);
        this.setGameId(gameId);
        this.setCampaignName(campaignName);
        this.setDiscount(discount);
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
