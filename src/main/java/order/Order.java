package order;

import delivery.Delivery;
import flowers.Item;
import lombok.Getter;
import payment.Payment;
import user.User;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<User> users;
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(List<User> users, Payment payment, Delivery delivery) {
        this.users = users;
        this.payment = payment;
        this.delivery = delivery;
        this.items = new ArrayList<Item>();
    }

    public void setPaymentStrategy(Payment payment) {
        payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        delivery = delivery;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update();
        }
    }

    public void order() {
        this.notifyUsers();
    }
}
