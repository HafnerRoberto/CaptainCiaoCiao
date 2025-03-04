public class Application {
    public static void main(String[] args) {
        Radio grandmasOldRadio = new Radio();
        System.out.println(grandmasOldRadio.isOn());
        grandmasOldRadio.on();
        System.out.println(grandmasOldRadio.isOn());
        System.out.println(grandmasOldRadio.volume);
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeDown();
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio.volume);
        System.out.println(grandmasOldRadio.toString());
        grandmasOldRadio.off();


    }
}
