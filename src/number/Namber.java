package number;

public class Namber {
    public static int max(int a, int b, int c, int d){
//        return Math.max(a, Math.max(b, Math.max(c,d)));
//        int mx = a;
//        if (b > mx) mx = b;
//        if (c > mx) mx = c;
//        if (d > mx) mx = d;
//        return mx;
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int min(int... num){
        int nm = num[0];
        for (int j : num) {
            if (j < nm) {
                nm = j;
            }

        }
        return nm;
    }
    public static double average  (int... num){
        int n = 0;
        double sr;
        for (int j : num) {
            n += j;

        }
      return  sr = n / (double)num.length;

    }
    public static int factorial (int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
