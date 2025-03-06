import java.util.Objects;


public class Radio extends ElectricDevice{

    public enum Modulation{
        AM,FM
    }
    private static final int UPPERLIMIT = 100;
    private static final int DOWNERLIMIT = 0;

    private int volume = 1;
    private double frequency;
    private Modulation modulation = Modulation.AM;


    public Radio(){
    }
    // init with double
    public Radio(double frequency){
        setFrequency(frequency);
    }

    public Radio(String station){
        this (stationNameToFrequency(station));
    }

    public Radio(Radio radio){
        //memento if function us functions why? only a single point to edit -> be smart
        setFrequency(radio.frequency);
        setModulation(radio.modulation);
        if (radio.isOn()) on(); else off();
        this.volume = radio.volume;
    }
    void setModulation(Modulation modulation){
        this.modulation = Objects.requireNonNull(modulation);
    }

    Modulation getModulation(){
        return modulation;
    }

    public double getFrequency() {
        return frequency;
    }

    public static double stationNameToFrequency (String string){
        switch (string){
            case "Walking the plank":
                return 98.3;
            case null:
                return 0.0;
            default:
                return 0.0;
        }
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public int getVolume() {
        return volume;
    }


    @Override
    public String toString(){
        return "Radio[volume="+this.volume + " is " + (this.isOn() ? "on":"off") + this.modulation.toString() +"]";
    }

}


