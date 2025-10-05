package theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayArrayListGenerics {
    public static void main(String[] args) throws IOException {
        delOneAddEnd();
    }
    public static int initializeArray() throws IOException {
        int [] arr = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int a = 0;
        for (int j: arr) {
            if (j > a) {
                a = j;
            }
        }
        return a;
    }
    public static void reverseArray() throws IOException {
        String [] arr = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void twoArrays() throws IOException {
        String [] arr = new String[10];
        int [] arr1 = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            arr[i] = s;
            arr1[i] = s.length();
        }
        for (int j: arr1) {
            System.out.println(j);
        }
    }
    public static void reverseArrayInt() throws IOException {
        int [] arr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void oneBigTwoSmallArrays() throws IOException {
        int [] arr = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];

        System.arraycopy(arr, 0, arr1, 0, 10);

        System.arraycopy(arr, 10, arr2, 0, 10);

        for (int j: arr2) {
            System.out.println(j);
        }
    }
    public static void listOne() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.size());
        for (String j: list) {
            System.out.println(j);
        }
    }
    public static void maxStrList() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }
        String minStr = "";
        for (String j: list) {
            if (j.length() > minStr.length()) {
                minStr = j;
            }
        }
        System.out.println(minStr);
    }
    public static void minStrList() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }
        String minStr = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minStr.length()) {
                minStr = list.get(i);
            }
        }
        System.out.println(minStr);
    }
    public static void listContrary() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.addFirst(s);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
    public static void delOneAddEnd() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }
        for (int i = 0; i < 13; i++) {
            String s = list.getLast();
            list.removeLast();
            list.addFirst(s);
        }
        for (String j: list) {
            System.out.println(j);
        }
    }
}
