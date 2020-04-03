package structural.strategy;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class RoutePlanStrategyByPrice implements RoutePlanStrategy {

    private static RoutePlanStrategyByPrice routePlanStrategyByPrice;

    private RoutePlanStrategyByPrice(){}

    public static RoutePlanStrategyByPrice getRoutePlanStrategyByPrice() {
        if (routePlanStrategyByPrice == null) {
            routePlanStrategyByPrice = new RoutePlanStrategyByPrice();
        }
        return routePlanStrategyByPrice;
    }

    @Override
    public List<String> getBestRoute(String from, String dest) {
        List<List<String>> allRoutes = Util.getAllRoutes(from, dest);
        Queue<List<String>> pq = new PriorityQueue<>(Comparator.comparingDouble(this::getRoutePrice));
        pq.addAll(allRoutes);

        return pq.peek();
    }

    private double getRoutePrice(List<String> route) {
        double price = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            price += Facts.getPrice(route.get(i), route.get(i + 1));
        }

        return price;
    }
}
