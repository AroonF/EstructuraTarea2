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

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(U precio) {
        this.precio = precio;
    }

    public void setCantidad(V cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}
