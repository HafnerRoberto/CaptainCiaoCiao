import java.util.ArrayList;
import java.util.Objects;

public class Ship {
    private ArrayList<ElectricDevice> arrayList = new ArrayList<ElectricDevice>();

    public void addElectricDevice(ElectricDevice electricDevice) {
        Objects.requireNonNull(electricDevice);
        if ( electricDevice instanceof Radio && ((Radio) electricDevice).getVolume() != 0){
            System.out.println("is instance of Radio");
            //this.arrayList.add(electricDevice);
        } else {
            this.arrayList.add(electricDevice);
        }
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

    public void numberOfElements(){
        System.out.println(this.arrayList.size());
    }
}