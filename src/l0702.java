import java.util.Random;

public class l0702 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 5;
        int max = 10;
        int cnt = 30;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextDouble());
//            System.out.println(rand.nextInt(max)); // от 0 до max(не включительно)
            System.out.println(rand.nextInt(max - min + 1)+5); // от 5 до max(включительно)
        }
    }
}
