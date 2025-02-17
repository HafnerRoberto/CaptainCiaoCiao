public class Wind {

    final static int MAXWINDSPEED = 200;
    final static int EINDDIRECTION = 200;

    final static int LENGTH = 3;


    public static int initializeValue(int max) {
        return (int) (Math.random() * max);
    }

    public static void main(String[] args) {
        int[] windSpeed = new int[LENGTH];
        int[] windDirection = new int[LENGTH];
        for (int i = 0; i < windSpeed.length; i++) {
            windSpeed[i] = initializeValue(MAXWINDSPEED);
            windDirection[i] = initializeValue(EINDDIRECTION);
        }

        for (int i = 0; i < windSpeed.length; i++) {
            System.out.printf(" Speed %d Direction %d", windSpeed[i], windDirection[i]);
            if(i < windSpeed.length - 1){
                System.out.print(", ");
            }
        }

    }
}