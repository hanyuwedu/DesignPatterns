package behavioral.observer;

public interface User {
    void follow(OfficialAccount officialAccount);
    void unfollow(OfficialAccount officialAccount);
    void update(OfficialAccount officialAccount);
}
