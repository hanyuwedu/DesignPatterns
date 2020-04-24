package structural.strategy;

public class Test {
    public static void main(String[] args) {
        //factsTest();
        //utilTest();
//        distanceTest();
//        priceTest();
        integrateTest();
    }

    private static void integrateTest() {
        RoutePlanner routePlanner = new RoutePlanner();
        routePlanner.planRoute("Munich", "Rome");
        System.out.println();

        System.out.println("Planning Munich to Rome by shortest distance:");
        routePlanner.setStrategy(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance());
       routePlanner.planRoute("Munich", "Rome");
        System.out.println();

        System.out.println("Planning Munich to Rome by lowest price:");
        routePlanner.setStrategy(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice());
        routePlanner.planRoute("Munich", "Rome");
        System.out.println();

    }

    private static void priceTest() {
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Munich", "Rome"));
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Rome", "Munich"));
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Munich", "Paris"));
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Paris", "Munich"));
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Paris", "Rome"));
        System.out.println(RoutePlanStrategyByPrice.getRoutePlanStrategyByPrice().getBestRoute("Rome", "Paris"));
    }

    private static void distanceTest() {
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Munich", "Rome"));
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Rome", "Munich"));
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Munich", "Paris"));
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Paris", "Munich"));
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Paris", "Rome"));
        System.out.println(RoutePlanStrategyByDistance.getRoutePlanStrategyByDistance().getBestRoute("Rome", "Paris"));
    }

    private static void factsTest() {
        System.out.println(Facts.getDistance("Munich", "paris"));
        System.out.println(Facts.getDistance("Paris", "munich"));

        System.out.println(Facts.getDistance("paris", "rome"));
        System.out.println(Facts.getDistance("rome", "paris"));

        System.out.println(Facts.getDistance("rome", "munich"));
        System.out.println(Facts.getDistance("munich", "rome"));

        System.out.println(Facts.getDistance("Paris", "paris"));
        System.out.println(Facts.getDistance("Paris", "amsterdam"));

        System.out.println(Facts.getPrice("Munich", "paris"));
        System.out.println(Facts.getPrice("Paris", "munich"));

        System.out.println(Facts.getPrice("paris", "rome"));
        System.out.println(Facts.getPrice("rome", "paris"));

        System.out.println(Facts.getPrice("rome", "munich"));
        System.out.println(Facts.getPrice("munich", "rome"));

        System.out.println(Facts.getPrice("Paris", "paris"));
        System.out.println(Facts.getPrice("Paris", "amsterdam"));
    }

    private static void utilTest() {
        System.out.println(Util.getAllRoutes("Munich", "Paris"));
        System.out.println(Util.getAllRoutes("Paris", "Munich"));
        System.out.println(Util.getAllRoutes("Munich", "Rome"));
        System.out.println(Util.getAllRoutes("Rome", "Munich"));
        System.out.println(Util.getAllRoutes("Rome", "Paris"));
        System.out.println(Util.getAllRoutes("Paris", "Rome"));
    }
}
