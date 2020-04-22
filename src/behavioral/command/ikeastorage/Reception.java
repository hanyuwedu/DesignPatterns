package behavioral.command.ikeastorage;

import java.util.Stack;

public class Reception {
    private Stack<Order> orderStack;

    public Reception() {
        this.orderStack = new Stack<>();
    }

    public void sell(Order order) {
        order.execute();
        orderStack.push(order);
    }

    // Only returns the last recent order
    public void returnOrder() {
        if (!orderStack.isEmpty()) {
            Order recentOrder = orderStack.pop();
            recentOrder.undo();
        }
    }

    public void addSupply(Order order) {
        sell(order);
    }
}
