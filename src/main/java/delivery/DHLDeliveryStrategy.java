package delivery;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public void deliver(List<Object> items) {
        System.out.println("Successful deliver by DHL!");
    }
}
