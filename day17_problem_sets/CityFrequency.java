import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CityFrequency {
    public static void main(String[] args) {
        String[] cityArr = { "Manila", "Tokyo", "Cebu", "Tokyo", "Osaka", "Manila", "Kyoto" };
        Map<String, Integer> cities = new TreeMap<>();

        for (String c : cityArr) {
            cities.put(c, cities.getOrDefault(c, 0) + 1);
        }

        Set<String> multiInputCities = new TreeSet<>();
        System.out.println("City Frequency Count:");
        for (String city : cities.keySet()) {
            System.out.printf("%s: %d%n", city, cities.get(city));

            if (cities.get(city) > 1)
                multiInputCities.add(city);

        }

        System.out.println("--------------------");
        System.out.println("Total unique cities: " + cities.size());
        System.out.println("Cities entered more than once:" + multiInputCities);
    }
}
