package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender;

    @BeforeEach
    void setUp() {
        sender = new Sender();
    }

    @Test
    void update() {
        sender.update();
        assertEquals(true, sender.getStatus());
    }

    @Test
    void setId() {
        Sender sender1 = new Sender();
        assertNotEquals(sender.getId(), sender1.getId());
    }
}