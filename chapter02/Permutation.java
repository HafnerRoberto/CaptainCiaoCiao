import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        char[] array = {'L','O','T','X'};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i != j){
                    System.out.printf("%s + %s = \n",array[i],array[j] );
                }
            }
        }
    }
}
