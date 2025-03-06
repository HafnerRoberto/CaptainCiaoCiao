public class TV {
    private MonitorTube monitorTube = new MonitorTube();

    public TV(){

    }
    void on(){
        System.out.println("TV is on");
        monitorTube.on();
    }

    void off(){
        System.out.println("TV is off");
        monitorTube.off();
    }
}
