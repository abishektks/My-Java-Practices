package Practice;

public class ContinueDemo {
    public static void main(String[] args){

        for(int i=1; i<=100;i++){

            if(i%10==0){
                continue;
            }
            System.out.print(i+", ");

        }

    }
}
