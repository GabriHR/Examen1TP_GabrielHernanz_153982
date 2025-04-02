# Examen1TP_GabrielHernanz_153982

## Ejercicio 1
Justificación del código de hash:

- Conversión del código del país: 
Convertimos el primer carácter del codPais a un valor numérico restando el valor ASCII de 'A'.
Esto nos da un valor entre 0 y 4 para los códigos de país A, B, C, D y E. 

- Combinación de valores: Multiplicamos el valor numérico del codPais por 1000 y le sumamos el codEmpleado.
Esto asegura que los códigos de país diferentes se distribuyan en diferentes rangos de valores.
- Cálculo del índice: Usamos el operador módulo (%) con el tamaño de la tabla (tblLength) 
para asegurarnos de que el índice esté dentro de los límites de la tabla hash.
Esta función de hash debería distribuir los empleados de manera uniforme en la tabla hash, minimizando las colisiones.

---

## Ejercicio 2

En la representación de un laberinto usando un grafo existen varios elementos:

- **Nodos:** Los nodos representan las celdas o posiciones del laberinto.
Cada nodo corresponde a una ubicación específica dentro del laberinto, como una intersección, un pasillo o una esquina.
En otras palabras, cada punto donde se puede estar en el laberinto es un nodo.

- **Aristas:** Las aristas representan los caminos o conexiones entre las celdas adyacentes del laberinto.
Una arista entre dos nodos indica que es posible moverse directamente de una celda a otra sin obstáculos.
Es decir, las aristas son los pasajes que permiten el movimiento entre las diferentes posiciones/nodos del laberinto.

En resumen, los nodos son las posiciones dentro del laberinto y las aristas son los caminos que conectan
estas posiciones, permitiendo el movimiento entre ellas.

---

## Ejercicio 3
- No se requiere ni de justificación ni de explicación del código en este ejercicio.
- El código ya está comentado y no se requiere más información.
---

## Ejercicio 4

- No se requiere ni de justificación ni de explicación del código en este ejercicio.
- El código ya está comentado y no se requiere más información.

---

## Ejercicio 5

Para implementar un algoritmo ávido (greedy) para optimizar el cariño que tengo a las personas que llevo en el coche,
seguiría los siguientes pasos:

### 1. Definir el problema:
    - Tenemos un coche con P plazas disponibles.
    - Cada persona tiene un nivel de cariño asociado.
    - Queremos maximizar el nivel de cariño total de las personas que llevamos en el coche.
### 2. Ordenar las personas:
    - Crear una lista de las personas junto con sus niveles de cariño.
    - Ordenar esta lista en orden descendente según el nivel de cariño.
    - Esto asegura que consideramos primero a las personas con mayor nivel de cariño.
### 3. Seleccionar las personas:
    - Inicializar una lista vacía para las personas seleccionadas.
    - Recorrer la lista ordenada y agregar personas a la lista de seleccionados hasta que se llenen las P plazas del coche.
    - En cada iteración, verificar si aún hay plazas disponibles en el coche.
    - Si hay, agregar la persona actual a la lista de seleccionados.
### 4. Finalizar:

    - Una vez que se han llenado las P plazas, detener el proceso.

La lista de seleccionados ahora contiene las personas que maximizarán el nivel de cariño total en el coche.
Fases del algoritmo:

1. **Inicialización:**
   - Crear una lista de personas con sus niveles de cariño.
   - Definir el número de plazas P en el coche.

2. **Ordenación:**
   - Ordenar la lista de personas en orden descendente según el nivel de cariño.
  
3. **Selección:**

   - Recorrer la lista ordenada y agregar personas a la lista de seleccionados hasta llenar las P plazas.

4. **Resultado:**

   - La lista de seleccionados contiene las personas que maximizarán el nivel de cariño total en el coche.
   - Este enfoque garantiza que siempre estamos eligiendo la opción
   que parece mejor en cada paso (persona con mayor nivel de cariño disponible),
   lo cual es la esencia de un algoritmo ávido.

---

## Ejercicio 6

- No se requiere ni de justificación ni de explicación del código en este ejercicio.
- El código ya está comentado y no se requiere más información.

---

## Ejercicio 7

- No se requiere ni de justificación ni de explicación del código en este ejercicio.
- El código ya está comentado y no se requiere más información.

---

## Ejercicio 8

En el programa proporcionado, los objetos se almacenan en diferentes tipos de memoria.
Aquí está la descripción de dónde se almacenan, cuándo se insertan y cuándo se liberan:

### 1. Memoria Stack (Pila):
- Variables locales: Las variables locales y los parámetros de los métodos se almacenan en la pila.
- p en main: La referencia a Persona p se almacena en la pila cuando se ejecuta el método main.
- Parámetro p en imprimePersona: La referencia al objeto Persona pasada como parámetro
al método imprimePersona se almacena en la pila cuando se llama a este método.

### 2. Memoria Heap (Montón):
- Objetos: Los objetos creados con new se almacenan en el montón.
- new Persona(): El objeto Persona creado en main se almacena en el montón cuando se ejecuta Persona p = new Persona();.

