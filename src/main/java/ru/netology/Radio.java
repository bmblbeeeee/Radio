package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next(int currentStation) {
        this.currentStation++;
    }

    public void prev(int currentStation) {
        this.currentStation--;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            next(currentStation);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            prev(currentStation);
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        } else {
            return;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        } else {
            return;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
