import java.util.Arrays;

public class Tetraphobie {

    static boolean containsfour(int check){
        return String.valueOf(check).contains("4");
    }

    static int [] fourLast(int... array){
        int firstfour = 0;
        for(int i = 0; i < array.length - 1 ; i++){
            if (containsfour(array[i]) && !containsfour(array[i + 1])) {
                int switchNumber = array[i + 1];
                array[i+1] = array[i];
                array[i] = switchNumber;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int  [] numbers = {1,4,2,3,44,33};
        int  [] numbers1 = {1,4,2,3,44,33};
        int  [] numbers2 = {1,4,2,3,44,1234};
        int  [] numbers3 = {1,4,2,3,44,33};

        int [] result = fourLast(numbers);
        System.out.print( Arrays.equals(numbers2, numbers) );
        System.out.println(Arrays.toString(result));
    }

}
