import java.util.Comparator;

public class Application {
    public static void main(String[] args) {

        ElectricDevice ed1 = new Radio();
        ed1.setWatt(200);
        ElectricDevice ed2 = new Radio();
        ed2.setWatt(20);

        Comparator <ElectricDevice> c = new ElectricDeviceWattComparator();
        System.out.println(c.compare(ed2, ed1));
        System.out.println(c.compare(ed1, ed2));

    }
}
