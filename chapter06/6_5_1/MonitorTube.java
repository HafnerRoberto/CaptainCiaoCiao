public class MonitorTube {
    // only assigned once
    private final TV tv;
    // cannot be repaired
    public MonitorTube(TV tv){
        this.tv = tv;
    }
    void on(){
        System.out.println("Monitortube is on");
    }

    void off(){
        System.out.println("Monitortube is off");
    }
}
