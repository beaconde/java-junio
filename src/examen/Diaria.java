package examen;

import java.util.Calendar;

public class Diaria implements Suscripcion {

    private Usuario usuario;
    private Calendar caducidad;

    public Diaria(Usuario usuario, Calendar caducidad) {
        this.usuario = usuario;
        this.caducidad = caducidad;
    }

    @Override
    public boolean activa(Calendar fecha) {
        return fecha.before(this.caducidad);
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
    }
}
