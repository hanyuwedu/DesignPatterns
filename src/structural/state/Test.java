package structural.state;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.breakup();
        boy.propose();
        boy.chase();

        System.out.println();

        boy.propose();
        boy.chase();

        System.out.println();

        boy.chase();
        boy.propose();
        boy.breakup();
    }
}
