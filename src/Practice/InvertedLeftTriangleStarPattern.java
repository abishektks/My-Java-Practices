package Practice;

import java.util.Scanner;

public class InvertedLeftTriangleStarPattern {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int l=i;l<=n;l++){
                System.out.print("* ");
            }

            System.out.println("\n");
        }



    }
}


/*                  Input = 4;


                     *  *  *  *

                        *  *  *

                           *  *

                              *




                     Input = 5;

                     *  *  *  *  *

                        *  *  *  *

                           *  *  *

                              *  *

                                 *
 */