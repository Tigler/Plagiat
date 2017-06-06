package graf;

import java.io.Serializable;

/**
 * Created by tigler on 13.05.17.
 */
public class Edge implements Serializable {
    private Node start; //Начальный узел
    private Node end; //Конечный узел

    public Edge(Node start, Node end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Получить стартовый узел
     *
     * @return стартовый узел
     */
    public Node getStart() {
        return start;
    }

    /**
     * Получить конечный узел
     *
     * @return конечный узел
     */
    public Node getEnd() {
        return end;
    }
}
