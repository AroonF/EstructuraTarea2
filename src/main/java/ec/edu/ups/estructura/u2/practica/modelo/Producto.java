/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.practica.modelo;

/**
 *
 * @author aroon
 */
public class Producto <T,U,V>{
    private T nombre;
    private int codigo;
    private U precio;
    private V cantidad;

    public Producto() {
    }

    public Producto(T nombre, int codigo, U precio, V cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public T getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public U getPrecio() {
        return precio;
    }

    public V getCantidad() {
        return cantidad;
    }
}
