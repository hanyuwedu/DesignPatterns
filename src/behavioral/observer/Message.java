package behavioral.observer;

public class Message {
    String title;
    Type type;
    String content;

    public Message(String title, Type type, String content) {
        this.title = title;
        this.type = type;
        this.content = content;
    }
}
