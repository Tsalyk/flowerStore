package decorators;

import flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return 40 + super.getPrice();
    }

    public String getDescription() {
        return super.getDescription();
    }
}
