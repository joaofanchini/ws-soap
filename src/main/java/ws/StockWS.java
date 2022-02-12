package ws;

import domain.item.Item;
import domain.stock.Stock;

import javax.jws.WebService;

@WebService
public class StockWS {
    private final Stock stock = new Stock();

    public Integer getQuantity() {
        return stock.getQuantity();
    }

    public void setItem(Item item) {
        stock.setItens(item);
    }
}
