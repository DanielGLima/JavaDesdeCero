package GestorDeTareas;

//Uso de listass dinamicas con ArrayList
//Menu interactivo con bucles y estructuras de control
//Manipulacion de datos dentro de una lista

//REQUERIMIENTOS DEL PROYECTO
//MOSTRAR UN MENU INTERACTIVO CON LA OPCIONES (AGREGAR,MOSTRAR, MARCAR UNA TAREA,ELIMINAR, SALIR)
//PERMITIR AL USUARIO INGRESAR TAREAS Y ALMACENARLAS EN UNA LISTA)
//MOSTRAR TODAS LAS TAREAS CON SU ESTADO (PENDIENTES O COMPLETADAS)
//MOSTRAR TAREAS ESPECIFICAS COMO COMPLETADAS POR SU INDICE
//ELIMINAR TAREAS ESPECIFICAS POR SU INDICE
//VALIDAR ENTRADAS DEL USUARIO PARA EVITAR ERRORES


import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaDetareas = new ArrayList<>();
        ArrayList<String> estadoTareas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    --- GESTOR DE TAREAS ---
                    1. Agregar tarea
                    2. Mostrar tareas
                    3. Marcar una tarea como completada
                    4. Eliminar tarea
                    """);

            System.out.println("Ingrese la opcion que desea realizar");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripcion del tarea: ");
                    String agregarTarea = scanner.next();
                    agregarTarea = agregarTarea.toLowerCase();
                    listaDetareas.add(agregarTarea);

                    //CAMBIO, EN VEZ DE SOLICITARLE AL USUARIO COLOCARLO PENDIENTE DESDE EL INICIO
//                    System.out.println("Cual es el estado de la tarea?  completado/pendiente");
//                    String estadoTarea = scanner.next();
//                    estadoTarea = estadoTarea.toUpperCase();
//                    estadoTareas.add(estadoTarea);
                    estadoTareas.add("PENDIENTE");
                    break;
                case 2:
                    System.out.println("Lista de tareas: ");
                    for (int i = 0,j = 0; i < listaDetareas.size() && j < estadoTareas.size(); i++, j++){
                        System.out.println((i + 1) + ". "+ estadoTareas.get(j) + " " + listaDetareas.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Que numero de tarea es la que quieres marcar como completada? ");
                    int actualizar = scanner.nextInt();
                   if (actualizar > estadoTareas.size()){
                       System.out.println("Numero de tarea no existe");
                   }else{
                       actualizar = actualizar - 1;
                       estadoTareas.set(actualizar,"COMPLETADO");
                       System.out.println("Tarea actualizada con exito");
                   }
                    break;
                case 4:
                    System.out.println("Que numero de tarea es la que quieres eliminar? ");
                    int eliminar = scanner.nextInt();
                    if (eliminar > listaDetareas.size()) {
                        System.out.println("El numero de tarea no existe");
                    }else {
                        eliminar = eliminar - 1;
                        listaDetareas.remove(eliminar);
                        estadoTareas.remove(eliminar);
                        System.out.println("el numero de tarea a sido eliminado con exito. ");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("Desea hacer algo mas ?    si/no   ");
            String nuevaPeticion = scanner.next();
            if (nuevaPeticion.equals("no")) {
                continuar = false;

            }
            System.out.println("Gracias por usar el gestor de tareas");

        }
    }

    }


