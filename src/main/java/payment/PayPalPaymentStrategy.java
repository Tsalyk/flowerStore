package payment;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        System.out.println("Successful payment" + price + "$ with PayPal!");

        Flower flower = new Flower(FlowerType.ROSE, Color.RED);

        return true;
    }
}
