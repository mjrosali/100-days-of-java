import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareCities {
    public static void main(String[] args) {
        Set<String> jennyCities = Set.of("Tokyo", "Kyoto", "Manila", "Osaka");
        Set<String> mikeCities = Set.of("Osaka", "Cebu", "Tokyo", "Nagoya");
        Set<String> jennyCitiesH = new TreeSet<>(jennyCities);
        Set<String> mikeCitiesH = new TreeSet<>(mikeCities);
        Set<String> commonCities = new TreeSet<>();

        for (String mcity : mikeCities) {
            for (String jcity : jennyCities) {
                if (jcity.equals(mcity)) {
                    commonCities.add(jcity);
                    mikeCitiesH.remove(jcity);
                    jennyCitiesH.remove(jcity);

                }
            }
        }

        int numOfUniqueCities = commonCities.size() + jennyCitiesH.size() + mikeCitiesH.size();

        System.out.println("-- Cities Visited --");
        System.out.println("Common: " + commonCities);
        System.out.println("Jenny only: " + jennyCitiesH);
        System.out.println("Mike only: " + mikeCitiesH);
        System.out.println("--------------------");
        System.out.printf("Jenny visited %d unique cities%n", jennyCities.size());
        System.out.printf("Mike visited %d unique cities%n", mikeCities.size());
        System.out.println("Number of unique cities both visited: " + numOfUniqueCities);
    }
}
