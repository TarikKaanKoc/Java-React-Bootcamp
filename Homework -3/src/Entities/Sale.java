package Entities;

import Abstract.Entity;

public class Sale implements Entity {
    private int Id;
    private int gameId;
    private int gamerId;

    public Sale(){

    }
    public Sale(int id, int gameId, int gamerId) {
        setId(id);
        this.setGameId(gameId);
        this.setGamerId(gamerId);
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

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }
}
