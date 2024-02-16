package l1402.calc;

public class Test {
    public static void main(String[] args) {
        int a = 20, b = 10;

        MyCalculation calc = new MyCalculation();
        System.out.println(calc.z);
        calc.multiplication(a, b);
        System.out.println(calc.z);
        calc.addition(a, b);
        System.out.println(calc.z);
        calc.subtraction(a, b);
        System.out.println(calc.z);

    }
}
