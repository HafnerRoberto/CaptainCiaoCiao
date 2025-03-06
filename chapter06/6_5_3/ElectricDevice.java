public class ElectricDevice {
    private boolean isOn;
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



    class Television extends ElectricDevice{
        public Television(){

        }
    }

}
