package ejercicio2;

/**
 * Clase base Personaje que contiene las propiedades comunes:
 * Nombre, Edad y NivelPoder.
 * 
 * Implementa la base para la Herencia (+EXTRA 2 ptos).
 */
public class Personaje {
    protected String nombre;
    protected int edad;
    protected int nivelPoder;

    public Personaje(String nombre, int edad, int nivelPoder) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelPoder = nivelPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    /**
     * Muestra las características comunes del personaje.
     */
    public void mostrarDetalles() {
        System.out.println("  • Nombre: " + nombre);
        System.out.println("  • Edad: " + edad + " años");
        System.out.println("  • Nivel de Poder: " + nivelPoder);
    }
}
