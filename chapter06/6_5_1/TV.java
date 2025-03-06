public class TV {
    private MonitorTube monitorTube = new MonitorTube(this);
    private boolean isOn;
    public TV(){

    }
    void on(){
        System.out.println("TV is on");
        isOn = true;
        monitorTube.on();
    }

    void off(){
        System.out.println("TV is off");
        isOn = false;
        monitorTube.off();
    }
}
