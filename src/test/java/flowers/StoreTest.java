package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store st;

    @BeforeEach
    void setUp() {
        Flower rose1 = new Flower(FlowerType.ROSE, Color.RED);
        rose1.setPrice(10);
        Flower rose2 = new Flower(FlowerType.ROSE, Color.RED);
        rose2.setPrice(15);
        Flower rose3 = new Flower(FlowerType.ROSE, Color.RED);
        rose3.setPrice(20);
        Flower chamomile1 = new Flower(FlowerType.CHAMOMILE, Color.GREEN);
        chamomile1.setPrice(15);
        Flower tulip1 = new Flower(FlowerType.TULIP, Color.BLACK);
        tulip1.setPrice(20);

        Flower [] flowers = {rose1, rose2, rose3, chamomile1, tulip1};

        this.st = new Store();
        for (Flower flower : flowers) {
            st.addFlower(flower);
        }
    }

    @Test
    void searchByPrice() {
        assertEquals(2, st.search(15.0, null, null, null).size());
    }

    @Test
    void searchByFlowerType() {
        assertEquals(3, st.search(null, null, FlowerType.ROSE, null).size());
    }

    @Test
    void searchByColor() {
        assertEquals(1, st.search(null, null, null, Color.BLACK).size());
    }
}