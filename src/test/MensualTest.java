package test;

import examen.Mensual;
import examen.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class MensualTest {

    private Mensual mensual;

    @BeforeEach
    void setUp() {
        mensual = new Mensual(new Usuario("usuario", "login", "email"), 2, 22);
    }

    @Test
    void activaTest() {
        assert mensual.activa(Calendar.getInstance()) == false;
    }

}