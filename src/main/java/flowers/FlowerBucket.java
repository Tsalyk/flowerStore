package flowers;

import java.util.ArrayList;


public class FlowerBucket extends Item {
    private final ArrayList<FlowerPack> flowerPackArray = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackArray.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack flowerPack : flowerPackArray) {
            price += flowerPack.price();
        }

        return price;
    }

    public String getDescription() {
        String description = "";

        for (FlowerPack flowerPack : flowerPackArray) {
            description += flowerPack.toString() + "\n";
        }
        return description;
    }

}
