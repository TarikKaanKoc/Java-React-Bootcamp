package Utils;

import Entities.Gamer;

public class Valiadtion {

    public static boolean userChack(Gamer gamer){
        if(gamer.getFirstName().length()>2){
            if(gamer.getNationalId().length()==11){
                return true;
            }
        }
        return false;
    }
}
