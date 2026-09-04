package ejercicio2;

/**
 * Subclase Villano que hereda de Personaje.
 * Incorpora la propiedad particular: planMalvado.
 */
public class Villano extends Personaje {
    private String planMalvado;

    public Villano(String nombre, int edad, int nivelPoder, String planMalvado) {
        super(nombre, edad, nivelPoder);
        this.planMalvado = planMalvado;
    }

    public String getPlanMalvado() {
        return planMalvado;
    }

    public void setPlanMalvado(String planMalvado) {
        this.planMalvado = planMalvado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🦹 FICHA DEL VILLANO:");
        super.mostrarDetalles();
        System.out.println("  • Plan Malvado: " + planMalvado);
    }
}
