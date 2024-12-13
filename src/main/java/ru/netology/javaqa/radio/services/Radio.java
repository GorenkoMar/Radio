package ru.netology.javaqa.radio.services;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }


    public void nextCurrentStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void prevCurrentStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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
}
