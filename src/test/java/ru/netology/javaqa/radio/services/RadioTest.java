package ru.netology.javaqa.radio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void turnUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.increaseVolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpVolumeFromMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeFromMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMax() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(5);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardFromMax() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(4);
        rad.nextCurrentStation();

        Assertions.assertEquals(0, rad.getCurrentStation());

    }


    @Test
    public void setStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchStationForwardFrom3() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(3);
        rad.nextCurrentStation();

        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    public void switchStationForwardFrom1() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(1);
        rad.nextCurrentStation();

        Assertions.assertEquals(2, rad.getCurrentStation());

    }

    @Test
    public void switchStationForwardFromMin() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(0);
        rad.nextCurrentStation();

        Assertions.assertEquals(1, rad.getCurrentStation());

    }

    @Test
    public void switchStationBackwardFromMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevCurrentStation();

        Assertions.assertEquals(9, rad.getCurrentStation());

    }

    @Test
    public void switchStationBackwardFromMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prevCurrentStation();

        Assertions.assertEquals(8, rad.getCurrentStation());
    }
}