package graf;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 */
public class Node implements Serializable {

    private int code; //Код узла
    private ArrayList<Edge> edges; //Список ребер
    private boolean visit; //Флаг посещения

    public Node(int code) {
        this.code = code;
        edges = new ArrayList<>();
    }

    /**
     * Получить флаг посещения
     *
     * @return флаг посещения
     */
    public boolean isVisit() {
        return visit;
    }

    /**
     * Задать флаг посещения
     * @param visit флаг посещения
     */
    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    /**
     * Получить код узла
     * @return код узла
     */
    public int getCode() { return code;
    }

    /**
     * Получить список ребер
     * @return список ребер
     */
    public ArrayList<Edge> getEdges() {
        return edges;
    }

    /**
     * Добавить смежный узел
     * @param node смежный узел
     */
    public void addNode(Node node) { edges.add(new Edge(this, node)); }
}
