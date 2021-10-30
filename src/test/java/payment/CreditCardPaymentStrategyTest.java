package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy card;

    @BeforeEach
    void setUp() {
        card = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Successful payment 10.5$ with credit card!", card.pay(10.5));
    }
}