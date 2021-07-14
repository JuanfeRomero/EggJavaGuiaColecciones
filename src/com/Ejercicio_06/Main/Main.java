package com.Ejercicio_06.Main;

import java.util.Scanner;
import java.util.TreeMap;

/*
* Se  necesita  una  aplicación  para  una  tienda  en  la  cual  queremos  almacenar  los
distintos productos que venderemos y el precio que tendrán.
*  Además, se necesita que la aplicación cuente con las funciones básicas.
* Estas  las  realizaremos  en  el  main.  Como,  introducir  un  elemento, (done)
* modificar  su precio, (done)
* eliminar un producto (done)
* y mostrar los productos que tenemos con su precio (done)
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        TreeMap<String, Integer> catalogo = new TreeMap<>();

        System.out.println("****************Agregar productos******************");
        agregarProducto(catalogo, sc);

        System.out.println("****************Mostrar productos******************");
        System.out.println(catalogo);

        System.out.println("****************Buscar productos*******************");
        buscarProductos(catalogo, sc);

        System.out.println("****************Actualizar precio******************");
        actualizarPrecio(catalogo, sc);

        System.out.println("****************Eliminar precio********************");
        eliminarProducto(catalogo, sc);

        System.out.println("****************Mostrar productos final************");
        System.out.println(catalogo);

    }
    public static void agregarProducto(TreeMap<String, Integer> catalogo, Scanner sc){
        String producto, aux;
        int precio;
        do{
            System.out.println("Ingresar el nombre del producto:");
            producto = sc.nextLine();

            System.out.println("Ingresar el precio del producto:");
            precio = sc.nextInt();
            sc.nextLine();
            catalogo.put(producto, precio);

            System.out.println("Desea ingresar otro producto? (s/n)");
            aux = sc.nextLine();

            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")){
                System.out.println("ERROR. Desea ingresar otro producto? (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));
    }

    public static String buscarProducto(TreeMap<String, Integer> catalogo, Scanner sc) {
        String nombre;

        System.out.println("Ingrese el nombre del producto que desea mostrar: ");
        nombre = sc.nextLine();

        if(!catalogo.containsKey(nombre)){
            System.out.println("No existe el producto con el nombre indicado");
            return null;
        }else{
            System.out.println("El productor: '" +nombre + "' tiene un precio de: $" + catalogo.get(nombre));
            return nombre;
        }
    }

    public static void buscarProductos(TreeMap<String, Integer> catalogo, Scanner sc){
        String aux;
        do{
            buscarProducto(catalogo, sc);

            System.out.println("Desea buscar otro producto? (s/n)");
            aux = sc.nextLine();

            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")){
                System.out.println("ERROR. Desea ingresar otro producto? (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));
    }

    public static void actualizarPrecio(TreeMap<String, Integer> catalogo, Scanner sc){
        String aux;
        int precio;
        do{
            aux = buscarProducto(catalogo, sc);

            if(aux != null){
                System.out.println("Ingrese el precio actualizado del producto");
                precio = sc.nextInt();
                sc.nextLine();
                catalogo.put(aux, precio);
            }

            System.out.println("Desea buscar otro producto? (s/n)");
            aux = sc.nextLine();

            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otro producto? (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));
    }

    public static void eliminarProducto(TreeMap<String, Integer> catalogo, Scanner sc){
        String aux;
        do{
            aux = buscarProducto(catalogo, sc);

            if(aux != null){
                catalogo.remove(aux);
                System.out.println("El producto ha sido eliminado");
            }


            System.out.println("Desea eliminar otro producto? (s/n)");
            aux = sc.nextLine();

            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otro producto? (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));
    }
}
