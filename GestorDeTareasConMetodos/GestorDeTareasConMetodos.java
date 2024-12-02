package GestorDeTareasConMetodos;

//Uso de listass dinamicas con ArrayList
//Menu interactivo con bucles y estructuras de control
//Manipulacion de datos dentro de una lista
//Modularizacion del codigo mediante Metodos

//REQUERIMIENTOS DEL PROYECTO
//MOSTRAR UN MENU INTERACTIVO CON LA OPCIONES (AGREGAR,MOSTRAR, MARCAR UNA TAREA,ELIMINAR, SALIR)
//PERMITIR AL USUARIO INGRESAR TAREAS Y ALMACENARLAS EN UNA LISTA)
//MOSTRAR TODAS LAS TAREAS CON SU ESTADO (PENDIENTES O COMPLETADAS)
//MOSTRAR TAREAS ESPECIFICAS COMO COMPLETADAS POR SU INDICE
//ELIMINAR TAREAS ESPECIFICAS POR SU INDICE
//VALIDAR ENTRADAS DEL USUARIO PARA EVITAR ERRORES


import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareasConMetodos {
    public static void main(String[] args) {
        GestorDeTareasConMetodos gestorDeTareasConMetodos = new GestorDeTareasConMetodos();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tareas = new ArrayList<>();
        ArrayList<String> estadoTarea = new ArrayList<>();

        Boolean funcionDelPrograma  = true;

        System.out.println("*** Bienvenido al gestor de tareas ***");

        while(funcionDelPrograma) {
            System.out.println("""
                    
                    --- Seleccione la opción que desea realizar por su indice ---
                    1. Agregar tarea
                    2. Mostrar tarea
                    3. Marcar una tarea como realizada
                    4. Eliminar tarea
                    5. Salir
                     
                    """);

            int opcion;
            try{
            opcion = scanner.nextInt();
            scanner.nextLine();
            } catch (Exception e){
                System.out.println("Entrada invalida, ingrese un número");
                scanner.nextLine();
                continue;
            }


            switch(opcion) {
                case 1 -> gestorDeTareasConMetodos.agregarTarea(scanner, tareas, estadoTarea);
                case 2 -> gestorDeTareasConMetodos.mostrarListaTareas(tareas, estadoTarea);
                case 3 -> gestorDeTareasConMetodos.cambiarEstadoDeTarea(estadoTarea, scanner);
                case 4 -> gestorDeTareasConMetodos.eliminarTarea(scanner, tareas, estadoTarea);
                case 5 -> funcionDelPrograma = false;
                default -> System.out.println("Opcion no valida, Intente de nuevo");
            }
        }
        System.out.println("Saliendo del programa... ");
    }

    public void agregarTarea(Scanner scanner, ArrayList<String> tareas, ArrayList<String> estadoTarea){
        System.out.println("Ingrese la descripción de la tarea");
        String descripcionTarea = scanner.nextLine();
        System.out.println("Tarea registrada con exito");
        tareas.add(descripcionTarea);
        estadoTarea.add("[PENDIENTE]");
    }

    public void mostrarListaTareas(ArrayList<String> tareas, ArrayList<String> estadoTarea){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas registradas");
            return;
        }else {
            System.out.println("--- Mostrando la lista de tareas ---");
            for (int i = 0, j = 0; i < tareas.size() && j < estadoTarea.size(); i++, j++) {
                System.out.println((i + 1) + ". " + estadoTarea.get(j) + " " + tareas.get(i));
            }
        }
    }

    public void cambiarEstadoDeTarea(ArrayList<String> estadoTarea, Scanner scanner){
        System.out.println("Cúal es el indice de la tarea que desea marcar como 'COMPLETADA' ");
        int indice = scanner.nextInt();
        indice = indice - 1;
        if (estadoTarea.isEmpty()){
            System.out.println("No hay tareas registradas");
        }else if(indice >=0 && indice < estadoTarea.size()){
            estadoTarea.set(indice, "[COMPLETADA]");
            System.out.println("La tarea fue actualizada con exito");
        }else{
            System.out.println("Indice de la tarea no valido");
        }
    }

    public void eliminarTarea(Scanner scanner, ArrayList<String> tareas, ArrayList<String> estadoTarea) {
        System.out.println("Cual es el indice de la tarea que desea eliminar");
        int indiceEliminar = scanner.nextInt();
        indiceEliminar = indiceEliminar - 1;
        if (indiceEliminar >= 0 && indiceEliminar < tareas.size()) {
            tareas.remove(indiceEliminar);
            estadoTarea.remove(indiceEliminar);
            System.out.println("Tarea eliminada con exito");
        } else {
            System.out.println("Indice de la tarea no es valido");
        }
    }
}
