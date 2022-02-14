import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {
    @Test
    void hello1() {
        // Given two number
        int numberOne = 4;
        int numberTwo = 4;
        // When the two numbers are added together
        int result = numberOne + numberTwo;
        // Then the result should be 8
        assertThat(result).isEqualTo(8);
    }

    @Test
    void name() {
        // Given

        // When

        // Then
    }

    @Test
    void hello2() {
    }
}

