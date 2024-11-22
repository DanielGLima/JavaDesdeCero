package CalculadoraBasica;

//REQUERIMIENTO DEL PROYECTO
//1. Pedir al usuario dos números y una operación a realizar (suma, resta, multiplicación, división).
//2. Mostrar el resultado de la operación seleccionada.
//3. utilizar if y else
//4. Si el usuario elige división, verificar que el divisor no sea cero.
//5. Al finalizar, preguntar al usuario si desea realizar otra operación o salir del programa.


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
        System.out.println("""
                Hola, selecciona la opcion que desear realizar
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                """);
        int opcion = scanner.nextInt();

        System.out.println("Ingresa el primer numero: ");
        Double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        Double num2 = scanner.nextDouble();


        if (opcion == 1) {
            System.out.println("La suma de los numeros es: " + (num1 + num2));
        } else if (opcion == 2) {
            System.out.println("La resta de los numeros es: " + (num1 - num2));
        } else if (opcion == 3) {
            System.out.println("la multiplicacion de los numeros es: " + (num1 * num2));
        } else if (opcion == 4) {
            if (num2==0){
                System.out.println("Error al dividir dentro de cero");
            }else {
                System.out.println("La division de los numeros es: " + (num1 / num2));
            }
        }

        System.out.println("Deseas realizar otro calculo si/no");
        String nuevoCalculo = scanner.next();

        if (nuevoCalculo.equalsIgnoreCase("no")) {
            continuar = false;
            System.out.println("Gracias por usar la calculadora ");

        }
    }
    }
}
