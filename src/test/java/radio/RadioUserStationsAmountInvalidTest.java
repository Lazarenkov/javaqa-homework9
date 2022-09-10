package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioUserStationsAmountInvalidTest {
    Radio radio = new Radio(-1);

    @Test
    public void shouldSetStationsAmountToDefaultIfUserStationAmountInvalid() {

        int expected = 10;
        int actual = radio.stationsAmount;
        Assertions.assertEquals(expected, actual);
    }
}
