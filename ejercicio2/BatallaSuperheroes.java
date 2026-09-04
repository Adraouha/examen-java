package ejercicio2;

import java.util.Scanner;

/**
 * Clase principal que gestiona la interacción por consola para la batalla
 * entre un Superhéroe y un Villano.
 */
public class BatallaSuperheroes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("            GRAN BATALLA DE SUPERHÉROES           ");
        System.out.println("==================================================\n");

        // --- ENTRADA DE DATOS DEL SUPERHÉROE ---
        System.out.println("--- REGISTRO DEL SUPERHÉROE ---");
        System.out.print("Introduce el nombre del superhéroe: ");
        String nombreHeroe = scanner.nextLine().trim();

        int edadHeroe = pedirEntero(scanner, "Introduce la edad del superhéroe: ");
        int poderHeroe = pedirEntero(scanner, "Introduce el nivel de poder del superhéroe: ");

        System.out.print("Introduce la ciudad que protege: ");
        String ciudadHeroe = scanner.nextLine().trim();

        Superheroe superheroe = new Superheroe(nombreHeroe, edadHeroe, poderHeroe, ciudadHeroe);
        System.out.println();

        // --- ENTRADA DE DATOS DEL VILLANO ---
        System.out.println("--- REGISTRO DEL VILLANO ---");
        System.out.print("Introduce el nombre del villano: ");
        String nombreVillano = scanner.nextLine().trim();

        int edadVillano = pedirEntero(scanner, "Introduce la edad del villano: ");
        int poderVillano = pedirEntero(scanner, "Introduce el nivel de poder del villano: ");

        System.out.print("Introduce su plan malvado: ");
        String planVillano = scanner.nextLine().trim();

        Villano villano = new Villano(nombreVillano, edadVillano, poderVillano, planVillano);
        System.out.println();

        // --- MOSTRAR CARACTERÍSTICAS DE AMBOS PERSONAJES ---
        System.out.println("==================================================");
        System.out.println("           CARACTERÍSTICAS DE LOS LUCHADORES      ");
        System.out.println("==================================================");
        superheroe.mostrarDetalles();
        System.out.println();
        villano.mostrarDetalles();
        System.out.println();

        // --- COMPARACIÓN Y RESULTADO DE LA BATALLA ---
        System.out.println("==================================================");
        System.out.println("                RESULTADO DEL COMBATE             ");
        System.out.println("==================================================");

        int poderH = superheroe.getNivelPoder();
        int poderV = villano.getNivelPoder();

        if (poderH > poderV) {
            int diferencia = poderH - poderV;
            System.out.println(superheroe.getNombre() + " gana a " + villano.getNombre() + " por " + diferencia + " puntos.");
        } else if (poderV > poderH) {
            int diferencia = poderV - poderH;
            System.out.println(villano.getNombre() + " gana a " + superheroe.getNombre() + " por " + diferencia + " puntos.");
        } else {
            System.out.println("¡Han empatado! Ambos personajes poseen el mismo nivel de poder (" + poderH + " puntos).");
        }

        System.out.println("==================================================");

        scanner.close();
    }

    /**
     * Método auxiliar para leer números enteros de forma segura por consola,
     * evitando excepciones por entradas no numéricas o problemas con saltos de línea.
     */
    private static int pedirEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido.");
            }
        }
    }
}
