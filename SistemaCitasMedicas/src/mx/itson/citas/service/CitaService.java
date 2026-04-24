/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.citas.service;

import java.util.ArrayList;
import mx.itson.citas.model.Cita;

/**
 *
 * @author efrainvalenzuela
 */
public class CitaService {
    
        private final ArrayList<Cita> citas = new ArrayList<>();

    // Constructor con datos de prueba
    public CitaService() {
        citas.add(new Cita(1, "Efrain"));
        citas.add(new Cita(2, "Maria"));
    }

    // Obtener lista de citas
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    // Cancelar cita por índice
    public void cancelarCita(int index) {
        citas.get(index).cancelada = true;
    }
}
    

