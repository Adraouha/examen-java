# Examen Java - Curso Ironhack

**1. (4 ptos) LA RULETA DE LA SUERTE**

Has participado en un concurso de TV y puedes ir introduciendo **diferentes premios** que te gustaría ganar. Estos premios se van guardando en una **lista**.

Cuando decides dejar de introducir premios, se realiza una **selección aleatoria (random)** y se escoge únicamente uno de los premios de la lista.

Finalmente, se muestra un mensaje indicando **cuántos premios habías introducido y cuál ha sido el premio seleccionado**. Por ejemplo: “Has elegido 5 premios, y la ruleta ha seleccionado: otro mes de vacaciones”.

**2. (4 ptos) BATALLA DE SUPERHÉROES**

Tienes que crear un programa para gestionar una batalla entre dos superhéroes.

Debes crear **dos clases independientes, Superheroe** y **Villano**.

* Ambas clases tendrán algunas propiedades comunes: **Nombre, edad y NivelPoder**, pero cada clase tendrá además **al menos una propiedad particular**. Por ejemplo, el superhéroe puede tener **CiudadProtegida** y el villano **PlanMalvado**.
A partir de estas premisas:
• Debe instanciarse **un superhéroe y un villano**, pidiendo al usuario que introduzca todos sus datos.
• Se deben mostrar **todas las características** de ambos personajes.
• Se deben comparar los **NivelPoder** de ambos personajes.
• Se debe mostrar el nombre del ganador y la diferencia de puntos. Por ejemplo: **“Batman gana a Joker por 125 puntos”**.
• En caso de que ambos tengan el mismo nivel de poder, se mostrará un mensaje indicando que **han empatado**.

**+EXTRA (2 ptos):** realízalo con **herencia**
---




## Estructura del Proyecto

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

