public class StringCalculator {

    public int add(String string) {
        if (string.equals("")) { return 0; }

        int result = 0;
        char separator = ',';

        if (string.matches("^//((.|\\n)*)")) {
            separator = string.charAt(2);
        }

        System.out.println(separator);

        String[] stringArray = string.split("[" + separator + "\n]");

        for (String number : stringArray) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
