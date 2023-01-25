import java.util.Scanner;
public class PrintAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of an Array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        for(int ar : arr) {
            System.out.print(ar);
        }

    }
}
