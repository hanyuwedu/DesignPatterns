package structural.strategy;

import java.util.List;

public interface RoutePlanStrategy {
    List<String> getBestRoute(String from, String dest);
}
