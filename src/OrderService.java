public interface OrderService {
    void createOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(int orderId);
}
