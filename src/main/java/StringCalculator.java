import java.util.Arrays;

public class StringCalculator {

    public int add(String string) {
        String input = string;
        if (string.equals("")) { return 0; }

        int result = 0;
        char separator = ',';

        if (string.matches("^//((.|\\n)*)")) {
            separator = string.charAt(2);
            input = string.substring(4);
        }

        String[] stringArray = input.split("[" + separator + "\n]");

        for (String number : stringArray) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
