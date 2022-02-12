package domain.stock;

import domain.item.Item;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Stock {
    List<Item> itens = new ArrayList<>();

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(Item item) {
        this.itens.add(item);
    }

    public Integer getQuantity(){
        return this.itens.size();
    }
}
