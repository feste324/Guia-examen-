/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejempllo.examen;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemplloExamen {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, Corredor> corredores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int contadorCorredores = 1;

        do {
            System.out.println("\n--- Sistema de Corredores ---");
            System.out.println("1. Agregar corredor");
            System.out.println("2. Buscar corredor por número");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del corredor: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del corredor: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    corredores.put(contadorCorredores, new Corredor(nombre, edad));
                    System.out.println("Corredor agregado con número: " + contadorCorredores);
                    contadorCorredores++;
                    break;

                case 2:
                    System.out.print("Ingrese el número del corredor: ");
                    int numeroCorredor = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    Corredor corredor = corredores.get(numeroCorredor);
                    if (corredor != null) {
                        System.out.println("Datos del corredor: " + corredor);
                    } else {
                        System.out.println("No se encontró ningún corredor con ese número.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}

    
        
        
        
        // TODO code application logic here
        
        
        
        
        
        
        
        
        
        
        
        
        
    
