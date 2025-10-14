package theory;

import java.io.FileNotFoundException;

// Приведение примитивных типов: расширение и сужение
public class ExpansionContraction {
    public static void main(String[] args) {
        numberFive();
    }
    public static void intType() {
        int a = 0;
        int b =  a + 46;
        byte c = (byte) (a*b);
        double f = (double) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);;
    }
    public static void numberTwo() {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = (double) a * 1e-3 + c;
        System.out.println(d);;
    }
    public static void numberThree() {
        float f = (float)128.50;
        int i = (int)f;
        int b = (int)(i + f);
        byte d = (byte) b;
        System.out.println(d);;
    }
    public static void numberFour() {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        char n = (char) nine;
        System.out.println(n);;
    }
    public static void numberFive() {
        int a = 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }

}
