import java.util.ArrayList;

public class Matrix {

    /*(2 pont) Készítsen egy Matrix osztályt. Az osztályban írja meg a sumOfEvenNumbers és a rowsWithZero metódusokat.
     Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a mátrixban található páros számok összegét,
     utóbbi azon sorok indexeit, amelyek tartalmaznak 0 értéket!
     */

    public static int sumOfEvenNumbers(int[][] matrix){
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                if(matrix[i][j] % 2 == 0){
                    sum += matrix[i][j];
                }

            }
        }

        return sum;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                if(matrix[i][j] == 0 && result.contains(i) == false) result.add(i);

            }
        }

        return result;
    }

}
