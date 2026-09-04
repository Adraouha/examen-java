# Examen Java - Curso Ironhack

Solución completa para los dos ejercicios del examen de Java (Nivel Principiante).

---

## 📁 Estructura del Proyecto

```text
examen-java/
├── MenuPrincipal.java              # Menú interactivo para ejecutar cualquiera de los dos ejercicios
├── README.md                       # Documentación y guía de ejecución
├── ejercicio1/
│   └── RuletaDeLaSuerte.java       # Ejercicio 1: Concurso TV - Ruleta de la suerte
└── ejercicio2/
    ├── Personaje.java              # Clase Base con propiedades comunes (Herencia)
    ├── Superheroe.java             # Subclase con propiedad 'ciudadProtegida'
    ├── Villano.java                # Subclase con propiedad 'planMalvado'
    └── BatallaSuperheroes.java     # Clase ejecutable con lógica de combate
```

---

## 🚀 Compilación y Ejecución

Desde la carpeta raíz del proyecto (`/home/adraou/Curso-IronHack/examen-java`):

### 1. Compilar todo el proyecto:
```bash
javac ejercicio1/*.java ejercicio2/*.java MenuPrincipal.java
```

### 2. Ejecución:

#### Opción A: Menú general
```bash
java MenuPrincipal
```

#### Opción B: Ejecutar Ejercicio 1 directamente
```bash
java ejercicio1.RuletaDeLaSuerte
```

#### Opción C: Ejecutar Ejercicio 2 directamente
```bash
java ejercicio2.BatallaSuperheroes
```

---

## 📝 Descripción de los Ejercicios

### Ejercicio 1: La Ruleta de la Suerte
- Permite introducir premios continuamente mediante `Scanner`.
- Los premios se almacenan en un `ArrayList<String>`.
- El usuario escribe `FIN` para terminar de introducir premios.
- Realiza una selección aleatoria (`java.util.Random`) entre los premios introducidos.
- Muestra el mensaje con el conteo de premios y el premio elegido:
  > *"Has elegido 5 premios, y la ruleta ha seleccionado: otro mes de vacaciones"*

### Ejercicio 2: Batalla de Superhéroes (+EXTRA Herencia 2 ptos)
- **Herencia aplicada**:
  - **`Personaje`** (Clase Base): atributos comunes `nombre`, `edad`, `nivelPoder`.
  - **`Superheroe`** (Subclase): hereda de `Personaje` y añade `ciudadProtegida`.
  - **`Villano`** (Subclase): hereda de `Personaje` y añade `planMalvado`.
- Solicita todos los datos de ambos personajes al usuario por consola.
- Muestra las fichas completas de ambos personajes usando métodos sobrescritos (`@Override mostrarDetalles()`).
- Compara los `nivelPoder` y determina el ganador con la diferencia de puntos o declara empate si tienen el mismo poder.
  > Ejemplo de victoria: *"Batman gana a Joker por 125 puntos."*
  > Ejemplo de empate: *"¡Han empatado! Ambos personajes poseen el mismo nivel de poder (800 puntos)."*
