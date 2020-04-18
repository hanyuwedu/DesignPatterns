package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Follower implements User{
    String accountName;
    List<OfficialAccount> subscriptions;
    List<Message> threads;
    Boolean receiveAds;

    public Follower(String accountName, boolean receiveAds) {
        this.accountName = accountName;
        this.subscriptions = new ArrayList<>();
        this.threads = new ArrayList<>();
        this.receiveAds = receiveAds;
    }

    @Override
    public void follow(OfficialAccount officialAccount) {
        this.subscriptions.add(officialAccount);
        officialAccount.addFollower(this);
    }

    @Override
    public void unfollow(OfficialAccount officialAccount) {
        this.subscriptions.remove(officialAccount);
        officialAccount.removeFollower(this                    );
    }

    public void update(OfficialAccount officialAccount) {
        ContentCreator contentCreator = (ContentCreator) officialAccount;   //这里把接口具像化来处理具体的逻辑
        if (contentCreator.getMostRecentMessage().type.equals(Type.Advertisement) &&
        !this.receiveAds) {
            return;
        } else {
            this.threads.add(contentCreator.getMostRecentMessage());
        }
    }

    public void printThreads() {
        for (Message message : threads) {
            System.out.println(message.title);
        }
    }
}
