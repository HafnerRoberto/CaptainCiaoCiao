import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
import java.util.function.Predicate;

public class Ship {
    private ArrayList<ElectricDevice> arrayList = new ArrayList<ElectricDevice>();
    private final static ElectricDeviceWattComparator ELECTRIC_DEVICE_WATT_COMPARATOR = new ElectricDeviceWattComparator();

    public void addElectricDevice(ElectricDevice electricDevice) {
        Objects.requireNonNull(electricDevice);
        if ( electricDevice instanceof Radio && ((Radio) electricDevice).getVolume() != 0){
            System.out.println("is instance of Radio");
            //this.arrayList.add(electricDevice);
        } else {
            this.arrayList.add(electricDevice);
        }
    }

    public void load (ElectricDevice electricDevice){
        this.addElectricDevice(electricDevice);
        this.arrayList.sort(ELECTRIC_DEVICE_WATT_COMPARATOR);
    }


    public ElectricDevice findMostPowerConsumingElectronicDevice(){
        return Collections.max(this.arrayList,new ElectricDeviceWattComparator());
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

    public void holiday(){
        for(ElectricDevice device : arrayList){
            device.off();
        }
    }

private final static int MAXIMUM_POWER_CONSUMPTION = 1000;

public void removePowerConsumingElectronicDevices() {
    class IsPowerConsumingElectronicDevice implements Predicate<ElectricDevice> {
        @Override
        public boolean test(ElectricDevice electronicDevice) {
            return electronicDevice.getWatt() > MAXIMUM_POWER_CONSUMPTION;
        }
    }
    arrayList.removeIf(new IsPowerConsumingElectronicDevice());
}
}