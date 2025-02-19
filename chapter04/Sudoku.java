import java.util.List;

public class Sudoku {
    static boolean [] missingNumber (int [][] array){
        if(array == null || array.length == 0) throw new NullPointerException("Array corrupt");

        boolean [] exist = new boolean[3*3];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int number = array[i][j];
                if (number >= 1 && number <= 9){
                    exist[number -1] = true;
                }
            }
        }
        return exist;
    }

    public static void main(String[] args) {
        int [][] array = {{1,2,3}, {4,5,6}, {7,8,9}};//true
        int [][] array1 = {{1,2,3}, {4,5,6}, {7,9,9}};//
        int [][] array2 = {{1,2,3},{7,8,9}}; //non valid sudoku
        int [][] array3 = {{}, {4,5,6}, {7,8,9}};
        int [][] array4 = null;

        boolean [] number = missingNumber(array2);
        for (int j = 0;j < number.length;j++ ){
            if (number[j] == false){
              System.out.printf("Missing number %d", j + 1);
            }
        }
    }
}
