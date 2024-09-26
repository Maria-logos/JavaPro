package app;

public class Main {

    public static void main(String[] args) {
        Graph hraph = new Graph();
        // Додаємо вершини
        hraph.addVertex(1);
        hraph.addVertex(2);
        hraph.addVertex(3);
        hraph.addVertex(4);

        // Додаємо ребра
        hraph.addEdge(1, 2);
        hraph.addEdge(2, 3);
        hraph.addEdge(3, 4);

        System.out.println("Граф після додавання вершин та ребер:");
        System.out.println(hraph);
        // Перевіряємо наявність вершин і ребер
        System.out.println("Вершина 3 існує: " + hraph.hasVertex(3)); // True
        System.out.println("Ребро між 3 і 4 існує: " + hraph.hasEdge(3, 4)); // True

        // Видаляємо ребро
        hraph.removeEdge(3, 4);
        System.out.println("Граф після видалення ребра між 3 і 4:");
        System.out.println(hraph);

        // Видаляємо вершину
        hraph.removeVertex(4);
        System.out.println("Граф після видалення вершини 3:");
        System.out.println(hraph);
    }
}
