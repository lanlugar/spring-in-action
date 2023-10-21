package sia.tacocloud.data;

import sia.tacocloud.TacoOrder;

public interface OrderRepository {
    public TacoOrder save(TacoOrder tacoOrder);
}
