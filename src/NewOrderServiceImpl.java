public class NewOrderServiceImpl implements OrderService {
    @Override
    public void createOrder(Order order) {
        System.out.println("Creating order in the new application");
        // Implementazione dell'aggiunta dell'ordine nella nuova applicazione
    }

    @Override
    public void updateOrder(Order order) {
        System.out.println("Updating order in the new application");
        // Implementazione dell'aggiornamento dell'ordine nella nuova applicazione
    }

    @Override
    public void deleteOrder(int orderId) {
        System.out.println("Deleting order in the new application");
        // Implementazione dell'eliminazione dell'ordine nella nuova applicazione
    }
}
