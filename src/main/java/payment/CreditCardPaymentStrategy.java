package payment;


public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Successful payment " + price + "$ with credit card!";
    }
}
