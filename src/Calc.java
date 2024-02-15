// перегрузка методов
public class Calc {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        // 1. По количеству методов
        obj.calculate(1, 2);
        obj.calculate(1, 2,3);
        // 2. По типам параметров
        obj.calculate(2.5, 3.4);
        // 3. По порядку параметров
        obj.calculate(2.5, 4);
        obj.calculate(4, 3.5);

    }
}

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Сумма двух чисел: " + (a + b));
    }
    public void calculate(int a, int b, int c) {
        System.out.println("Сумма трех чисел: " + (a + b + c));
    }
    public void calculate(double a, double b) {
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }
    public void calculate(double a, int b) {
        System.out.println("Сумма вещественных и целых чисел: " + (a + b));
    }
    public void calculate(int a, double b) {
        System.out.println("Сумма целых и вещественных чисел: " + (a + b));
    }
}