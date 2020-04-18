package behavioral.observer;

public interface OfficialAccount {
    void addFollower(User user);
    void removeFollower(User user);
    void notifyFollowers();
    //注意接口中并不应该有
}
