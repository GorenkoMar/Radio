package ru.netology.javaqa.radio.services;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;
    private int maxStation;


    public Radio(int quantityStations) {
        this.maxStation = quantityStations - 1;

    }

    public Radio() {
        this.maxStation = 9;
    }
    
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void nextCurrentStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;

    }

    public void prevCurrentStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}