package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        calculatorUser();
    }

    public static void calculatorUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int one_number = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе число: ");
        int two_number = Integer.parseInt(reader.readLine());
        System.out.print("Введите операцию: ");
        String operation = reader.readLine();
        switch (operation) {
            case "+" -> System.out.println(sum(one_number, two_number));
            case "-" -> System.out.println(minus(one_number, two_number));
            case "*" -> System.out.println(multiplication(one_number, two_number));
            case "/" -> System.out.println(division(one_number, two_number));
            default -> System.out.println("Невалидная операция");
        }
    }
    public static int sum(int oneNumber, int twoNumber) {
        return oneNumber + twoNumber;
    }
    public static int minus(int oneNumber, int twoNumber) {
        return oneNumber - twoNumber;
    }
    public static int multiplication(int oneNumber, int twoNumber) {
        return oneNumber * twoNumber;
    }
    public static int division(int oneNumber, int twoNumber) {
        if (twoNumber == 0) {
            System.out.println("На ноль делить нельзя");
        }
        return oneNumber / twoNumber;
    }
}