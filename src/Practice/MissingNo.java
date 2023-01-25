package Practice;

import java.util.Scanner;

public class MissingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of an Array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        for(int ar : arr) {
            System.out.print(ar + ",");
        }
        System.out.println("\n");

        int sum =0;

        for(int arry : arr){
            sum = sum + arry;
        }
        //System.out.println(sum);

        int max = arr[0];

        for (int j=0; j<n; j++) {
            if(max<arr[j]){
                max = arr[j];
            }
        }
        //System.out.println(max);

        int totalSum = max*(max+1)/2;
        //System.out.println(totalSum);

        int missingNo = totalSum-sum;

        System.out.println("The Missing Number is : " + missingNo);
    }
}
