package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    private Receiver receiver;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
    }

    @Test
    void update() {
        receiver.update();
        assertEquals(true, receiver.getStatus());
    }

    @Test
    void setId() {
        Receiver receiver1 = new Receiver();
        assertNotEquals(receiver.getId(), receiver1.getId());
    }
}