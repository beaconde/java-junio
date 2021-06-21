package examen;

import java.util.Calendar;

public class Semanal implements Suscripcion {

    private Usuario usuario;
    private Calendar caducidad;
    private int dia;

    public Semanal(Usuario usuario, Calendar caducidad, int dia) {
        this.usuario = usuario;
        this.caducidad = caducidad;
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar fecha) {
        int diaDelMes = fecha.get(Calendar.DAY_OF_MONTH);
        return fecha.before(this.caducidad) && diaDelMes == this.dia;
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
