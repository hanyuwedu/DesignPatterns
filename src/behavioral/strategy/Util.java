package behavioral.strategy;

import java.util.*;

public class Util {
    public static String toCityName(String city) {
        char[] chars = city.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }

    public static Set<String> cities() {
        Set<String> cities = new HashSet<>();
        cities.add("Paris");
        cities.add("Munich");
        cities.add("Rome");

        return cities;
    }

    public static List<List<String>> getAllRoutes(String from, String dest) {
        Stack<String> stack = new Stack<>();
        stack.push(from);
        List<List<String>> allRoutes = new ArrayList<>();

        dfs(stack, dest, allRoutes);
        return allRoutes;
    }

    private static void dfs(Stack<String> stack, String dest, List<List<String>> result) {
        if (stack.peek().toLowerCase().equals(dest.toLowerCase())) {
            result.add(new ArrayList<>(stack));
            return;
        }

        for (String city : cities()) {
            if (!stack.contains(city)) {
                stack.push(city);
                dfs(stack, dest, result);
                stack.pop();
            }
        }
    }
}
