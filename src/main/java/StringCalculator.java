import java.util.Arrays;

public class StringCalculator {
    public int add(String string) {
        if (string.equals("")) { return 0; }

        String[] stringArray = string.split(",");

        if (stringArray.length == 1) {
            return Integer.parseInt(string);
        }

        return Integer.parseInt(stringArray[0]) + Integer.parseInt(stringArray[1]);

    }
}
