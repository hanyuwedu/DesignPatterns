package behavioral.command.ikeastorage;

public class Test {
    public static void main(String[] args) {
//        storageTest();
//        orderTest();
        clientTest();
    }

    public static void storageTest() {
        IkeaStorage storage = new IkeaStorage(5, 3);
        storage.updateSeats(2);
        storage.printStorage();
        storage.updateTables(3);
        storage.printStorage();
        storage.updateSeats(2);
        storage.printStorage();
    }

    public static void orderTest() {
        IkeaStorage storage = new IkeaStorage(4, 8);
        Order sellTablesOrder = new SellTablesOrder(2, storage);
        sellTablesOrder.execute();
        storage.printStorage();

        Order sellSeatsOrder = new SellSeatsOrder(3, storage);
        sellSeatsOrder.execute();
        storage.printStorage();

        Order sellCombosOrder1 = new SellCombosOrder(1, storage);
        sellCombosOrder1.execute();
        storage.printStorage();

        Order sellCombosOrder2 = new SellCombosOrder(1, storage);
        // 并不具有原子性，两个判定语句中可能只会执行一部分
        sellCombosOrder2.execute();
        storage.printStorage();
    }

    public static void clientTest() {
        Reception reception = new Reception();
        IkeaStorage storage = new IkeaStorage(4, 8);
        storage.printStorage();

        Order order1 = new SellTablesOrder(2, storage);
        Order order2 = new SellSeatsOrder(3, storage);
        Order order3 = new SellCombosOrder(1, storage);
        Order order4 = new AddSupplyOrder(3, 3, storage);

        reception.sell(order1);
        storage.printStorage();

        reception.sell(order2);
        storage.printStorage();

        reception.returnOrder();
        storage.printStorage();

        reception.sell(order3);
        storage.printStorage();

        reception.addSupply(order4);
        storage.printStorage();
    }
}
