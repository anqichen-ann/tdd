import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MommifierTest {
    @Test
    void should_insert_mommy_when_given_string_has_more_vowels() {
        //given
        String str = "aeiou";
        String expected = "a mommy e mommy i mommy o mommy u";
        Mommifier mommifier = new Mommifier();
        // when
        final String result = mommifier.insertMommy(str);
        //then
        assertEquals(expected,result);
    }
}
