package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower extends Item {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowerType, Color color) {
        this.flowerType = flowerType;
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return flowerType.toString();
    }

}
