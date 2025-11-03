/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Asus
 */
public class Cvale {
public String cliente;
    public int quincenas;
    public int monto;
    public boolean activo;

    public Cvale(String cliente, int quincenas, int monto) {
        this.cliente = cliente;
        this.quincenas = quincenas;
        this.monto = monto;
        this.activo = true; // todos los vales nuevos se guardan como activos
    }
}
