package theory.overload;

public class PrintOver {
    public static void main(String[] args) {
        print(1);
        print("sd");
        Integer a = 123;
        print(a);
        print(1, 2);
        print(true);
    }
    public static void print(int a) {
        System.out.println(a);
    }
    public static void print(String a) {
        System.out.println(a);
    }
    public static void print(Integer a) {
        System.out.println("Integer " + a);
    }
    public static void print(int a, int b) {
        System.out.println("int " + a + b);
    }
    public static void print(boolean a) {
        System.out.println(a);
    }
}
