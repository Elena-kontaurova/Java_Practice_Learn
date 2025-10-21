package theory.overload;

public class MinOver {
    public static void main(String[] args) {
        int n = min(1, 2);
        long aa = 3;
        long bb = 4;
        long n1 = min(aa, bb);
        double n2 = min(1.1, 2.2);
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}
