package flowers;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private List<Flower> flowers;
    private Double price;
    private Double sepalLength;
    private Color color;
    private FlowerType flowerType;
    private List<Flower> filteredFlowers;

    public Filter(List<Flower> flowers, Double price, Double sepalLength, Color color, FlowerType flowerType) {
        this.flowers = flowers;
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;
        this.flowerType = flowerType;
        this.filteredFlowers = flowers;
    }

    public void filterByPrice() {
        filteredFlowers = filteredFlowers.stream().
                          filter(flower -> flower.getPrice() == price).
                          collect(Collectors.toList());

    }

    public void filterBySepalLength() {
        filteredFlowers = filteredFlowers.stream().
                filter(flower -> flower.getSepalLength() == sepalLength).
                collect(Collectors.toList());
    }

    public void filterByColor() {
        filteredFlowers = filteredFlowers.stream().
                filter(flower -> flower.getColor() == color).
                collect(Collectors.toList());
    }

    public void filterByFlowerType() {
        filteredFlowers = filteredFlowers.stream().
                filter(flower -> flower.getFlowerType() == flowerType).
                collect(Collectors.toList());
    }

    public void filter() {
        if (price != null) {
            this.filterByPrice();
        }
        if (sepalLength != null) {
            this.filterBySepalLength();
        }
        if (color != null) {
            this.filterByColor();
        }
        if (flowerType != null) {
            this.filterByFlowerType();
        }
    }

    public void resetFilters() {
        this.filteredFlowers = this.flowers;
    }

    public List<Flower> getFilteredFlowers() {
        return filteredFlowers;
    }
}
