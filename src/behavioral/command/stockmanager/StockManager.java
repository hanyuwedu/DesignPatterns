package behavioral.command.stockmanager;

import java.util.Stack;

public class StockManager {
    Stack<Order> orderStack;

    public StockManager() {
        this.orderStack = new Stack<>();
    }

    public void placeOrder(Order order) {
        order.execute();
        this.orderStack.push(order);
    }

    public void revokeRecentOrder() {
        Order order = this.orderStack.pop();
        order.undo();
    }
}
