import com.devbox.java.LastNonRepeatedCharacterFromString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastNonRepeatedCharacterFromStringTest {

    @ParameterizedTest
    @ValueSource(strings = {"ABB","CAA","MCC"})
    public void givenAnyStringWithOnlyFirstNonRepeatedCharacterThenPassed(String value){
        LastNonRepeatedCharacterFromString p1 = new LastNonRepeatedCharacterFromString();
        String expectedResult = String.valueOf(value.charAt(0));
        String actualResult = p1.validation(value);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAB","CCA","MMC"})
    public void givenAnyStringWithOnlyLastNonRepeatedCharacterThenPassed(String value){
        LastNonRepeatedCharacterFromString p1 = new LastNonRepeatedCharacterFromString();
        String expectedResult = String.valueOf(value.charAt(value.length()-1));
        String actualResult = p1.validation(value);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AA","BBB","11"})
    public void givenAnyStringWithAllRepeatedCharactersThenFailed(String value){
        LastNonRepeatedCharacterFromString p1 = new LastNonRepeatedCharacterFromString();
        String expectedResult = LastNonRepeatedCharacterFromString.ALL_REPEATED_CHARACTER;
        String actualResult = p1.validation(value);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"MNT","BCA","1MG"})
    public void givenAnyStringWithoutRepeatedCharactersThenPassed(String value){
        LastNonRepeatedCharacterFromString p1 = new LastNonRepeatedCharacterFromString();
        String expectedResult = String.valueOf(value.charAt(value.length()-1));
        String actualResult = p1.validation(value);
        assertEquals(expectedResult,actualResult);
    }

}
