package behavioral.observer;

public interface OfficialAccount {
    void addFollower(User user);
    void removeFollower(User user);
    void notifyFollowers();
}
