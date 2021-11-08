package order;


import delivery.PostDeliveryStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;
import user.Receiver;
import user.Sender;
import user.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;

    @BeforeEach
    void setUp() {
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        List<User> users = new ArrayList<User>();
        users.add((User) receiver);
        users.add((User) sender);

        order = new Order(users, new CreditCardPaymentStrategy(), new PostDeliveryStrategy());
    }

    @Test
    void addUser() {
        Receiver receiver1 = new Receiver();
        int currentUsersLength = order.getUsers().size();
        order.addUser(receiver1);

        assertNotEquals(currentUsersLength, order.getUsers().size());
    }

    @Test
    void removeUser() {
        int currentUsersLength = order.getUsers().size();
        Receiver receiver1 = new Receiver();
        order.addUser(receiver1);
        order.removeUser(receiver1);

        assertEquals(currentUsersLength, order.getUsers().size());
    }

    @Test
    void order() {
        order.order();

        for (User user : order.getUsers()) {
            assertEquals(true, user.getStatus());
        }
    }
}