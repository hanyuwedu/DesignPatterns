package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Follower implements User{
    String accountName;
    List<Message> threads;
    Boolean receiveAds;

    public Follower(String accountName, boolean receiveAds) {
        this.accountName = accountName;
        this.threads = new ArrayList<>();
        this.receiveAds = receiveAds;
    }

    @Override
    public void follow(OfficialAccount officialAccount) {
        officialAccount.addFollower(this);
    }

    @Override
    public void unfollow(OfficialAccount officialAccount) {
        officialAccount.removeFollower(this);
    }

    @Override
    public void receiveUpdate(Message message) {
        if (message.type.equals(Type.Advertisement) &&
        !this.receiveAds) {
            return;
        } else {
            this.threads.add(message);
        }
    }

    public void printThreads() {
        for (Message message : threads) {
            System.out.println(message.title);
        }
    }
}
