package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 1: La Ruleta de la Suerte
 *
 * Permite al usuario introducir diferentes premios en una lista dinámica y, al
 * finalizar, selecciona uno de forma aleatoria indicando el total de premios
 * introducidos y el premio ganador.
 */
public class RuletaDeLaSuerte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> premios = new ArrayList<>();
        Random random = new Random();

        System.out.println("==================================================");
        System.out.println("        BIENVENIDO A LA RULETA DE LA SUERTE       ");
        System.out.println("==================================================");
        System.out.println("Introduce los premios que quieres ganar.");
        System.out.println("Escribe 'FIN' cuando hayas terminado de introducirlos.\n");

        while (true) {
            System.out.print("Introduce un premio (o 'FIN' para girar la ruleta): ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("FIN")) {
                if (premios.isEmpty()) {
                    System.out.println("Debes introducir al menos un premio antes de girar la ruleta.\n");
                    continue;
                }
                break;
            }

            if (entrada.isEmpty()) {
                System.out.println("El nombre del premio no puede estar vacío. Inténtalo de nuevo.");
                continue;
            }

            premios.add(entrada);
            System.out.println("remio añadido: \"" + entrada + "\" (Total acumulados: " + premios.size() + ")\n");
        }

        // Selección aleatoria
        int indiceGanador = random.nextInt(premios.size());
        String premioSeleccionado = premios.get(indiceGanador);

        // Mensaje final requerido por el enunciado
        System.out.println("\n--------------------------------------------------");
        System.out.println("LA RULETA ESTÁ GIRANDO...!");
        System.out.println("--------------------------------------------------");
        System.out.println("Has elegido " + premios.size() + " premios, y la ruleta ha seleccionado: " + premioSeleccionado);
        System.out.println("--------------------------------------------------");
        System.out.println("Enhorabuena!");

        scanner.close();
    }
}
