import java.util.ArrayList;

public class metod {
    public static void main(String[] args) {
        /* sum(1, 2, 3);
        sum(1, 2, 3, 4, 5);
        sum();*/
        /*sum(10, "Welcome!",  "20");
        sum(1, "Hello World", "a", "b");*/
        /*func_num(2, 7, 0, 3, 1, 5);
        func_num(2, 7, 0, 3, 1, 5, -13, 13);
        func_num(26);
        func_num(99, 99, 100, 34, -93);
        func_num(99, 39, 99, 100, 34);*/
        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(ch(3, 6, 1, 9, 5));
    }

    public static ArrayList ch(int... args) {
        ArrayList<Integer> mas = new ArrayList<>();
        int sum = 0;
        int count = 0;
        double average;
        for (int i : args) {
            sum += i;
            count++;
        }
        average = (double) sum / count;
        System.out.println("Среднее арифметическое" + average);
        for (int i : args) {
            if (i < average) {
            mas.add(i);}
        }

        return mas;
    }


    /*public static void func_num(int... args) {
        int max = args[0];

        for (int i : args) {
            if (i % 13 == 0 && i > 0) {
                max = i;
            }

        }
        if (args[0] % 13 != 0 && max == args[0]) {
            System.out.println("Число не найдено");
        } else {
            System.out.println(max);
        }
    }*/
    /* public static void sum( int nums, String... message) {
//        System.out.println(message);
        int res = 0;
        for (int n : nums) {
            res += n;
        }
        for (String s:message){
            System.out.println(s);
        }
        System.out.println(res);
    }*/


}
