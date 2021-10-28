package payment;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        System.out.println("Successful payment" + price + "$ with credit card!");

        Flower flower = new Flower(FlowerType.ROSE, Color.RED);

        return true;
    }
}
