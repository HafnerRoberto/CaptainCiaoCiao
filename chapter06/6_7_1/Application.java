public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.on();
        Radio radio1 = new Radio();
        radio1.on();
        Radio radio2 = new Radio();
        radio2.on();
        radio.setVolumeZero();
        IceMachine iceMachine = new IceMachine();
        iceMachine.on();
        TV newTV = new TV();
        newTV.on();
        Ship ship = new Ship();

        ship.addElectricDevice(radio);
        ship.addElectricDevice(radio1);
        ship.addElectricDevice(radio2);
        ship.addElectricDevice(iceMachine);
        ship.addElectricDevice(newTV);
        ship.numberOfElements();

        System.out.println(ship.numberOfRadiosSwitchedOn());

        ship.holiday();

        System.out.println(ship.numberOfRadiosSwitchedOn());

    }
}
