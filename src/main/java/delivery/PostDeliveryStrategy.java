package delivery;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public void deliver(List<Object> items) {
        System.out.println("Successful deliver by Post!");
    }
}
