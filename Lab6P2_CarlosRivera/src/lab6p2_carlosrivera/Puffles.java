/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_carlosrivera;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Puffles {

    private String nombre;
    private int precio;
    private Color color;

    public Puffles(String nombre, int precio, Color color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Puffles{" + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + '}';
    }

}
