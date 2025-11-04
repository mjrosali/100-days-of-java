import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cities {
    public static void main(String[] args) {
        Set<String> cities = new TreeSet<>();

        String[] cityArr = {
                "Manila",
                "Tokyo",
                "Cebu",
                "Tokyo",
                "Osaka",
                "Manila",
                "Kyoto"
        };

        for (String city : cityArr) {
            cities.add(city);
        }

        // List<String> sortedCities = new ArrayList<>(cities);
        // Collections.sort(sortedCities);

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
