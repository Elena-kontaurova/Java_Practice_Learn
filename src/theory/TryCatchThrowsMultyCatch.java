package theory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TryCatchThrowsMultyCatch {
    public static void main(String[] args) throws IOException, URISyntaxException {
        start();
    }
    public static void launch() {
        System.out.println("Программа запущенна");
        try {
            divisionZero();
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль((");
        }
    }
    public static void divisionZero() {
        int a = 47;
        int b = 0;
        System.out.println(a / b);
    }

    public static void launchWorkStr() {
        System.out.println("Программа запущенна");
        try {
            workStr();
        }
        catch (NullPointerException e) {
            System.out.println("Cтрока пустая");
        }
    }
    public static void workStr() {
        String s = null;
        String m = s.toLowerCase();
        System.out.println(m);
    }

    public static void launchWorkArray() {
        System.out.println("Программа запущенна");
        try {
            workArray();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("предел допустимого диапазона");
        }
    }
    public static void workArray() {
        int[] m = new int[2];
        m[8] = 5;
        for (int i : m) {
            System.out.println(i);
        }
    }

    public static void launchWorkList() {
        System.out.println("Программа запущенна");
        try {
            workList();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Предел допустимого значения");
        }
    }
    public static void workList() {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
        System.out.println(s);
    }

    public static void launchWorkMap() {
        System.out.println("Программа запущенна");
        try {
            workMap();
        }
        catch (Exception e) {
            System.out.println(e + "ключ null");
        }
    }
    public static void workMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"лох");
        map.put(2,"лох");
        map.put(3,"лох");
        for (Map.Entry<Integer, String> ent: map.entrySet()) {
            System.out.println(ent.getKey() + "-" + ent.getValue());

        }
        System.out.println(map);
    }
    public static void launchExceptionTwoFour() throws IOException, URISyntaxException {
        System.out.println("Программа запущенна");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        try {
            launchException(a);
        }
        catch (NullPointerException e) {
            System.out.println("Исключение для нулевого показателя");
        }
        catch (FileNotFoundException  e) {
            System.out.println("Файл не найден");
        }

    }
    public static void launchException(int a) throws FileNotFoundException, URISyntaxException {
        if (a == 1) {
            throw new NullPointerException();
        }
        else if (a == 2) {
            throw new FileNotFoundException();
        }
        else if (a == 3) {
            throw new ArithmeticException();
        }
        else if (a == 4) {
            throw new URISyntaxException("", "");
        }
    }
    public static void start(){
        try {
            whileNumber();
        }
        catch (InterruptedException e) {
            System.out.println(e + " кудаааа боже");
        }

    }
    public static void whileNumber() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
