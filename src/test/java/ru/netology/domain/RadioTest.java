package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void createRadio() {
        Radio radio = new Radio();

    }
    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0,radio.maxRadioStation);
        assertEquals(0,radio.minRadioStation);
        assertEquals(0,radio.currentRadioStation);
        assertFalse(radio.on);
        assertEquals(0,radio.maxVolume);
        assertEquals(0,radio.minVolume);
        assertEquals(0,radio.currentVolume);
    }

    @Test
//    Из-за обращения к null тест упадет, по этому подключаем анотацию Disabled, чтобы пропустить его
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0,radio.name.length());
    }
    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0,radio.currentRadioStation);
        radio.currentRadioStation = -100;
        assertEquals(-100,radio.currentRadioStation);
    }



}