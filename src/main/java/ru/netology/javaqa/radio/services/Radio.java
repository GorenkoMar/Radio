package ru.netology.javaqa.radio.services;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;
    private int quantityStations;


    public Radio(int quantityStations) {
        this.quantityStations = quantityStations - 1;

    }

    public Radio() {
        this.quantityStations = 9;
    }


    public int getQuantityStations() {
        return quantityStations;
    }


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
        if (newCurrentStation > quantityStations) {
            return;
        }
        this.currentStation = newCurrentStation;
    }


    public void nextCurrentStation() {
        if (currentStation < quantityStations) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevCurrentStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = quantityStations;
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