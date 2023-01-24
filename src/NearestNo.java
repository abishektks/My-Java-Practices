import java.util.Scanner;
public class NearestNo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        for(int i=num; i>=0; i--){
            if(i%10==0){
                System.out.println(i);
                break;
            }
        }




    }
}
