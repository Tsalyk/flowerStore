package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowerType, Color color) {
        this.flowerType = flowerType;
        this.color = color;
    }
}
