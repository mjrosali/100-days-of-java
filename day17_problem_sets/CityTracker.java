import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CityTracker {
    public static void main(String[] args) {
        Map<String, Set<String>> userCityMap = new TreeMap<>();
        userCityMap.put("Jenny", Set.of("Tokyo", "Kyoto", "Manila", "Osaka"));
        userCityMap.put("Mike", Set.of("Osaka", "Cebu", "Tokyo", "Nagoya"));
        userCityMap.put("Anna", Set.of("Kyoto", "Cebu", "Manila"));

        for (String user : userCityMap.keySet()) {
            System.out.println(user + " → " + userCityMap.get(user));
        }
        System.out.println("");

        int nMostCities = 0;
        String uMostCities = "";
        for (String user : userCityMap.keySet()) {
            if (nMostCities < userCityMap.get(user).size()) {
                nMostCities = userCityMap.get(user).size();
                uMostCities = user;
            }
        }
        System.out.printf("Traveler with most cities visited: %s (%d)%n", uMostCities, nMostCities);

        // common cities
        Set<String> commonCities = new TreeSet<>();
        boolean flagFirst = true;
        for (String user : userCityMap.keySet()) {
            if (flagFirst) {
                flagFirst = false;
                commonCities.addAll(userCityMap.get(user));
            } else {
                commonCities.retainAll(userCityMap.get(user));
            }
        }
        System.out.println("Common to all: " + commonCities);

        // unique city
        Map<String, Integer> cityFrequency = new HashMap<>();
        Set<String> uniqueCities = new TreeSet<>();
        List<String> cityArr = new ArrayList<>();
        for (String user : userCityMap.keySet()) {
            cityArr.addAll(userCityMap.get(user));
        }
        for (String city : cityArr) {
            cityFrequency.put(city, cityFrequency.getOrDefault(city, 0) + 1);
        }
        for (String city : cityFrequency.keySet()) {
            if (cityFrequency.get(city) == 1) {
                uniqueCities.add(city);
            }
        }
        System.out.println("Unique cities overall: " + uniqueCities);
    }
}
