package delivery;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy deliveryWithDHL;

    @BeforeEach
    void setUp() {
        deliveryWithDHL = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        List<Item> itemList = new ArrayList<>();
        Item flower = new Flower(FlowerType.ROSE, Color.RED);
        itemList.add(flower);
        assertEquals("Delivering by DHL!", deliveryWithDHL.deliver(itemList));
    }
}