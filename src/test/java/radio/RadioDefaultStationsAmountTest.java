package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioDefaultStationsAmountTest {
    Radio radio = new Radio();

    @Test
    public void shouldNotSetStationBelowEquivalencePartition() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAtEquivalencePartitionDefaultStationsAmount() {

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveEquivalencePartitionDefaultStationsAmount() {

        radio.setCurrentStation(18);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFromLastTo0DefaultStationsAmount() {

        radio.setCurrentStation(radio.lastStation);
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFrom0ToLastDefaultStationsAmount() {

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = radio.lastStation;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationDefaultStationsAmount() {

        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPreviousStationDefaultStationsAmount() {

        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
}

