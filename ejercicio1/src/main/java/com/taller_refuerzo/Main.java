// Taller de Programación en Java: Uso de Map y List con Entrada de Usuario
// 🚀 Ejercicio 1: Gestión de Estudiantes con List
package com.taller_refuerzo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            List<String> estudiantes = new ArrayList<>();

            // 1. Pedir al usuario la cantidad de estudiantes que desea registrar.
            System.out.print("Ingrese la cantidad de estudiantes que desea registrar: ");
            int cantidad = scanner.nextInt();
                scanner.nextLine();

            // 2. Solicitar los nombres de los estudiantes y almacenarlos en una List<String> .
            for (int i = 0; i < cantidad; i++){
                System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
                
                estudiantes.add(scanner.nextLine());
            }

            // 3. Mostrar la lista completa de estudiantes.
            System.out.println("\nLista de estudiantes: " + estudiantes);

            // 4. Ordenar los nombres en orden alfabético y mostrarlos.
            Collections.sort(estudiantes);
            System.out.println("\nLista ordenada alfabéticamente: " + estudiantes);

            // 5. Permitir que el usuario busque si un estudiante está en la lista.
            System.out.print("Ingrese el nombre del estudiante a buscar: ");
            String buscar = scanner.nextLine();
            if (estudiantes.contains(buscar)) {
                System.out.println("El estudiante " + buscar + " esta en la lista.");
            } else {
                System.out.println("El estudiante " + buscar + " no esta es la lista");
            }
        }
    }
}
