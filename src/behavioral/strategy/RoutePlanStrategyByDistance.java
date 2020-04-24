package behavioral.strategy;

import java.util.*;

public class RoutePlanStrategyByDistance implements RoutePlanStrategy{

    private static RoutePlanStrategyByDistance routePlanStrategyByDistance;

    private RoutePlanStrategyByDistance(){}

    public static RoutePlanStrategyByDistance getRoutePlanStrategyByDistance() {
        if (routePlanStrategyByDistance == null) {
            routePlanStrategyByDistance = new RoutePlanStrategyByDistance();
        }
        return routePlanStrategyByDistance;
    }

    @Override
    public List<String> getBestRoute(String from, String dest) {
        List<List<String>> allRoutes = Util.getAllRoutes(from, dest);
        Queue<List<String>> pq = new PriorityQueue<>(Comparator.comparingDouble(this::getRouteDistance));
        pq.addAll(allRoutes);

        return pq.peek();
    }

    private double getRouteDistance(List<String> route) {
        double distance = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            distance += Facts.getDistance(route.get(i), route.get(i + 1));
        }

        return distance;
    }
}
