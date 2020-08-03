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
}
