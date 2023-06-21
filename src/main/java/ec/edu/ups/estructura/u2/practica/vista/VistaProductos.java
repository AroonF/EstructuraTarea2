/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.practica.vista;

import ec.edu.ups.estructura.u2.practica.controlador.PilaProducto;
import ec.edu.ups.estructura.u2.practica.controlador.ListaProductos;
import ec.edu.ups.estructura.u2.practica.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author aroon
 */
public class VistaProductos {
    public static void main(String[] args) {
        //registrar productos
        PilaProducto<String,Long,Integer> pilaProducto = new PilaProducto<>();
        ListaProductos<String,Long,Integer> listaProductos = new ListaProductos<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("MENU:");
            System.out.println("1. AGREGAR PRODUCTO");
            System.out.println("2. ELIMINAR PRODUCTO");
            System.out.println("3. BUSCAR");
            System.out.println("4. VENTA DEL PRODUCTO");
            System.out.println("4. SALIR");
            System.out.print("POR FAVOR SELECCIONES UNA DE LAS OPCIONES: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("INTRODUZCA EL CODIGO: ");
                    int codigo = scanner.nextInt();
                    System.out.print("INTRODUZCA NOMBRE: ");
                    String nombre = scanner.next();
                    System.out.println("INTRODUZCA PRECIO");
                    long precio = scanner.nextLong();
                    System.out.println("INTRODUZCA CANTIDAD");
                    int cantidad = scanner.nextInt();
                    Producto<String,Long,Integer> product = new Producto<>(nombre, codigo, precio, cantidad);
                    listaProductos.agregar(product);
                    System.out.println("PRODUCTO AGREGADO");
                    
                    break;
                case 2:
                    System.out.print("INTRODUZCA CODIGO: ");
                    codigo = scanner.nextInt();
                    listaProductos.borrar(codigo);
                    System.out.println("PRODUCTO ELIMINADO");
                    break;
                case 3:
                    System.out.println("INGRESE EL CODIGO A BUSCAR");
                    codigo = scanner.nextInt();
                    listaProductos.buscar(codigo);
                    System.out.println("USTED BUSCO: "+ codigo);
                case 4:
                    
                case 5:
                    System.out.println("GRACIAS POR SALIR");
                    break;
                default:
                    System.out.println("OPCION INVALIDA VULEVA A INGRESAR");
            }
        }
        
    }
        
}
