package decorators;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    public BasketDecorator(Item item) {
        super(item);
        this.item = item;
    }

    public double getPrice() {
        return 4 + item.getPrice();
    }

    public String getDescription() {
        return item.getDescription();
    }
}
