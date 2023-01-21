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

        // Another Method for 1D Array

        int[] mark = {87,95,100,100,100};

        mark[1]=98;
        //mark[7]=92; // You can Assign more value than initilaizer.

        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(mark));


    }
}
