import java.util.Comparator;

public class ElectricDeviceWattComparator implements Comparator <ElectricDevice> {

    @Override
    public int compare(ElectricDevice ed1, ElectricDevice ed2) {
        System.out.println( ed1 + "is compared with "+ ed2 );
        return Double.compare(ed1.getWatt(), ed2.getWatt());
    }
}
