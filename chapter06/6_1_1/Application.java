public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio(true, 6);
        System.out.println(radio.isOn);
        System.out.println(radio.volume);

        radio.isOn = false;
        radio.volume = 78888;

        System.out.println(radio.isOn);
        System.out.println(radio.volume);

    }
}
