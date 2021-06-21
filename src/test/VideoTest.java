package test;

import examen.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {

    private Video video;

    @BeforeEach
    void setUp() {
        video = new Video(Calendar.getInstance(), "texto", 01L);
    }

    @Test
    void publicaTest() {
        String text = "texto\n1";
        assertEquals(text, video.publica());
    }

}