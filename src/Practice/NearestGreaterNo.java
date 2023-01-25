package Practice;

import java.util.Scanner;
public class NearestGreaterNo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        while(true){
            if(num%10==0){
                System.out.println(num);
                break;
            }
            num++;
        }





    }
}
