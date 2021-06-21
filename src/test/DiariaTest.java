package test;

import examen.Diaria;
import examen.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class DiariaTest {

    private Diaria diaria;

    @BeforeEach
    void setUp() {
        diaria = new Diaria(new Usuario("usuario", "login", "email"), Calendar.getInstance());
    }

    @Test
    void activaTest() {
        assert diaria.activa(Calendar.getInstance()) == false;
    }

}