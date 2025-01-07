import java.util.*;

    class Country {
        String name;
        int pincode;
        int population;

        public Country(String name, int pincode, int population) {
            this.name = name;
            this.pincode = pincode;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public int getPincode() {
            return pincode;
        }

        public int getPopulation() {
            return population;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", pincode=" + pincode +
                    ", population=" + population +
                    '}';
        }
    }

    public class MapTest {
        public static void main(String[] args) {
            Map<String, Country> countryMap = new HashMap<>();
            countryMap.put("India", new Country("India", 110001, 1393409038));
            countryMap.put("USA", new Country("USA", 10001, 331002651));
            countryMap.put("China", new Country("China", 100000, 1444216107));

            // Sorting using keySet
            List<String> keyList = new ArrayList<>(countryMap.keySet());
            keyList.sort(Collections.reverseOrder());
            System.out.println("Sorted by keySet:");
            for (String key : keyList) {
                System.out.println(countryMap.get(key));
            }

            // Sorting using entrySet
            List<Map.Entry<String, Country>> entryList = new ArrayList<>(countryMap.entrySet());
            entryList.sort((e1, e2) -> e2.getKey().compareTo(e1.getKey()));
            System.out.println("Sorted by entrySet:");
            for (Map.Entry<String, Country> entry : entryList) {
                System.out.println(entry.getValue());
            }
        }
    }
    
// Output:
