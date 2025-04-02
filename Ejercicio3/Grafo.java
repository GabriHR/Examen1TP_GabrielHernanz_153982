package Ejercicio3;

import java.util.*;

class Grafo {
    private final Map<Integer, List<Integer>> adjList;

    // Definición del grafo a través de una lista de adyacencia
    public Grafo() {
        this.adjList = new HashMap<>();
    }

    // Metodo para agregar una arista entre dos nodos al grafo
    public void agregarArista(int origen, int destino) {
        adjList.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
        adjList.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen); // Para grafo no dirigido
    }

    //Inicia la búsqueda de un ciclo con profundidad máxima
    public List<Integer> encontrarCiclo(int maxProfundidad) {
        Set<Integer> visitados = new HashSet<>();
        List<Integer> camino = new ArrayList<>();
        for (Integer nodo : adjList.keySet()) {
            if (dfs(nodo, -1, visitados, camino, maxProfundidad)) {
                return camino;
            }
        }
        return Collections.emptyList(); // No se encontró ciclo
    }

    /*
    Realiza una búsqueda en profundidad para encontrar un ciclo
    respetando la produndidad máxima.
    */
    private boolean dfs(int nodo, int padre, Set<Integer> visitados, List<Integer> camino, int maxProfundidad) {
        visitados.add(nodo);
        camino.add(nodo);

        if (camino.size() > maxProfundidad) {
            camino.remove(camino.size() - 1);
            visitados.remove(nodo);
            return false;
        }

        for (Integer vecino : adjList.getOrDefault(nodo, Collections.emptyList())) {
            if (!vecino.equals(padre)) {
                if (visitados.contains(vecino)) {
                    camino.add(vecino);
                    return true;
                }
                if (dfs(vecino, nodo, visitados, camino, maxProfundidad)) {
                    return true;
                }
            }
        }

        camino.remove(camino.size() - 1);
        visitados.remove(nodo);
        return false;
    }

    // Metodo que imprime el grafo
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(4, 1);
        grafo.agregarArista(3, 5);

        List<Integer> ciclo = grafo.encontrarCiclo(4);
        if (!ciclo.isEmpty()) {
            System.out.println("Ciclo encontrado: " + ciclo);
        } else {
            System.out.println("No se encontró ciclo.");
        }
    }
}