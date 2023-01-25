package Practice;

import java.util.Scanner;

public class SumofAllNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("Enter a Number : ");
            int num = scanner.nextInt();

            if (num>=0) {
                sum = sum + num;
            } else {
                break;
            }

        }
        System.out.println(sum);
    }
}
