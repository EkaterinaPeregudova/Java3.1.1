package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    @Test
    public void createRadio() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = " Радио";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected,radio.getName());
    }
    @Test
    public void  validateChangeFields () {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0,radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(9,radio.getCurrentRadioStation());
    }
    @Test
    public void  mimRadioSt () {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void  maxRadioSt () {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

}