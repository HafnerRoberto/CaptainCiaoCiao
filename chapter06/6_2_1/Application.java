public class Application {
    public static void main(String[] args) {
        System.out.println(Radio.stationNameToFrequency("Walking the plank"));
        System.out.println(Radio.stationNameToFrequency(null));
        System.out.println(Radio.stationNameToFrequency("Walking the"));
    }
}
