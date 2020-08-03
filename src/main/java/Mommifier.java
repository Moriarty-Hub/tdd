import java.util.Arrays;
import java.util.List;

public class Mommifier {

    private static final String VOWELS = "aeiou";
    private static final double PERCENTAGE_OF_VOWELS = 0.3;
    private static final String INSERTED_STRING = "mommy";

    public String convert(String string) {

        List<String> listOfString = Arrays.asList(string.toLowerCase().split(""));
        List<String> listOfVowels = Arrays.asList(VOWELS.split(""));
        StringBuilder stringBuilder = new StringBuilder(string);

        int numberOfVowels = listOfString.stream().filter(listOfVowels::contains).toArray().length;
        int length = string.length();

        if (numberOfVowels > length * PERCENTAGE_OF_VOWELS) {
            for (int i = 0; i < stringBuilder.length() - 1; i++) {
                if (VOWELS.contains(String.valueOf(stringBuilder.charAt(i))) &&
                        VOWELS.contains(String.valueOf(stringBuilder.charAt(i + 1)))) {
                    stringBuilder.insert(i + 1, INSERTED_STRING);
                    i = i + INSERTED_STRING.length();
                }
            }
        }

        return stringBuilder.toString();
    }

}
