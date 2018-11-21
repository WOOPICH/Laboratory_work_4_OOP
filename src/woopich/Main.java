package woopich;

import woopich.inteface.Cloth;
import woopich.inteface.Jewelery;
import woopich.inteface.Priceable;

public class Main {

    public static void main(String[] args) {
        Priceable[] priceables = new Priceable[3];
        priceables[0] = new Jewelery("Earring", 149.99);
        priceables[1] = new Cloth("Blue sweater", 49.90);
        priceables[2] = new Jewelery("Golden ring", 599);
        for (Priceable pr: priceables) {
            pr.getPrice();
        }
    }
}
