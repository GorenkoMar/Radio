package ru.netology.javaqa.radio.services;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int idStation;
    private int currentVolume;
    private int quantityStations;
    private int defaultQuantityStations = 10;

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;

    }

    public Radio() {
        quantityStations = defaultQuantityStations;
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


    public int getIdStation() {
        if (currentStation == 0) {
            idStation = 0;
        } else {
            idStation = currentStation - 1;


        }
        return idStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > quantityStations) {
            return;
        }
        currentStation = newCurrentStation;

    }


    public void nextCurrentStation() {
        if (currentStation < quantityStations - 1) {
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