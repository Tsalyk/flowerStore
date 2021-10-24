package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE, Color.RED);
        rose.setPrice(10);
        flowerPack = new FlowerPack(3, rose);
    }

    @Test
    void price() {
        assertEquals(30, flowerPack.price());
    }
}