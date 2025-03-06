import java.util.ArrayList;

public class Ship {
    private ArrayList<Radio> arrayList = new ArrayList<Radio>();

    public void addRadio(Radio radio) {
        this.arrayList.add(radio);
    }

    public int numberOfRadiosSwitchedOn() {
        int numberOfRadiosSwitchedOn = 0;
        for (Radio radio : arrayList) {
            if (radio.isOn()) {
                numberOfRadiosSwitchedOn++;
            }
        }
        return numberOfRadiosSwitchedOn;
    }
}