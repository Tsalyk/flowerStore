package delivery;

import flowers.Item;
import java.util.List;

public interface Delivery {

    String deliver(List<Item> items);
}
