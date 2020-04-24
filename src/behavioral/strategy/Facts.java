package behavioral.strategy;

import exceptions.InvalidQueryException;

import java.util.HashMap;
import java.util.Map;

public class Facts {
    public static Map<String, Map<String, Double>> distance() {
        Map<String, Map<String, Double>> distance = new HashMap<>();

        Map<String, Double> mr = new HashMap<>();
        mr.put("rome", 1000.0);

        Map<String, Double> mp = new HashMap<>();
        mp.put("paris", 800.0);

        Map<String, Double> pr = new HashMap<>();
        pr.put("rome", 1500.0);

        distance.put("munich", mr);
        distance.get("munich").put("paris", 800.0);
        distance.put("paris", pr);

        return distance;
    }

    public static Map<String, Map<String, Double>> price() {
        Map<String, Map<String, Double>> price = new HashMap<>();

        Map<String, Double> mr = new HashMap<>();
        mr.put("rome", 200.0);

        Map<String, Double> mp = new HashMap<>();
        mp.put("paris", 100.0);

        Map<String, Double> pr = new HashMap<>();
        pr.put("rome", 75.0);

        price.put("munich", mr);
        price.get("munich").put("paris", 100.0);
        price.put("paris", pr);

        return price;
    }

    public static double getDistance(String from, String dest) {
        return getfacts(from, dest, distance());
    }

    public static double getPrice(String from, String dest) {
        return getfacts(from, dest, price());
    }

    private static double getfacts(String from, String dest, Map<String, Map<String, Double>> facts) {
        from = from.toLowerCase();
        dest = dest.toLowerCase();

        try {
            if (facts.containsKey(from) && facts.get(from).containsKey(dest)) {
                return facts.get(from).get(dest);
            } else if (facts.containsKey(dest) && facts.get(dest).containsKey(from)) {
                return facts.get(dest).get(from);
            } else {
                throw new InvalidQueryException();
            }
        } catch (InvalidQueryException e) {
            System.out.println("Query is invalid!");
        }

        return -1.0;
    }
}
