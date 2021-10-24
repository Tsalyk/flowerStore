package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE, Color.RED);
        rose.setPrice(20);
        FlowerPack flowerPack1 = new FlowerPack(3, rose);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack1);
    }

    @Test
    void getPrice() {
        Flower chamomile = new Flower(FlowerType.CHAMOMILE, Color.RED);
        chamomile.setPrice(15);
        FlowerPack flowerPack2 = new FlowerPack(5, chamomile);

        flowerBucket.addFlowerPack(flowerPack2);

        assertEquals(135.0, flowerBucket.getPrice());
    }
}