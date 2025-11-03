/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Cregistro_vales {
    public static List<Cvale> vales = new ArrayList<>();

    public static void agregarVale(Cvale vale) {
        vales.add(vale);
    }

    public static List<Cvale> obtenerValesActivos() {
        List<Cvale> activos = new ArrayList<>();
        for (Cvale v : vales) {
            if (v.activo) {
                activos.add(v);
            }
        }
        return activos;
    }

    public static int obtenerSumaMontos() {
        int total = 0;
        for (Cvale v : vales) {
            if (v.activo) {
                total += v.monto;
            }
        }
        return total;
    }
}
