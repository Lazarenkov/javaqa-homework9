package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioUserStationsAmountValidTest {
    Radio radio = new Radio(30);

    @Test
    public void shouldNotSetStationBelowEquivalencePartition() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAtEquivalencePartition() {

        radio.setCurrentStation(radio.lastStation);
        int expected = radio.lastStation;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveEquivalencePartition() {

        radio.setCurrentStation(radio.lastStation + 10);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFromLastTo0() {

        radio.setCurrentStation(radio.lastStation);
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFrom0ToLast() {

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = radio.lastStation;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        if (radio.stationsAmount == 1) {  //в случае если пользователь задаст количество станций=1, то в этом тесте не будет смысла. Его заменит shouldSwitchStationFromLastTo0
            return;
        }

        radio.setCurrentStation(radio.lastStation - 1);
        radio.nextStation();
        int expected = radio.lastStation;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPreviousStation() {
        if (radio.stationsAmount == 1) {  //в случае если пользователь задаст количество станций=1, то в этом тесте не будет смысла. Его заменит shouldSwitchStationFrom0ToLast
            return;
        }

        radio.setCurrentStation(radio.lastStation);
        radio.prevStation();
        int expected = radio.lastStation - 1;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
}
