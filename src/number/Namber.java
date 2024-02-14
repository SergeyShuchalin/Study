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
}
