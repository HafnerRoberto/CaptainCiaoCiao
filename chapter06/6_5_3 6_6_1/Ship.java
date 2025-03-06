import java.util.ArrayList;

public class Ship {
    private ArrayList<ElectricDevice> arrayList = new ArrayList<ElectricDevice>();

    public void addRadio(ElectricDevice electricDevice) {
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