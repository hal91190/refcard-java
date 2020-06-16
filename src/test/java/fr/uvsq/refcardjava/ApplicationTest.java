package fr.uvsq.refcardjava;

import org.junit.jupiter.api.Test;

import static fr.uvsq.refcardjava.Application.APPLICATION;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {
    @Test
    void testGreetings() {
        assertEquals("Hello !", APPLICATION.getGreetings());
    }
}
