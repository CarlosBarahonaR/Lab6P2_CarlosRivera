/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_carlosrivera;

/**
 *
 * @author Admin
 */
public class Juego {

    private int costo;
    private int recompensa;
    private int probabilidad;

    public Juego(int costo, int recompensa, int probabilidad) {
        this.costo = costo;
        this.recompensa = recompensa;
        this.probabilidad = probabilidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    @Override
    public String toString() {
        return "Juego{" + "costo=" + costo + ", recompensa=" + recompensa + ", probabilidad=" + probabilidad + '}';
    }

}
