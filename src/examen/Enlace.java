package examen;

import examen.Noticia;

import java.util.Calendar;

public class Enlace extends Noticia {

    private String url;

    public Enlace(Calendar fecha, String texto, String url) {
        super(fecha, texto);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String publica() {
        return getTexto() + "\n" + getUrl();
    }

}
