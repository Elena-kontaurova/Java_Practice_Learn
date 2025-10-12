package theory.MyException;

import java.io.IOException;
import java.net.URISyntaxException;

public class StartUpCheckedUnchecked {
    public static void main(String[] args) {
        try {
            exception123(4);
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exception123(int a) throws Exception {
        switch (a) {
            case 1:
                throw new Exception1();
            case 2:
                throw new Exception2();
            case 3:
                throw new Exception3();
            case 4:
                throw new RuntimeException();
        }
    }
}
