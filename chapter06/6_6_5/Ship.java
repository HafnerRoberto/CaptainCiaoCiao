import java.util.ArrayList;
import java.util.Objects;

public class Ship {
    private ArrayList<ElectricDevice> arrayList = new ArrayList<ElectricDevice>();

    public void addElectricDevice(ElectricDevice electricDevice) {
        Objects.requireNonNull(electricDevice);
        this.arrayList.add(electricDevice);
    }

    public int numberOfRadiosSwitchedOn() {
        int numberOfRadiosSwitchedOn = 0;
        for (ElectricDevice radio : arrayList) {
            if (radio.isOn()) {
                numberOfRadiosSwitchedOn++;
            }
        }
        return numberOfRadiosSwitchedOn;
    }
}