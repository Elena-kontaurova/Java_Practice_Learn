package theory;

public class JoinPrintCountLen {
    public static void main(String[] args) {

    }

    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        String result = "";
        while (start <= finish) {
            result = result + start;
            start++;
        }
        return result;
        // END
    }

    public static void printReversedNameBySymbol(String name) {
        // BEGIN (write your solution here)
        int counter = name.length() - 1;
        while (counter >= 0) {
            System.out.println(name.charAt(counter));
            counter--;
        }
    }

    public static int countChars(String str, char ch) {
        int count = 0;
        int len = 0;
        while (count < str.length()) {
            if (Character.toUpperCase(str.charAt(count)) == Character.toUpperCase(ch)) {
                len++;
            }
            count++;
        }
        return len;
    }

    public static String makeItFunny(String str, int n) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if ((i + 1) % n == 0) {
                char a = Character.toUpperCase(str.charAt(i));
                result += a;
            } else {
                result += str.charAt(i);
            }
            i++;
        }
        return result;
    }

    public static boolean hasChar(String str, char ch) {
        if (str == null) {
            return false;
        }
        int count = 0;
        while (count < str.length()) {
            if (Character.toUpperCase(str.charAt(count)) == Character.toUpperCase(ch)) {
                return true;
            }
            count++;
        }
        return false;
    }

    public static String encrypt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            if (i < (str.length() - 1)) {
                result += str.charAt(i + 1);
            }
            result += str.charAt(i);
        }
        return result;
    }
    public static int stringToNumber(String str) {
        int a = Integer.parseInt(str);
        return a;
    }
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String fakeBin(String numberString) {
        int count = 0;
        String temp = "";
        while (count < numberString.length()) {
            int pro = Character.getNumericValue(numberString.charAt(count));
            if (pro < 5) {
                temp += '0';
            }
            else {
                temp += '1';
            }
            count++;
        }
        return temp;
    }
    public static String bmi(double weight, double height) {
        double bbm = weight / (height * height);
        if (bbm <= 18.5) {
            return "Underweight";
        }
        else if (bbm <= 25.9) {
            return "Normal";
        }
        else if (bbm <= 30.0) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
    public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow";
        }
        else if (current.equals("yellow")) {
            return "red";
        }
        else {
            return "green";
        }
    }
    public static int century(int number) {
        if (String.valueOf(number).length() == 4) {
            int newChislo = number - 1;
            String strokaChisli = "";
            strokaChisli = (String.valueOf(newChislo)).substring(0, 2);
            return Integer.parseInt(strokaChisli) + 1;
        }
        else if (String.valueOf(number).length() == 3 && number != 100) {
            int newChislo = number - 1;
            String strokaChisli = "";
            strokaChisli = (String.valueOf(newChislo)).substring(0, 1);
            return Integer.parseInt(strokaChisli) + 1;
        }
        else {
            return 1;
        }
    }
    public static boolean feast(String beast, String dish) {
        return ((beast.charAt(0) == dish.charAt(0) &&
                (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1))));
    }
}