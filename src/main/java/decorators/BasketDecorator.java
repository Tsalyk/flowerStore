package decorators;

import flowers.Item;

public class BasketDecorator {
    private Item item;

    public double getPrice() {
        return 4 + item.getPrice();
    }

    public String getDescription() {
        return item.getDescription();
    }
}
