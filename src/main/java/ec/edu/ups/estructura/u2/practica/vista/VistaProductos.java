/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.practica.vista;

import ec.edu.ups.estructura.u2.practica.controlador.PilaProducto;
import ec.edu.ups.estructura.u2.practica.modelo.Producto;

/**
 *
 * @author aroon
 */
public class VistaProductos {
    public static void main(String[] args) {
        //registrar productos
        PilaProducto pilaProducto = new PilaProducto();
        pilaProducto.agregarProducto(new Producto("Redbull", 123, 12.3, 50));
        
    }
}
