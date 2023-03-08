public class OldOrderServiceImpl implements OrderService {
    @Override
    public void createOrder(Order order) {
        System.out.println("Creating order in the old application");
        // Implementazione dell'aggiunta dell'ordine nell'applicazione vecchia
    }

    @Override
    public void updateOrder(Order order) {
        System.out.println("Updating order in the old application");
        // Implementazione dell'aggiornamento dell'ordine nell'applicazione vecchia
    }

    @Override
    public void deleteOrder(int orderId) {
        System.out.println("Deleting order in the old application");
        // Implementazione dell'eliminazione dell'ordine nell'applicazione vecchia
    }
}
