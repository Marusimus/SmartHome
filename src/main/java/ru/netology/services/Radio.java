package ru.netology.services;

public class Radio {

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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


    private int currentRadiostationNumber;

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > 9) {
            return;
        }
        if (currentRadiostationNumber < 0) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }


    public void increaseRadiostationNumber() {
        if (currentRadiostationNumber != 9) {
            currentRadiostationNumber = currentRadiostationNumber + 1;
        } else {
            currentRadiostationNumber = 0;
        }
    }

    public void reduceRadiostationNumber() {
        if (currentRadiostationNumber != 0) {
            currentRadiostationNumber = currentRadiostationNumber - 1;
        } else {
            currentRadiostationNumber = 9;
        }
    }

}