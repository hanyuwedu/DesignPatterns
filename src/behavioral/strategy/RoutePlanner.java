package structural.strategy;

import exceptions.InvalidQueryException;

import java.util.List;

public class RoutePlanner {
    public void planRoute(String from, String dest) {
        if (this.strategy == null) {
            try {
                throw new InvalidQueryException("Route Planning Strategy not set yet!");
            } catch (InvalidQueryException e) {
                e.printStackTrace();
            }
            return;
        }

        List<String> route = this.strategy.getBestRoute(from, dest);
        StringBuilder builder = new StringBuilder();
        builder.append("The best route is following: ");
        for (int i = 0; i < route.size() - 1; i++) {
            builder.append("From ");
            builder.append(Util.toCityName(route.get(i)));
            builder.append(" to ");
            builder.append(Util.toCityName(route.get(i + 1)));
            builder.append(", ");
        }
        builder.replace(builder.length() - 2, builder.length(), ".");
        System.out.println(builder.toString());
    }

    private RoutePlanStrategy strategy;

    public void setStrategy(RoutePlanStrategy routePlanStrategy) {
        this.strategy = routePlanStrategy;
    }
}
