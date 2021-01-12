package HomeWork1;

import java.util.Arrays;
import java.util.Locale;

public class CountOfChar {
    public static void main(String[] args) {

        String text = "qqq www eee rrr ttt g";
        char[] charArray = createCharArray();
        System.out.println(Arrays.toString(charArray));
        text = text.toLowerCase(Locale.ROOT);
        char[] textCharArray = text.toCharArray();
        int count = 0;

        for (char c : charArray) {
            for (char value : textCharArray) {
                if (c == value) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("Символ " + c + " встречается " + count + " раз");
            }
            count = 0;
        }

    }


    public static char[] createCharArray() {
        char[] array = new char[26];

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('a' + i);
        }
        return array;
    }
}
