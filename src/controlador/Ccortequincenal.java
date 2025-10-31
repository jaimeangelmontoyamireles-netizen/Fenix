/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Ccortequincenal {
      public static ArrayList<Cvale> listaVales = new ArrayList<>();

    public static int contarValesActivos() {
        int cantidad = 0;
        for (Cvale v : listaVales) {
            if (v.activo) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static int sumarValesActivos() {
        int total = 0;
        for (Cvale v : listaVales) {
            if (v.activo) {
                total += v.monto;
            }
        }
        return total;
    }
}
