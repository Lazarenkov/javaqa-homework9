package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioVolumeTest {
    Radio radio = new Radio();

    @Test
    public void shouldIncreaseVolume() {

        int i = 0;
        while (i < 7) {
            radio.increaseVolume();
            i++;
        }
        int expected = 7;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        int i = 0;
        while (i < 5) {
            radio.increaseVolume();
            i++;
        }
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotExceedVolume100() {

        int i = 0;
        while (i < 150) {
            radio.increaseVolume();
            i++;
        }
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseBelowVolume0() {

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}
