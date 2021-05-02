package Entities;

import Abstract.Entity;

public class Game implements Entity {

    private int Id;
    private int price;
    private String gameName;

    public Game(){

    }
    public Game(int id, int price, String gameName, String userName) {
        setId(id);
        this.setPrice(price);
        this.setGameName(gameName);
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
