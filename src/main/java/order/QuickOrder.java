package order;

import delivery.DHLDeliveryStrategy;
import delivery.PostDeliveryStrategy;
import flowers.*;
import lombok.Getter;
import payment.CreditCardPaymentStrategy;
import payment.PayPalPaymentStrategy;
import user.Receiver;
import user.Sender;
import user.User;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum QuickOrder {

    ROSE_BUCKET_CARD_DHL {
        @Override
        public Order createOrder() {
            Order order = new Order(this.getUsers(), new CreditCardPaymentStrategy(), new DHLDeliveryStrategy());
            FlowerBucket fb = new FlowerBucket();
            Flower flower = new Flower(FlowerType.ROSE, Color.RED);
            flower.setPrice(25);
            fb.addFlowerPack(new FlowerPack(15, flower));
            order.addItem(fb);

            return order;
        }
    },
    ROSE_BUCKET_PAYPAL_DHL {
        @Override
        public Order createOrder() {
            Order order = new Order(this.getUsers(), new PayPalPaymentStrategy(), new DHLDeliveryStrategy());
            FlowerBucket fb = new FlowerBucket();
            Flower flower = new Flower(FlowerType.ROSE, Color.RED);
            flower.setPrice(25);
            fb.addFlowerPack(new FlowerPack(15, flower));
            order.addItem(fb);

            return order;
        }
    },
    ROSE_BUCKET_CREDIT_POST {
        @Override
        public Order createOrder() {
            Order order = new Order(this.getUsers(), new CreditCardPaymentStrategy(), new PostDeliveryStrategy());
            FlowerBucket fb = new FlowerBucket();
            Flower flower = new Flower(FlowerType.ROSE, Color.RED);
            flower.setPrice(25);
            fb.addFlowerPack(new FlowerPack(15, flower));
            order.addItem(fb);

            return order;
        }
    },
    ROSE_BUCKET_PAYPAL_POST {
        @Override
        public Order createOrder() {
            Order order = new Order(this.getUsers(), new PayPalPaymentStrategy(), new PostDeliveryStrategy());
            FlowerBucket fb = new FlowerBucket();
            Flower flower = new Flower(FlowerType.ROSE, Color.RED);
            flower.setPrice(25);
            fb.addFlowerPack(new FlowerPack(15, flower));
            order.addItem(fb);

            return order;
        }
    };

    private List<User> users;

    QuickOrder() {
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        List<User> users = new ArrayList<User>();
        users.add(receiver);
        users.add(sender);
        this.users = users;
    }

    public abstract Order createOrder();
}
