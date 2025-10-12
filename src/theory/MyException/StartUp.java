package theory.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        try {
            switch (a) {
                case 1:
                    throw new Exception1();
                case 2:
                    throw new Exception2();
                case 3:
                    throw new Exception3();
            }
        }
        catch (Exception3 e) {
            System.out.println(e + " dfd");
        }
        catch (Exception2 e) {
            System.out.println(e + " соси");
        }
        catch (Exception1 e) {
            System.out.println(e + " зизизизи");
        }
    }
}
