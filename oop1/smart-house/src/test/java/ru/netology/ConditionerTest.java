package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Conditioner conditioner = new Conditioner();
        assertNull(conditioner.name);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertFalse(conditioner.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        conditioner.currentTemperature = -100;
        assertEquals(-100, conditioner.currentTemperature);
    }
}