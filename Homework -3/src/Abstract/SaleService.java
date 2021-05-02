package Abstract;

import Entities.*;

public interface SaleService {

    void add(Sale sale, Game game, Gamer gamer);
    void delete(Sale sale, Game game, Gamer gamer);
    void update(Sale sale, Game game, Gamer gamer);


}
