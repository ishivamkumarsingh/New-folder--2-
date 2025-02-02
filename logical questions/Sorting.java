public class Sorting {
    public static void sortedDistances(int[] distances, String[] namesOfCities) {
        int n = distances.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (distances[j] > distances[j + 1]) {
                    int tempDistance = distances[j];
                    distances[j] = distances[j + 1];
                    distances[j + 1] = tempDistance;
                    
                    String tempCity = namesOfCities[j];
                    namesOfCities[j] = namesOfCities[j + 1];
                    namesOfCities[j + 1] = tempCity;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(namesOfCities[i] + " " + distances[i]);
        }
    }

    public static void main(String[] args) {
        String[] citiesFromZurich = {"Bern", "Lucerne", "InterLaken", "Grindelwald", 
            "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        
        Sorting bubbleSort = new Sorting();
        bubbleSort.sortedDistances(distanceFromZurich, citiesFromZurich);
    }
}