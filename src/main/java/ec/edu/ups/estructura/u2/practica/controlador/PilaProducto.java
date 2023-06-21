/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.practica.controlador;

import ec.edu.ups.estructura.u2.practica.modelo.Producto;
import java.util.Stack;

/**
 *
 * @author aroon
 */
public class PilaProducto <T,U,V> {
     private Stack<Producto<T,U,V>> pilasProducto;
    
    public PilaProducto() {
        pilasProducto = new Stack();
    }
    public void agregarProducto(Producto<T,U,V> producto){
        pilasProducto.push(producto);
    }
    public Producto<T,U,V> procesarProducto(){
        Producto<T,U,V> productoProcesar = pilasProducto.pop();
        return productoProcesar;
    }
    public Producto<T,U,V> procesarProductoCola(){
        Producto<T,U,V> productoProcesar = pilasProducto.pop();
        return productoProcesar;
    }
    public boolean estaVacia(){
        return pilasProducto.isEmpty();
    }
}
