package Practice;

import java.util.Scanner;

public class NearestNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        for(int i=num, j=num; i<=0 | j>=0; i++,j--){
            if(i%10==0){
                System.out.println(i);
                break;
            } else if (j%10==0) {
                System.out.println(j);
                break;
            }

        }
    }
}
