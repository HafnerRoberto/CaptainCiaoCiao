import java.util.Scanner;

public class BuildDiamond {
    static void printIndent (int indent){
        for(int i = 0; i < indent;i++){
            System.out.print("-");
        }
    }

    static void printSign (char character, char stopcharacter){
        //first an last line an element in the middle
        if(character == stopcharacter){
            System.out.print(character);
            return;
        }
        System.out.print(character);//first element
        printSign((char) (character +1), stopcharacter);
        System.out.print(character);//last element
    }

    static void printDiamond(int diameter){
        if (diameter < 1){
            return;
        }
        // check input is not longer that 52 see assignment
        diameter = Math.min(diameter, (2 * 26) - 1);
        int radius = diameter / 2;
        for (int identis = radius; identis >= -radius; identis--){
            //
            int absiden = Math.abs(identis);
            printIndent(absiden);
            printSign('A', (char) ('A' + radius - absiden));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        printDiamond(number);
    }
}
