package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPackArray = new ArrayList<FlowerPack>();

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
}
