public class Radio {
    final int UPPERLIMIT = 100;
    final int DOWNERLIMIT = 0;
    private boolean isOn;
    private int volume;

    Radio(){

    }

    public void volumeUp(){
        if(this.volume <= UPPERLIMIT) {
            this.volume = volume + 1;
        }
    }

    public void volumeDown(){
        if(this.volume >= DOWNERLIMIT) {
            this.volume = volume - 1;
        }
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

