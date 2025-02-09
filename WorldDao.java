import java.util.*;
import java.util.stream.*;

public class World implements WorldDao {
    private List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public Map<String, City> HighestCountry() {
        Map<String, City> highestPopulatedCities = new HashMap<>();

        for (Country country : countries) {
            City highestPopulatedCity = null;
            for (City city : country.getCities()) {
                if (highestPopulatedCity == null || city.getPopulation() > highestPopulatedCity.getPopulation()) {
                    highestPopulatedCity = city;
                }
            }
            highestPopulatedCities.put(country.getCode(), highestPopulatedCity);
        }
        return highestPopulatedCities;
    }


    @Override
    public Map<String, City> findMostPopulatedCityPerContinent() {
        Map<String, City> mostPopulatedCitiesByContinent = new HashMap<>();

        for (Country country : countries) {
            for (City city : country.getCities()) {
                String continent = country.getContinent();
                if (!mostPopulatedCitiesByContinent.containsKey(continent) || 
                    city.getPopulation() > mostPopulatedCitiesByContinent.get(continent).getPopulation()) {
                    mostPopulatedCitiesByContinent.put(continent, city);
                }
            }
        }
        return mostPopulatedCitiesByContinent;
    }


    @Override
    public City HighestCity() {
        return countries.stream()
            .flatMap(country -> country.getCities().stream())
            .filter(city -> city.getCapital() == 1) 
            .max(Comparator.comparingInt(City::getPopulation)) //max stream 
            .orElse(null);
    }
}


import java.util.*;

 class Main {
    public static void main(String[] args) {
        City city1 = new City(1, "Assiut", 5000000, "EG", 25000, 0); // 0 or 1 for if it the capital or not ****
        City city2 = new City(2, "Cairo", 10000000, "EG", 50000, 1); 
        City city3 = new City(3, "Sohag", 3000000, "EG", 15000, 0);
        City city4 = new City(4, "Delhi", 18000000, "IN", 50000, 1);
        City city5 = new City(5, "Mumbai", 12000000, "IN", 40000, 0);

        Country country1 = new Country("EG", "Egypt", "africa", 9833517, new ArrayList<>(Arrays.asList(city1, city2, city3)));
        Country country2 = new Country("IN", "India", "asia", 3287263, new ArrayList<>(Arrays.asList(city4, city5)));

        World world = new World(new ArrayList<>(Arrays.asList(country1, country2)));

        Map<String, City> highestPopulatedCities = world.HighestCountry();
        highestPopulatedCities.forEach((code, city) -> System.out.println("highest populated city " + code + city.getName()));

        Map<String, City> mostPopulatedCities = world.findMostPopulatedCityPerContinent();
        mostPopulatedCities.forEach((continent, city) -> System.out.println(" most populated city " + continent + city.getName()));

        City highestPopulatedCapital = world.HighestCity();
        System.out.println(" highest populated capital city is " + (highestPopulatedCapital != null ? highestPopulatedCapital.getName() : "NO"));
    }
}


