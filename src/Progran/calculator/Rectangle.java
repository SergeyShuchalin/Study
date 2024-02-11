package Progran.calculator;

public class Rectangle {
    public static void main(String[] args) {
//        Calculation rect1 = new Calculation(0, 0, "","");
        Calculation rect1 = new Calculation();
        rect1.setLength(3);
        rect1.setWidth(9);
        System.out.println("Длина прямоугольника: " + rect1.getLength() + rect1.text1);
        System.out.println("Ширина прямоугольника: " + rect1.getWidth() + rect1.text2);
        System.out.println("Площадь прямоугольника: " + rect1.getArea());
        System.out.println("Периметр прямоугольника: " + rect1.getPerimeter());
        System.out.printf("Гипотенуза прямоугольника: %.2f%n", rect1.getHypotenuse());
        rect1.getDraw();
    }
}
