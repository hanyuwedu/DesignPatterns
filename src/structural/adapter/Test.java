package structural.adapter;

public class Test {
    public static void main(String[] args) {
        Diaosi hart = new Diaosi("Kevin Hart");
        Prince adapter = new PrinceAdapter(hart);

        adapter.comfort();
        System.out.println();

        adapter.drive();
        System.out.println();

        adapter.dining();
    }
}
