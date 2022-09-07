package radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetStationBelowEquivalencePartition() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAtEquivalencePartition(){
        Radio radio=new Radio();
        radio.setCurrentStation(5);
        int expected =5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveEquivalencePartition(){
        Radio radio=new Radio();
        radio.setCurrentStation(18);
        int expected =0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFrom9To0(){
        Radio radio=new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected =0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation(){
        Radio radio=new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected =6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationFrom0To9(){
        Radio radio=new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected =9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStation(){
        Radio radio=new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        int expected =6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume(){
        Radio radio=new Radio();
        int i=0;
        while(i<7) {
            radio.increaseVolume();
            i++;
        }
        radio.decreaseVolume();
        int expected =6;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio radio=new Radio();
        int i=0;
        while(i<5) {
            radio.increaseVolume();
            i++;
        }
        radio.decreaseVolume();
        int expected =4;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotExceedVolume10(){
        Radio radio=new Radio();
        int i=0;
        while(i<15){
            radio.increaseVolume();
            i++;
        }
        int expected =10;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseBelowVolume0(){
        Radio radio=new Radio();
        radio.decreaseVolume();
        int expected =0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }



}

