package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetRadiostationNumber () {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseRadiostationNumber () {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.increaseRadiostationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadiostationNumber () {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.reduceRadiostationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }






    @Test
    public void shouldSetVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(75);

        int expected = 75;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}