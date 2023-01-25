package OOPs;

public class BoxMain {

    public static void main(String[] args) {
        Box blackBox = new Box(13, 23, 34);

        blackBox.setBreadth(5);

        blackBox.setHeight(6);

        blackBox.setLength(53);

        System.out.println(blackBox.getBreadth());
        System.out.println(blackBox.getHeight());
        System.out.println(blackBox.getLength());

    }
}
