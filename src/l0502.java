public class l0502 {
    public static void main(String[] args) {
        System.out.println(0b101 >> 1);
        System.out.println(Integer.toBinaryString(5 >> 1));
        System.out.println(Integer.toBinaryString(0b101 >> 1));
//        printBinaryString(5>>1);
//        printBinaryString(5);
//        printBinaryString(0b101>>2);
//        printBinaryString(Integer.MIN_VALUE);
//        printBinaryString(Integer.MIN_VALUE>>>2);
        printBinaryString(1);
        printBinaryString(1<<1);
        printBinaryString(1<<2);
        printBinaryString(1<<3);
    }

    public static void printBinaryString(int hexNumber) {
        String bits = Integer.toBinaryString(hexNumber);
        String allBits = "00000000000000000000000000000000".substring(0,32-bits.length())+bits;

        System.out.printf("%11d : %s%n", hexNumber, allBits);
    }
}
