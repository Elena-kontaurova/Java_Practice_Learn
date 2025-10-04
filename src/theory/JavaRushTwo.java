package theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaRushTwo {
    public static void main(String[] args) throws IOException {

    }
    public static void cycleOfNumbers() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }
    public static void cycleOfNumbers2() {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
    public static void numStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        while (num > 0) {
            System.out.println(str);
            num--;
        }
    }
    public static void squareS() {
        String str = "S";
        int num = 10;
        while (num > 0) {
            for (int a = 10; a > 0; a--) {
                System.out.print(str);
            }
            System.out.println(str);
            num--;
        }
    }
    public static void squareUmno() {
        int num = 1;
        while (num < 10) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(a * num + " ");
            }
            System.out.println(" ");
            num++;
        }
    }
    public static void inputNumbers() {
        for (int a = 1; a <= 100; a++) {
            System.out.print(a + " ");
        }
    }
    public static void triangle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        for (int a = 1; a <= num1; a++) {
            String str = "";
            for (int b = 1; b <= num2; b++) {
                str = str + "8";
            }
            System.out.println(str);
        }
    }
    public static void triangle2() {
        String str = "";
        for (int a = 1; a <= 10; a++) {
            str += "8";
            System.out.println(str);
        }
    }
    public static void xyeta() {
        String str = "8";
        for (int a = 1; a <= 10; a++) {
            System.out.print(str + " ");
        }
        for (int a = 1; a <= 9; a++) {
            System.out.println(str + " ");
        }
    }
    public static void xyeta2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        for (int a = 1; a <= 10; a++) {
            System.out.println(str + " любит меня!");
        }
    }
}
