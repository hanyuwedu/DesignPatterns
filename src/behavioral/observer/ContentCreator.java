package behavioral.observer;

import structural.strategy.InvalidQueryException;

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
                user.update(this.threads.peek());
            }
        }
    }

    public Message getMostRecentMessage() {
        try {
            if (!this.threads.isEmpty()) {
                return this.threads.peek();
            } else {
                throw new InvalidQueryException("There is no thread now!");
            }
        } catch (InvalidQueryException e) {
            return null;
        }
    }

    public void releaseNewMessage(Message message) {
        this.threads.push(message);
        this.notifyFollowers();
    }
}
