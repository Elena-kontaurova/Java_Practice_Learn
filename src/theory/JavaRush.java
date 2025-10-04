package theory;

import theory.workClass.Cat;
import theory.workClass.Dog;
import theory.workClass.Women;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaRush {
    public static void main(String[] args) throws IOException {
        Women women = new Women("Loxyshka");
        Cat cat = new Cat("Rush", 18, women);
        Cat cat2 = new Cat("Lox", 20, women);
        Dog dog = new Dog("Max", women);
        Dog dog1 = new Dog("Bella", women);
        Dog dog2 = new Dog("Jack", women);
    }
    public static int minTwoNumber(int a, int b) {
         return Math.min(a, b);
    }
    public static int maxTwoNumber(int a, int b) {
        return Math.max(a, b);
    }
    public static int minThreeNumber(int a, int b, int c) {
        int min1 = Math.min(a, b);
        return Math.min(min1, c);
    }
    public static int minFourNumber(int a, int b, int c, int d) {
        int v = Math.min(a, b);
        int w = Math.min(c, d);
        return Math.min(v, w);
    }
    public static void printStr(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
    public static void printStr2(String str) {
        System.out.printf("%s %s %s", str, str, str);
    }
    public static void inputString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        System.out.println(str + " захватит мир через " + num + " лет. Му-ха-ха!");
    }
    public static void inputString2() throws IOException {
        String str = input();
        int num = Integer.parseInt(input());
        int num2 = Integer.parseInt(input());
        System.out.println(str + " получает " + num + " через " + num2 + " лет.");
    }
    public static void inputString3() throws IOException {
        String str = input();
        System.out.println(str + " зарабатывает $5,000. Ха-ха-ха!");
    }
    public static void inputString4() throws IOException {
        String str = input();
        String str2 = input();
        System.out.println(str + " проспонсировал " + str2 + ", и она стала известной певицей.");
    }
    public static void inputString5() throws IOException {
        String str = input();
        String str2 = input();
        String str3 = input();
        System.out.println(str + " + " + str2 + " + " + str3 + " = Чистая любовь, да-да!");
    }
    public static String input() throws IOException {
        return input("");
    }
    public static String input(String str) throws IOException {
        System.out.print(str);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    public static int minimalNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        return Math.min(num1, num2);
    }
    public static int maximalNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int a = Math.max(num1, num2);
        int b = Math.max(num3, num4);
        return Math.max(a, b);
    }
    public static String inDescendingOrder() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int c = Math.max(num3, a);
        return c  + " " + a + " " + b;
    }
    public static String heSameNames() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2)) {
            return "Имена идентичны";
        }
        else if (name1.length() == name2.length()) {
            return "Длины имен равны";
        }
        else {
            return "Совподений нет";
        }
    }
    public static String growUpSomeMore() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        return age <18 ? "Подрасти еще": "Воу";
    }
    public static String thatIsEnough() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        return age > 20 ? "И 18-ти достаточно": "Подрасти еще";
    }
}
