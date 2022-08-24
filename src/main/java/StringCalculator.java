import java.util.Arrays;

public class StringCalculator {

    public int add(String string) {
        if (string.equals("")) { return 0; }

        String[] stringArray = string.split(",");
        int result = 0;
        for (String number : stringArray) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
