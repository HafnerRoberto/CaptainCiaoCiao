import java.util.Comparator;

public class Application {
    public static void main(String[] args) {

    Radio grannyRadio = new Radio();
    grannyRadio.setWatt(12000);

    TV grandPasTV= new TV();
    grandPasTV.setWatt(20);

    TV granny = new TV();
    granny.setWatt(50);

    TV mommy = new TV();
    mommy.setWatt(60);
    Ship ship = new Ship();
    ship.load(grandPasTV);
    ship.load(grannyRadio);
    ship.load(granny);
    ship.load(mommy);
    System.out.println(ship.findMostPowerConsumingElectronicDevice().getWatt());
    }
}
