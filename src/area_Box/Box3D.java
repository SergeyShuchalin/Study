package area_Box;

public class Box3D extends Box {
    private double depth;

    public Box3D(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if (depth > 0)
            this.depth = depth;
    }
    public String get3DInfo(){
        return "Объект Box3D (ширина = "+ getWidth() + ", высота = "+ getHeight()+", глубина = " +depth + ")";
    }
    public double get3DAria(){
        double area2D = getArea();
        System.out.print("Объем: ");
        return area2D * this.depth;
    }
}
