package graf;

import analyzer.code.Operator;

import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 */
public class Node {
    ArrayList<Operator> listOperators;
    ArrayList<Edge> edges;

    public Node() {
        listOperators = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public ArrayList<Operator> getListOperators() {
        return listOperators;
    }

    public void setOperator(Operator operator) {
        this.listOperators.add(operator);
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdge(Edge edge) {
        this.edges.add(edge);
    }
}
