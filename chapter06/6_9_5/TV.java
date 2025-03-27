public class TV extends ElectricDevice{
    private MonitorTube monitorTube = new MonitorTube(this);

    public TV(){

    }
    public void on(){
        super.on();
        System.out.println("TV is on");
        monitorTube.on();
    }

    public void off(){
        super.off();
        System.out.println("TV is off");
        monitorTube.off();
    }
}
