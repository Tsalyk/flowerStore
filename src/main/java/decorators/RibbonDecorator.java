package decorators;

import flowers.Item;

public class RibbonDecorator {
    private Item item;

    public double getPrice() {
        return 40 + item.getPrice();
    }

    public String getDescription() {
        return item.getDescription();
    }
}
