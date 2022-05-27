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
public class Pinguinos {

    private String nombre;
    private String contraseña;
    private boolean socio;
    private int dinero;
    private ArrayList<Items> items;
    private ArrayList<Casas> casa;

    public Pinguinos(String nombre, String contraseña, boolean socio, int dinero, ArrayList<Items> items, ArrayList<Casas> casa) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.socio = socio;
        this.dinero = dinero;
        this.items = items;
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Casas> getCasa() {
        return casa;
    }

    public void setCasa(ArrayList<Casas> casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Pinguinos{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", socio=" + socio + ", dinero=" + dinero + ", items=" + items + ", casa=" + casa + '}';
    }

}
