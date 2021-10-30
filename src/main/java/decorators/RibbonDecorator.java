package decorators;

import flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public RibbonDecorator(Item item) {
        super(item);
        this.item = item;
    }

    public double getPrice() {
        return 40 + item.getPrice();
    }

    public String getDescription() {
        return item.getDescription();
    }
}
