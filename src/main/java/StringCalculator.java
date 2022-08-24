import java.util.Arrays;

public class StringCalculator {
    public int add(String string) {
        if (string.equals("")) { return 0; }

        String[] stringArray = string.split(",");

        if (stringArray.length == 2) {
            return Integer.parseInt(stringArray[0]) +
                   Integer.parseInt(stringArray[1]);
        }
        if (stringArray.length == 3) {
            return Integer.parseInt(stringArray[0]) +
                   Integer.parseInt(stringArray[1]) +
                   Integer.parseInt(stringArray[2]);
        }


        return Integer.parseInt(string);
    }
}
