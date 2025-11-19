/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author campo
 */
public class Vale {
    private int idVale;
    private int idUsuario;
    private double montoTotal;
    private double saldoActual;
    private String estado;
    private java.sql.Date fechaVencimiento;
    // Constructor vacío
    public Vale() {}

   //Constructor con parametros
    public Vale(int idUsuario, double montoTotal, double saldoActual, LocalDate fechaVencimiento, String estado) {
    this.idUsuario = idUsuario;
    this.montoTotal = montoTotal;
    this.saldoActual = saldoActual;
    this.estado = estado;
    this.fechaVencimiento = java.sql.Date.valueOf(fechaVencimiento); 
}


    // Getters y Setters
    public int getIdVale() { return idVale; }
    public void setIdVale(int idVale) { this.idVale = idVale; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public double getSaldoActual() { return saldoActual; }
    public void setSaldoActual(double saldoActual) { this.saldoActual = saldoActual; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
   

public java.sql.Date getFechaVencimiento() {
    return fechaVencimiento;
}

public void setFechaVencimiento(java.sql.Date fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
}

}
