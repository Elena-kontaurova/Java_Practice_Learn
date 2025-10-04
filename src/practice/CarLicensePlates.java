package practice;

public class CarLicensePlates {
    public static void main(String[] args) {
        generateCarLicensePlates();

    }
    public static void generateCarLicensePlates() {
        String variantLetters = "АВСЕНКМОРТХУ";
        String result = "" + variantLetters.charAt(randint(len(variantLetters))) +
                 randint(10) +
                 randint(10) +
                 randint(10) +
                 variantLetters.charAt(randint(len(variantLetters))) +
                 variantLetters.charAt(randint(len(variantLetters)));
        System.out.println(result + " 44");
    }
    public static int len(String str) {
        return str.length();
    }
    public static int randint(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }
}
