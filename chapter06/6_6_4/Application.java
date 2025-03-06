public class Application {
    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.on();
        Radio radio1 = new Radio();
        radio1.on();
        Radio radio2 = new Radio();
        radio2.on();

        IceMachine iceMachine = new IceMachine();
        iceMachine.on();

        int switchedOn = ElectricDevice.numberOfElectronicDevicesOn(radio, radio1,iceMachine);
        System.out.println(switchedOn);

        iceMachine.off();

        switchedOn = ElectricDevice.numberOfElectronicDevicesOn(radio, radio1,iceMachine);
        System.out.println(switchedOn);

    }
}

