package decorators;

import flowers.Item;

public abstract class PaperDecorator {
    private Item item;

    public double getPrice() {
        return 13 + item.getPrice();
    }

    public String getDescription() {
        return item.getDescription();
    }
}
