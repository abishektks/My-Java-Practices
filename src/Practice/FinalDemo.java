package Practice;

public class FinalDemo {
    public static void main(String[] args) {

        final int a;

        a=10;

        System.out.println(a);

        Box1 abox = new Box1(5);
        System.out.println(abox.count);
    }
}

class Box1 {
    final int count;

    Box1(int c){
        count = c;
    }

}