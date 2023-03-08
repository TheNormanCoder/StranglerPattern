import java.util.Random;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new StranglerOrderServiceImpl();

        // Esempio di utilizzo
        Order order1 = new Order(1, "Item 1", 10.0);
        orderService.createOrder(order1);

        Order order2 = new Order(2, "Item 2", 20.0);
        orderService.updateOrder(order2);

        orderService.deleteOrder(1);

        Order order3 = new Order(3, "Item 3", 150.0);
        orderService.createOrder(order3);
    }
}

