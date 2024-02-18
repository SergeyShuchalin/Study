package area_Box;

public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5,3,2);
        System.out.println(box.get3DInfo());
        System.out.println(box.get3DAria());
        box.setHeight(10);
        box.setWidth(10);
        box.setDepth(3);
        System.out.println(box.getWidth());
        System.out.println(box.getHeight());
        System.out.println(box.getDepth());
        System.out.println(box.get3DInfo());
        System.out.println(box.get3DAria());


    }
}
