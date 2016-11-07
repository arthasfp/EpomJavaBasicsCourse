package hw4;

/**
 * Created by Sergii on 07.11.2016.
 */
public class StringTester {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String reverse(String str) {
        char[] charsFromStr = str.toCharArray();
        char[] reversedString = new char[charsFromStr.length];
        for (int i = 0; i < charsFromStr.length; i++) {
            reversedString[i] = charsFromStr[charsFromStr.length - 1 - i];
        }
        return String.valueOf(reversedString);
    }

    public static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static int countOccurrences(String source, String toFind) {
        int counter = 0;
        while (source.contains(toFind)) {
            source = source.replaceFirst(toFind, "");
            counter++;
        }
        return counter;
    }
}