### 3. Memoria Metaspace:
- Clases y métodos:
Las definiciones de clases y métodos se almacenan en el Metaspace.
- Clase Persona y métodos main e imprimePersona:
La clase Persona y los métodos main e imprimePersona se cargan en el Metaspace cuando se carga la clase que los contiene.

### Ciclo de vida de los objetos:
- Inserción:
    - Persona p = new Persona();: El objeto Persona se crea y se almacena en el montón cuando se ejecuta esta línea en el método main.
    - Llamada a imprimePersona(p): La referencia p se pasa al método imprimePersona, almacenándose en la pila.
- Liberación:

    - Variables locales:
    Las referencias en la pila se liberan cuando los métodos main e imprimePersona terminan su ejecución.
    - Objetos en el montón:
    El objeto Persona en el montón se libera cuando ya no hay referencias a él,
    y el recolector de basura de Java lo recoge.

En resumen, las referencias a los objetos se almacenan en la pila,
mientras que los objetos en sí se almacenan en el montón.
Las definiciones de clases y métodos se almacenan en el Metaspace. Las referencias se liberan al finalizar los métodos,
y los objetos en el montón se liberan cuando el recolector de basura los recoge.

---

## Ejercicio 9

### Garbage Collector (GC)

- Ventajas:
    - Automatización: El GC automatiza la gestión de memoria, liberando al desarrollador de la necesidad de gestionar manualmente la memoria.
    - Reducción de errores: Minimiza errores comunes como fugas de memoria y referencias colgantes.
    - Optimización: Los algoritmos de GC pueden optimizar la recolección de basura, mejorando el rendimiento general del programa.

- Inconvenientes:
  - Pausas: El GC puede causar pausas en la ejecución del programa, lo que puede afectar
  el rendimiento en aplicaciones en tiempo real.
  - Consumo de recursos: El proceso de recolección de basura consume recursos del sistema,
  lo que puede afectar el rendimiento.
  - Imprevisibilidad: La liberación de memoria no es determinista,
  lo que puede dificultar la predicción del comportamiento del programa.

### Automatic Reference Counting (ARC)
- Ventajas:
    - Determinismo: La memoria se libera tan pronto como el contador de referencias de un objeto llega a cero,
    lo que permite una gestión de memoria más predecible.
    - Bajo consumo de recursos: ARC no requiere un proceso de recolección de basura separado,
    lo que puede reducir el consumo de recursos.
    - Sin pausas: No hay pausas en la ejecución del programa debido a la recolección de basura.

- Inconvenientes:
  - Ciclos de referencia: ARC puede tener problemas con ciclos de referencia,
  donde dos o más objetos se refieren entre sí, impidiendo que se libere la memoria.
  - Sobrecarga de contadores: La gestión de contadores de referencia puede añadir
  una sobrecarga en términos de rendimiento, especialmente en sistemas con muchos objetos.
  - Complejidad: Requiere que los desarrolladores sean conscientes de los ciclos de referencia y
  utilicen técnicas adicionales (como referencias débiles) para evitarlos.

### Comparación
- Automatización vs. Control: El GC ofrece una mayor automatización,
  mientras que ARC proporciona un control más fino sobre la liberación de memoria.
- Rendimiento: ARC puede ofrecer un rendimiento más predecible y sin pausas,
  pero puede ser menos eficiente en la gestión de ciclos de referencia.
- Facilidad de uso: El GC es generalmente más fácil de usar para los desarrolladores,
  ya que no requiere una gestión manual de referencias, mientras que ARC
  puede requerir una mayor atención a los detalles de referencia.

---

## Ejercicio 10

### @SuppressWarnings("deprecation")
- Parte del ciclo de vida: Compilación
- Significado: Indica al compilador que ignore las advertencias específicas de deprecación en el código anotado.
- Se utiliza para suprimir advertencias que de otro modo se generarían debido al uso de métodos o
clases marcados como obsoletos.

### @Deprecated
- Parte del ciclo de vida: Compilación y ejecución
- Significado: Marca un elemento (clase, método, campo, etc.) como obsoleto,
indicando que no se debe usar porque puede ser eliminado en futuras versiones.
- Los desarrolladores son advertidos de que deben evitar su uso y buscar alternativas.

### @Override
- Parte del ciclo de vida: Compilación
- Significado: Indica que un método está sobrescribiendo un método de una superclase.
- Ayuda a evitar errores al asegurar que el método realmente sobrescribe uno existente en la superclase.
### @Test
- Parte del ciclo de vida: Ejecución (pruebas)
- Significado: Marca un método como un caso de prueba que debe ser ejecutado por un framework de pruebas, como JUnit.
- Indica que el método es una prueba unitaria que verifica la funcionalidad del código.

Estas anotaciones ayudan a mejorar la legibilidad, el mantenimiento y la calidad del código,
proporcionando información adicional al compilador y a los desarrolladores.