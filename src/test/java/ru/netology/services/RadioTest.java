package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(7);

        int expected = 7;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseCountMoreThanDefault() {
        Radio radio = new Radio(25);
        radio.setCurrentRadiostationNumber(20);

        int expected = 20;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(75);

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        radio.increaseRadiostationNumber();

        int expected = 6;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxIncreaseRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.increaseRadiostationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minIncreaseRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(0);
        radio.increaseRadiostationNumber();

        int expected = 1;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        radio.reduceRadiostationNumber();

        int expected = 4;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minReduceRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(0);
        radio.reduceRadiostationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxReduceRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.reduceRadiostationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadiostationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(75);

        int expected = 75;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minThanMinReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}