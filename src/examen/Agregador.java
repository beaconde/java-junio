package examen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Agregador {

    private List<Noticia> noticias;
    private List<Suscripcion> suscripciones;

    public Agregador() {
        this.noticias = new ArrayList<Noticia>();
        this.suscripciones = new ArrayList<Suscripcion>();
    }

    public void addNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void removeNoticia(Noticia noticia) {
        noticias.remove(noticia);
    }

    public void addSuscripcion(Suscripcion suscripcion) {
        suscripciones.add(suscripcion);
    }

    public void removeSuscripcion(Suscripcion suscripcion) {
        suscripciones.remove(suscripcion);
    }

    public void enviaSuscripciones() {
        Calendar fecha = Calendar.getInstance();
        for(Suscripcion suscripcion: suscripciones) {
            if (suscripcion.activa(fecha)) {
                System.out.println(suscripcion.getUsuario().getEmail());
            }
        }
    }

    public List<Noticia> noticias(Calendar fecha1, Calendar fecha2) {
        List<Noticia> listaNoticias = new ArrayList<Noticia>();
        for (Noticia noticia: noticias) {
            if (noticia.getFecha().compareTo(fecha1) >= 0 && noticia.getFecha().compareTo(fecha2) <= 0) {
                listaNoticias.add(noticia);
            }
        }
        return listaNoticias;
    }

}
