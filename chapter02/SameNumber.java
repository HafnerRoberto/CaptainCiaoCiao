import java.util.Scanner;

public class SameNumber {



    public static void main(String [] args){
        System.out.print("Please insert the first number:");
        int firstNumber = new Scanner(System.in).nextInt() % 100;
        System.out.println(firstNumber);
        System.out.print("Please insert the second number:");
        int secondNumber = new Scanner(System.in).nextInt() % 100;

        int digitOneFirst = firstNumber / 10;
        int digitOneSecond = firstNumber % 10;
        int digitTwoFirst = secondNumber / 10;
        int digitTwoSecond = secondNumber % 10;

        if (digitOneFirst == digitTwoFirst ||
                digitOneFirst == digitTwoSecond ||
                digitOneSecond == digitTwoSecond ||
                digitOneSecond == digitTwoFirst ){
            System.out.print("True");
        } else {
            System.out.print("False");
        }

    }


}
