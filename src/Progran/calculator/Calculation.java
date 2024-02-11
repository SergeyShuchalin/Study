package Progran.calculator;

public class Calculation {
    private int length;
    private int width;
    public String text1;
    public String text2;

    //    public Calculation(int length, int width, String text1, String text2) {
//        this.length = length;
//        this.width = width;
//        setWidth(width);
//        setLength(length);
//        this.text1 = text1;
//        this.text2 = text2;
//    }
    public Calculation() {
        {
            text1 = "";
            text2 = "";
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            text1 = " (" + length + " введи положительное число)";
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            text2 = " (" + width + " введи положительное число)";
        }
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

    public void getDraw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
