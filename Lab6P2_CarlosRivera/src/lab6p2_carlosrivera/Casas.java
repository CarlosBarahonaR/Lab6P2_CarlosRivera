/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_carlosrivera;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Casas {

    private String nombre;
    private int tamaño;
    private int costo;
    private int coordenadaX;
    private int coordenadaY;
    private ArrayList<Puffles> puffles;

    public Casas(String nombre, int tamaño, int costo, int coordenadaX, int coordenadaY, ArrayList<Puffles> puffles) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.costo = costo;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.puffles = puffles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public ArrayList<Puffles> getPuffles() {
        return puffles;
    }

    public void setPuffles(ArrayList<Puffles> puffles) {
        this.puffles = puffles;
    }

    @Override
    public String toString() {
        return "Casas{"+"nombre="+nombre + ", tama\u00f1o=" + tamaño + ", costo=" + costo + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", puffles=" + puffles + '}';
    }

}
