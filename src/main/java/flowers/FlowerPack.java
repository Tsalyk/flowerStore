package flowers;

public class FlowerPack {
    private int amount;
    private Flower flower;

    public FlowerPack(int amount, Flower flower) {
        this.amount = amount;
        this.flower = flower;
    }

    public double price() {
        return flower.getPrice() * amount;
    }
}
