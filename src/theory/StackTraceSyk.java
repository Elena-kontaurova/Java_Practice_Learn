package theory;

public class StackTraceSyk {
    public static void main(String[] args){
        method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        method4();
    }
    public static void method4(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements){
            System.out.println("Номер строки вызова:" + element.getLineNumber());
            System.out.println("Глубина " + stackTraceElements.length);
            System.out.println();
        }
    }
}

