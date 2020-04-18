package behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Follower normalFan = new Follower("NormalFan", false);
        Follower zombieFan = new Follower("ZombieFan", true);

        ContentCreator sportNews = new ContentCreator("SportNews");
        ContentCreator nature = new ContentCreator("Nature");

        normalFan.follow(sportNews);
        normalFan.follow(nature);

        zombieFan.follow(sportNews);
        zombieFan.follow(nature);

        sportNews.releaseNewMessage(new Message("Liverpool wins supreme league championship",
                Type.Article,
                "Due to the cronovirus, Liverpool wins the championship with 82 score, leading the second place Manchester city by 25"));
        nature.releaseNewMessage(new Message("Covid-19 spread",
                Type.Article,
                "Covide-19 has been caused 2.256.844 confirmed cases and 154.350 deaths"));

        sportNews.releaseNewMessage(new Message("Adidas Ads",
                Type.Advertisement,
                "Look at Lionel Messi's latest soccer shoes!"));

        nature.releaseNewMessage(new Message("Quantum Teleportation",
                Type.Article,
                "Physicists Just Achieved The First-Ever Quantum Teleportation Between Computer Chips."));
        System.out.println("Zombie fan's threads:");
        zombieFan.printThreads();
        System.out.println();

        System.out.println("Normal fan's threads:");
        normalFan.printThreads();
    }
}
