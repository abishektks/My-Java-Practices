package Practice;

public class StaticDemo {
    public static void main(String[] args) {

        final int a;

        a=10;

        System.out.println(a);

        Box abox = new Box(5);
        System.out.println(Box.count);
        // System.out.println(abox.count); // Its not Working
    }
}

class Box {
    static int count;

    static {
        count=0;
    }
    Box(int c){
        count = c;
    }

}