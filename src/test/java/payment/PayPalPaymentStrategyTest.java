package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy paypal;

    @BeforeEach
    void setUp() {
        paypal = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Successful payment 10.5$ with PayPal!", paypal.pay(10.5));
    }
}