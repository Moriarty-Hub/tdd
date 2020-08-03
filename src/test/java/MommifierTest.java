import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void should_return_origin_string_when_vowels_are_less_than_thirty_percent() {
        Mommifier mommifier = new Mommifier();
        String origin = "This is a test string";
        String expected = mommifier.convert(origin);
        assertEquals(expected, origin);
    }

    @Test
    void should_return_origin_string_when_vowels_are_greater_than_thirty_percent_but_has_no_continuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String origin = "Tis isisisisisisi a tet sing";
        String expected = mommifier.convert(origin);
        assertEquals(expected, origin);
    }

    @Test
    void should_return_string_with_inserted_specified_word_when_vowels_are_greater_than_thirsty_percent_and_with_continuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String origin = "Tis iiiis aaaa tet sing";
        String expected = mommifier.convert(origin);
        assertEquals(expected, "Tis imommyimommyimommyis amommyamommyamommya tet sing");
    }

}
