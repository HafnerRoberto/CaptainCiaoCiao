import java.sql.PseudoColumnUsage;

public class SalesIncrease {
    final static int NUMBERSOFDAY = 31;

    static int count5PercentJunps(int [] dailyGains) {
        if (dailyGains == null) throw new NullPointerException("input");
        int numberJumps = 0;
        for (int i = 0; i < dailyGains.length -1; i++){
            int firstNumber = dailyGains[i];
            int secondNumber = dailyGains[i + 1];
            int subtract = secondNumber - firstNumber;

            double percent = (100/(double)firstNumber) * (double) subtract;

            if (percent >= 5){
                numberJumps++;
            }
        }
        return numberJumps;
    }


    public static void main(String[] args) {
        int[] dailyGains = {1000, 2000, 500, 9000, 9010};
        int numberJumps = count5PercentJunps(dailyGains);
        System.out.print(numberJumps);

    }
}