package GestorDeContactos;

//El gestor de contactos contendra nombre, telefono, correo electronico y dirección
//RETO
//PERSISTENCIA DE DATOS (Guardando y obteniendo desde un archivo)
//Serializar y deserializar objetos
//Clases personalizadas
//trabajar con colecciones personalizadas, lista de objetos (HashMap)
//implementar la busqueda de elementos desde una coleccion
//organizar datos usando criterios especificos (Como por ejemplo nombre)
//Modularizacion del codigo

//Menú con las opciones: agregar contacto, mostrar lista de contactos, buscar un contacto por nombre, eliminar un contacto, salir del programa
//permitir agregar contactos con toda su informacion
//Buscar contacto por nombre con coincidencia exacta
//Eliminar un contacto de la lista
// validar las entradas del usuario y manejar errores

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeContactos {
    public static void main(String[] args) {
        GestorDeContactos gestorDeContactos = new GestorDeContactos();
        Scanner scan = new Scanner(System.in);

        ArrayList<String> Contactos= new ArrayList<>();

        Boolean ejecucion = true;

        System.out.println("--- BIENVENIDO AL GESTOR DE CONTACTOS ---");

        while(ejecucion){

            System.out.println("""
                    
                    --- SELECCIONE EL INDICE DE LO QUE DESEA REALIZAR ---
                    
                    1.  Agregar contacto nuevo
                    2.  Mostrar lista de contactos
                    3.  Buscar un contacto por nombre
                    4.  Eliminar un contacto de la lista
                    5.  Salir del programa
                    
                    """);

            int opcion = scan.nextInt();
            scan.nextLine();

            switch(opcion){
                case 1 -> gestorDeContactos.nuevoContacto(scan);

            }

        }

        System.out.println("Saliendo del programa...");


    }
    //Metodo para agregar contacto nuevo
    public void nuevoContacto(Scanner scan){
        System.out.println("""
                *   Agregar nuevo contacto    *
                
                Ingrese el nombre del contacto:
                """);
        String nombreContacto = scan.nextLine();
        System.out.println("Ingrese el numero de telefono:");
        int numeroContacto = scan.nextInt();
        System.out.println("Ingrese el correo electronico:");
        String correoContacto = scan.next();
        System.out.println("Ingrese la direccion:");
        String direccionContacto = scan.nextLine();
        System.out.println("""
                
                *   CONTACTO GUARDADO CON EXITO   *
                """);
    }


}
