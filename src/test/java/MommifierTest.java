import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MommifierTest {
    Mommifier mommifier = new Mommifier();
    @Test
    void should_return_string_when_input_has_not_enough_vowels() {
        String str = "string";
        final String result = mommifier.convert(str);
        assertEquals("string",result);
    }

    @Test
    void should_return_string_when_input_has_many_vowels_but_not_continuous_vowels() {
        String str = "hello";
        final String result = mommifier.convert(str);
        assertEquals("hello",result);
    }

    @Test
    void should_insert_mommy_when_given_string_has_many_and_continuous_vowels() {
        //given
        String str = "aeiou";
        String expected = "amommyemommyimommyomommyu";
        // when
        final String result = mommifier.convert(str);
        //then
        assertEquals(expected,result);
    }
}
