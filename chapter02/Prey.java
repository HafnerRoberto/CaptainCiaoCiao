public class Prey {

    public static void main (String [] args){

        System.out.print("Numbers of bottles in total: ");
        int numberPrey = new java.util.Scanner(System.in).nextInt();

        int partCaptain = numberPrey / 2;
        System.out.printf("\nBottles for the Captain: %d", partCaptain);
        int bottlesCrew = 0;

        if (numberPrey % 2 != 0 ) {
            bottlesCrew = partCaptain + 1;
        } else {
            bottlesCrew = partCaptain;
        }
        System.out.printf("\nBottles for Crew members: %d", bottlesCrew);

        System.out.print("\nEnter number of crew members: ");
        int numberCrew = new java.util.Scanner(System.in).nextInt();

        int odd = bottlesCrew % numberCrew;
        boolean fairShare = true;
        if (odd != 0){

        }

    }

}
