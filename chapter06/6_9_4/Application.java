public class Application {
    public static void main(String[] args) {
        Distance onekm = Distance.ofKilometer(1);
        System.out.printf(" 1 km = %d km, %d m%n", onekm.kilometer(), onekm.meter());
    }
}
