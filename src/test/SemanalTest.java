package test;

import examen.Semanal;
import examen.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class SemanalTest {

    private Semanal semanal;

    @BeforeEach
    void setUp() {
        semanal = new Semanal(new Usuario("usuario", "login", "email"), Calendar.getInstance(), 22);
    }

    @Test
    void activaTest() {
        assert semanal.activa(Calendar.getInstance()) == false;
    }

}