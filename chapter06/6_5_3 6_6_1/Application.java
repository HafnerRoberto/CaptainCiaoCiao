public class Application {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Radio radio = new Radio();
        radio.on();
        Radio radio1 = new Radio();
        radio1.on();
        Radio radio2 = new Radio();
        radio2.on();

        IceMachine iceMachine = new IceMachine();
        iceMachine.on();

        ship.addRadio(radio);
        ship.addRadio(radio1);
        ship.addRadio(radio2);
        ship.addRadio(iceMachine);
        System.out.println(ship.numberOfRadiosSwitchedOn());

        radio.off();

        System.out.println(ship.numberOfRadiosSwitchedOn());

    }
}
