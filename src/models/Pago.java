/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pago {
    private int idPago;
    private int idVale;
    private BigDecimal montoPago;
    private LocalDate fechaPago;

    
    
    // Constructor vacio
    public Pago() {}

    // Constructor con parametros
    public Pago(int idVale, BigDecimal montoPago, LocalDate fechaPago) {
        this.idVale = idVale;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
    }

    // Getters y Setters
    public int getIdVale() {
        return idVale;
    }

    public void setIdVale(int idVale) {
        this.idVale = idVale;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
