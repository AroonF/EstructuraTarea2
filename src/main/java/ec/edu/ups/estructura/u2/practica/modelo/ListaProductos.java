/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.practica.modelo;

import java.util.LinkedList;

/**
 *
 * @author aroon
 */
public class ListaProductos<T,U,V> {
    private LinkedList<Producto<T,U,V>> productos;

    public ListaProductos() {
        productos = new LinkedList<>();
    }

    public void agregar(Producto<T,U,V> producto) {
        productos.add(producto);
    }

    public Producto<T,U,V> buscar(int codigo) {
        for (Producto<T,U,V> producto : productos) {
            if (producto.getCodigo()== codigo) {
                return producto;
            }
        }
        return null;
    }

    public void borrar(int codigo) {
        Producto<T,U,V> produc = buscar(codigo);
        if (produc != null) {
            productos.remove(produc);
        }
    }
    
}
