package examen;

import java.util.Calendar;

public class Mensual implements Suscripcion {

    private Usuario usuario;
    private int duracion;
    private int dia;

    public Mensual(Usuario usuario, int duracion, int dia) {
        this.usuario = usuario;
        this.duracion = duracion;
        this.dia = dia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar fecha) {
        int diaDelMes = fecha.get(Calendar.DAY_OF_MONTH);
        return this.dia == diaDelMes;
    }

    @Override
    public Usuario getUsuario() {
        return this.usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
