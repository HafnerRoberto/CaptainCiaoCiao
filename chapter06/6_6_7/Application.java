public class Application {
    public static void main(String[] args) {
        Firebox firebox = new Firebox();
        System.out.println(firebox.isOn());
        firebox.off();
        System.out.println(firebox.isOn());

    }
}

