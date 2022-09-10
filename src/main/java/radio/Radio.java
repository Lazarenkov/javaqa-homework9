package radio;


public class Radio {

    int currentStation;

    int currentVolume;

    int stationsAmount = 10;
    int lastStation = stationsAmount - 1;

    public Radio() {

    }

    public Radio(int stationsAmount) {
        if (stationsAmount <= 0) {
            return;
        }
        this.stationsAmount = stationsAmount;
        this.lastStation = stationsAmount - 1;
    }

    public void nextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public void setCurrentStation(int userValue) {
        if (userValue < 0 || userValue > lastStation) {
            return;
        }
        currentStation = userValue;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
