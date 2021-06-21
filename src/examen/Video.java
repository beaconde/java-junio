package examen;

import java.util.Calendar;

public class Video extends Noticia {

    private Long videoId;

    public Video(Calendar fecha, String texto, Long videoId) {
        super(fecha, texto);
        this.videoId = videoId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    @Override
    public String publica() {
        return getTexto() + "\n" + getVideoId();
    }

}
