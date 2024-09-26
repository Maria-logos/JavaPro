package app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {

    private final Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Додає вершину до графу
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // Додає ребро між двома вершинами
    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source) || !adjacencyList.containsKey(destination)) {
            System.out.println("Одна або обидві вершини не існують.");
            return;
        }
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Для ненаправленого графу
    }

    // Видаляє вершину з графу
    public void removeVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            System.out.println("Вершина не існує.");
            return;
        }

        // Видаляємо всі ребра, пов'язані з цією вершиною
        for (int adjacent : adjacencyList.get(vertex)) {
            adjacencyList.get(adjacent).remove(vertex);
        }
        adjacencyList.remove(vertex);
    }

    // Видаляє ребро між двома вершинами
    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.containsKey(destination)) {
            adjacencyList.get(source).remove(destination);
            adjacencyList.get(destination).remove(source); // Для ненаправленого графу
        } else {
            System.out.println("Одна або обидві вершини не існують.");
        }
    }

    // Перевіряє, чи існує вершина у графі
    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    // Перевіряє, чи існує ребро між двома вершинами у графі
    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
