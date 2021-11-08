package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    private Order order;

    @BeforeEach
    void SetUP() {
        QuickOrder order = QuickOrder.ROSE_BUCKET_PAYPAL_DHL;
        this.order = order.createOrder();
    }

    @Test
    void takeOrder() {
        assertEquals(375, order.calculateTotalPrice());
    }
}