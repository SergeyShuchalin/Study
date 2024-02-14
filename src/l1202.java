public class l1202 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("p1.x: " + p1.x + ", p1.y: " + p1.y);
        System.out.println("p2.x: " + p2.x + ", p2.y: " + p2.y);
        System.out.println(Point.getCount());
    }
}

class Point {
    private static int count;
    public int x;
    public int y;

    static {
        count = 10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static void setCount(int count) {
        Point.count = count;
    }

    public static int getCount() {
        return count;
    }
}