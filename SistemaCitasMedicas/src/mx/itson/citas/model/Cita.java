/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.citas.model;

/**
 *
 * @author efrainvalenzuela
 */
public class Cita {
    
    public int id;
    public String paciente;
    public boolean cancelada;

    // Constructor
    public Cita(int id, String paciente) {
        this.id = id;
        this.paciente = paciente;
        this.cancelada = false;
    }

    // Método para mostrar la cita en la lista
    @Override
    public String toString() {
        return id + " - " + paciente + (cancelada ? " (Cancelada)" : "");
    }
    
}
