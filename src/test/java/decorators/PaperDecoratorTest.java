package decorators;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Item flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE, Color.RED);
        ((Flower) flower).setPrice(20);

        flower = new PaperDecorator(flower);

    }

    @Test
    void getPrice() {
        assertEquals(33, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("ROSE", flower.getDescription());
    }
}