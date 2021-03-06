package domain.item;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
    private final String name;
    private final String price;

    public Item() {
        name="";
        price="";
    }

    public Item(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
