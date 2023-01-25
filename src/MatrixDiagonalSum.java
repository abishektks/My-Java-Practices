import java.util.Arrays;
import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of a Matrix : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];

        System.out.println("Start to Enter the Matrix");
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                matrix[i][j] = scanner.nextInt();
            }
            System.out.print("\n");
        }

        //Printing the Matrix
        for (int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }

        int psum =0;

        for(int i=0,j=0;i<x | j<y ;i++,j++){
            psum = psum + matrix[i][j];
        }

        int ssum =0;
        for (int i=0,j=x-1;i<x|j>=0;i++,j--){
            if(i==j){
                continue;
            }
            ssum = ssum + matrix[i][j];
        }

        System.out.println(psum+ssum);

    }
}
