package flowers;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers = new ArrayList<Flower>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(Double price, Double sepalLength, FlowerType flowerType, Color color) {
        Filter filter = new Filter(flowers, price, sepalLength, color, flowerType);
        filter.filter();
        List<Flower> filteredFlowers = filter.getFilteredFlowers();

        return filteredFlowers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "flowers=" + flowers +
                '}';
    }
}
