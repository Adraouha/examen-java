
import ejercicio1.RuletaDeLaSuerte;
import ejercicio2.BatallaSuperheroes;
import java.util.Scanner;

/**
 * Menú interactivo opcional para ejecutar fácilmente cualquiera de los dos
 * ejercicios.
 */
public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("==================================================");
            System.out.println("            EXAMEN JAVA - CURSO IRONHACK  (H. Adraou)        ");
            System.out.println("==================================================");
            System.out.println("1. Ejercicio 1: La Ruleta de la Suerte");
            System.out.println("2. Ejercicio 2: Batalla de Superhéroes (+EXTRA Herencia)");
            System.out.println("0. Salir");
            System.out.println("==================================================");
            System.out.print("Selecciona una opción (0-2): ");

            String input = scanner.nextLine().trim();
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Introduce 0, 1 o 2.\n");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Ejecutando Ejercicio 1 ---\n");
                    RuletaDeLaSuerte.main(new String[]{});
                    System.out.println("\nPresiona Enter para volver al menú...");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("\n--- Ejecutando Ejercicio 2 ---\n");
                    BatallaSuperheroes.main(new String[]{});
                    System.out.println("\nPresiona Enter para volver al menú...");
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción fuera de rango. Introduce 0, 1 o 2.\n");
            }
        }

        scanner.close();
    }
}
