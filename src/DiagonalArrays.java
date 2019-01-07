import java.util.Arrays;
public class DiagonalArrays {



    static int diagonalDifference(int[][] arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int difference = 0;

        for( int i = 0; i < arr.length; i++){
            firstDiagonalSum += arr[i][i];
        }

        int b = arr.length -1;
        for( int a = 0; a < arr.length; a++){ // [0,2] [1,1], [2,0]
                secondDiagonalSum += arr[a][b];
                b--;
        }

        difference = java.lang.Math.abs(firstDiagonalSum - secondDiagonalSum);

        return difference;

    }

    public static void main(String[] args){

        int[][] twoDArray = new int[3][3];

        twoDArray[0][0] = 11;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 4;
        twoDArray[1][0] = 4;
        twoDArray[1][1] = 5;
        twoDArray[1][2] = 6;
        twoDArray[2][0] = 10;
        twoDArray[2][1] = 8;
        twoDArray[2][2] = -12;

        System.out.println(Arrays.deepToString(twoDArray));

        System.out.println(diagonalDifference(twoDArray));


    }
}
