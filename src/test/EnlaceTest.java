package test;

import examen.Enlace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

class EnlaceTest {

    private Enlace enlace;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        enlace = new Enlace(Calendar.getInstance(),"texto", "url");
    }

    @Test
    void publicaTest() {
        String text = "texto\nurl";
        assertEquals(text, enlace.publica());
    }

}