public class Radio {
    private static final int UPPERLIMIT = 100;
    private static final int DOWNERLIMIT = 0;
    private boolean isOn;
    private final int volume = 1;
    private double frequency;

    Radio(){

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

    @Override
    public String toString(){
        return "Radio[volume="+this.volume + " is " + (isOn ? "on":"off") + "]";
    }

}


