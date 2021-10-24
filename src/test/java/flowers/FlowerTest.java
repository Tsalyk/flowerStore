package flowers;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE, Color.RED);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        flower.setPrice(10);
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        flower.setSepalLength(5);
        assertEquals(5, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(Color.RED, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getString() {
        assertEquals("Flower(sepalLength=0.0, price=0.0, flowerType=ROSE, color=RED)", flower.toString());
    }
}
