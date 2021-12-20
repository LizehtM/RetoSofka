package retosofka;

public class Premios {

    private double premio;
    private final int acumulado = 10000;

    public Premios() {
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public double respuestaCorrecta() {

        this.premio += acumulado;
        return this.premio;
    }

    public double respuestaIncorrecta() {

        this.premio = 0;
        return this.premio;
    }

}
