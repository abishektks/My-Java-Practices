import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        /// 1D Array ///
        int[] marks = new int[5];

        marks[0] = 87;
        marks[1] = 90;
        marks[2] = 100;
        marks[3] = 100;
        marks[4] = 100;

        marks[1] = 95;

        System.out.println(Arrays.toString(marks));

        // Another Method for 1D Array

        int[] mark = {87,95,100,100,100};

        mark[1]=98;
        //mark[7]=92; // You can Assign more value than initializer.

        System.out.println(Arrays.toString(mark));

        ///2D Array ///

        int[][] marks2 = new int[5][5];

        marks2[0][0]=95;
        marks2[0][1]=98;
        marks2[0][2]=100;
        marks2[0][3]=100;
        marks2[0][4]=100;

        marks2[1][0]=90;
        marks2[1][1]=95;
        marks2[1][2]=98;
        marks2[1][3]=97;
        marks2[1][4]=99;

        marks2[2][0]=87;
        marks2[2][1]=91;
        marks2[2][2]=93;
        marks2[2][3]=95;
        marks2[2][4]=100;

        marks2[3][0]=95;
        marks2[3][1]=98;
        marks2[3][2]=100;
        marks2[3][3]=100;
        marks2[3][4]=100;

        marks2[4][0]=95;
        marks2[4][1]=98;
        marks2[4][2]=100;
        marks2[4][3]=100;
        marks2[4][4]=100;

        System.out.println(Arrays.deepToString(marks2));

        //2D Array Another//

        int[][] mark2 = {{92,53,24,242,12},{12,341,341,241,12}};

        System.out.println(Arrays.deepToString(mark2));

        /// Multi D Array ///

        int[][][] marks3 = new int[2][4][5];

        // 1st Table
        marks3[0][0][0] = 95;
        marks3[0][0][1] = 98;
        marks3[0][0][2] = 100;
        marks3[0][0][3] = 100;
        marks3[0][0][4] = 100;

        marks3[0][1][0] = 95;
        marks3[0][1][1] = 95;
        marks3[0][1][2] = 95;
        marks3[0][1][3] = 95;
        marks3[0][1][4] = 95;

        marks3[0][2][0] = 95;
        marks3[0][2][1] = 95;
        marks3[0][2][2] = 95;
        marks3[0][2][3] = 95;
        marks3[0][2][4] = 95;

        marks3[0][3][0] = 95;
        marks3[0][3][1] = 95;
        marks3[0][3][2] = 95;
        marks3[0][3][3] = 95;
        marks3[0][3][4] = 95;

        // 2nd Table
        marks3[1][0][0] = 95;
        marks3[1][0][1] = 95;
        marks3[1][0][2] = 95;
        marks3[1][0][3] = 95;
        marks3[1][0][4] = 95;

        marks3[1][1][0] = 95;
        marks3[1][1][1] = 95;
        marks3[1][1][2] = 95;
        marks3[1][1][3] = 95;
        marks3[1][1][4] = 95;

        marks3[1][2][0] = 95;
        marks3[1][2][1] = 95;
        marks3[1][2][2] = 95;
        marks3[1][2][3] = 95;
        marks3[1][2][4] = 95;

        marks3[1][3][0] = 95;
        marks3[1][3][1] = 95;
        marks3[1][3][2] = 95;
        marks3[1][3][3] = 95;
        marks3[1][3][4] = 95;


        System.out.println(Arrays.deepToString(marks3));

        ///
    }
}
