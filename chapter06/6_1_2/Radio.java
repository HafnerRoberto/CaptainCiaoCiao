public class Radio {
    final int UPPERLIMIT = 100;
    final int DOWNERLIMIT = 0;
    boolean isOn;
    int volume;

    Radio(){

    }

    void volumeUp(){
        if(this.volume <= UPPERLIMIT) {
            this.volume = volume + 1;
        }
    }

    void volumeDown(){
        if(this.volume >= DOWNERLIMIT) {
            this.volume = volume - 1;
        }
    }

    void on(){
        this.isOn = true;
        System.out.println("on");
    }

    void off(){
        this.isOn = false;
        System.out.println("off");
    }

    boolean isOn(){
        return this.isOn;
    }

    public String toanString(){
        return "Radio[volume="+this.volume + " is " + (isOn ? "on":"off") + "]";
    }

}
