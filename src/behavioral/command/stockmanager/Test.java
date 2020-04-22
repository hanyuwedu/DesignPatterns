package behavioral.command.stockmanager;

public class Test {
    public static void main(String[] args) {
//        storageTest();
//        orderTest();
        stockManagerTest();
    }

    public static void storageTest() {
        Storage storage = new Storage(5);
        storage.printStorage();
        storage.updateUnit(-3);
        storage.printStorage();
        storage.updateUnit(-1);
        storage.printStorage();
    }

    public static void orderTest() {
        Storage storage = new Storage(5);
        Order order1 = new SellOrder(storage, 2);
        Order order2 = new SupplyOrder(storage, 3);
        Order order3 = new ClearOrder(storage);

        order1.execute();
        storage.printStorage();
        order2.execute();
        storage.printStorage();
        order2.undo();
        storage.printStorage();
        order3.execute();
        storage.printStorage();
        order3.undo();
        storage.printStorage();
    }

    public static void stockManagerTest() {
        Storage storage = new Storage(5);
        Order order1 = new SellOrder(storage, 2);
        Order order2 = new SupplyOrder(storage, 3);
        Order order3 = new ClearOrder(storage);

        StockManager stockManager = new StockManager();
        stockManager.placeOrder(order1);
        storage.printStorage();
        stockManager.placeOrder(order2);
        storage.printStorage();
        stockManager.revokeRecentOrder();
        storage.printStorage();
        stockManager.placeOrder(order3);
        storage.printStorage();
        stockManager.revokeRecentOrder();
        storage.printStorage();
    }
}
