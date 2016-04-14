/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabula.app;

import java.awt.Point;

/**
 *
 * @author MAR
 */
public class Competidor {
    private int id;
    private int carrerasGanadas = 0;
    private String nombre;
    private int velocidad;
    private int posicionX;
    private int posicionY;
    
    public Competidor(int id, String nombre, int velocidad, int posX, int posY) {
        this.id = id;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.posicionX = posX;
        this.posicionY = posY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int carrerasGanadas) {
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
}
