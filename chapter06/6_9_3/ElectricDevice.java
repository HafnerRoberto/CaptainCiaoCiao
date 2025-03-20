import java.util.Objects;

public class ElectricDevice {
    private boolean isOn;
    private int watt;
    public ElectricDevice(){
    }
    public void on(){
        this.isOn = true;
        System.out.println("on");
    }

    public void off(){
        this.isOn = false;
        System.out.println("off");
    }

    public boolean isOn(){
        return this.isOn;
    }

    public static int numberOfElectronicDevicesOn(ElectricDevice ... devices){
        int numberDevicesOn = 0;
        for (ElectricDevice device : devices){
            if (device.isOn()){
                numberDevicesOn++;
            }
        }
        return numberDevicesOn;
    }


    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    @Override
    public String toString(){
        return "ElectricDevice[watt=" + watt + "]";
    }
}
