package ru.netology.services;

public class Radio {

    private int currentVolume;
    private int currentRadiostationNumber;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countOfRadiostation) {
        this.maxStation = countOfRadiostation - 1;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }


    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }

    public void increaseRadiostationNumber() {
        if (currentRadiostationNumber != maxStation) {
            currentRadiostationNumber = currentRadiostationNumber + 1;
        } else {
            currentRadiostationNumber = 0;
        }
    }

    public void reduceRadiostationNumber() {
        if (currentRadiostationNumber != 0) {
            currentRadiostationNumber = currentRadiostationNumber - 1;
        } else {
            currentRadiostationNumber = maxStation;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > maxStation) {
            return;
        }
        if (currentRadiostationNumber < 0) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }
}