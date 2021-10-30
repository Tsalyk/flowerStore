package decorators;

import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE, Color.RED);
        ((Flower) flower).setPrice(20);

        flower = new BasketDecorator(flower);

    }

    @Test
    void getPrice() {
        assertEquals(24, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("ROSE", flower.getDescription());
    }
}