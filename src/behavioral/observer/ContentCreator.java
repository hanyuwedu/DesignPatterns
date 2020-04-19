package behavioral.observer;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ContentCreator implements OfficialAccount {
    String accountName;
    Stack<Message> threads;
    Set<User> followers;

    public ContentCreator(String accountName) {
        this.accountName = accountName;
        this.threads = new Stack<>();
        this.followers = new HashSet<>();
    }

    @Override
    public void addFollower(User user) {
        this.followers.add(user);
    }

    @Override
    public void removeFollower(User user) {
        if (this.followers.contains(user)) {
            this.followers.remove(user);
        }
    }

    @Override
    public void notifyFollowers() {
        if (!this.threads.isEmpty()) {
            for (User user : followers) {
                user.update(this);
            }
        }
    }

    public void releaseNewMessage(Message message) {
        this.threads.push(message);
        this.notifyFollowers();
    }

    public Message getMostRecentMessage() {
        if (!this.threads.isEmpty()) {
            return this.threads.peek();
        } else {
            return null;
        }
    }
}
