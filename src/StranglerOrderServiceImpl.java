import java.util.Random;

public class StranglerOrderServiceImpl implements OrderService {
    private OldOrderServiceImpl oldOrderService = new OldOrderServiceImpl();
    private NewOrderServiceImpl newOrderService = new NewOrderServiceImpl();

    @Override
    public void createOrder(Order order) {
        if (shouldUseNewService()) {
            newOrderService.createOrder(order);
        } else {
            oldOrderService.createOrder(order);
        }
    }

    @Override
    public void updateOrder(Order order) {
        if (shouldUseNewService()) {
            newOrderService.updateOrder(order);
        } else {
            oldOrderService.updateOrder(order);
        }
    }

    @Override
    public void deleteOrder(int orderId) {
        if (shouldUseNewService()) {
            newOrderService.deleteOrder(orderId);
        } else {
            oldOrderService.deleteOrder(orderId);
        }
    }

    private boolean shouldUseNewService() {
        // Implementazione della logica per determinare se utilizzare il nuovo servizio o meno
        // In questo caso, si utilizza il nuovo servizio per gli ordini con un prezzo maggiore di 100
        return new Random().nextInt(2) == 0; // Scelta casuale
    }
}
