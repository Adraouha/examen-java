package ejercicio2;

/**
 * Subclase Superheroe que hereda de Personaje.
 * Incorpora la propiedad particular: ciudadProtegida.
 */
public class Superheroe extends Personaje {
    private String ciudadProtegida;

    public Superheroe(String nombre, int edad, int nivelPoder, String ciudadProtegida) {
        super(nombre, edad, nivelPoder);
        this.ciudadProtegida = ciudadProtegida;
    }

    public String getCiudadProtegida() {
        return ciudadProtegida;
    }

    public void setCiudadProtegida(String ciudadProtegida) {
        this.ciudadProtegida = ciudadProtegida;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🦸 FICHA DEL SUPERHÉROE:");
        super.mostrarDetalles();
        System.out.println("  • Ciudad Protegida: " + ciudadProtegida);
    }
}
