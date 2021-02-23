package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    public void validateChangeFields() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                5
        );

        assertEquals(5, radio.getCurrentRadioStation());
    }

    // тестируем станции
    @Test
    public void changeOverLastRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                10
        );
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                0
        );
        radio.pressPrevStation();
        assertEquals(10, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                6
        );
        radio.pressNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                6
        );
        radio.pressPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void OverInitialRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                11
        );
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                5,
                10,
                0,
                -1
        );
        assertEquals(0, radio.getMinRadioStation());
    }

    // тестируем громкость
    @Test
    public void volumeOverMax() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                120,
                10,
                0,
                3
        );
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                -1,
                10,
                0,
                3
        );
        assertEquals(0, radio.getMinVolume());

    }

    @Test
    public void plusVolume() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                4,
                10,
                0,
                3
        );
        radio.pressPlusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        RadioAdvanced radio = new RadioAdvanced(
                100,
                0,
                4,
                10,
                0,
                3
        );
        radio.pressMinusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }
}
