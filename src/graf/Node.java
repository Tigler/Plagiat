package graf;

import analyzer.code.Operator;

import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 */
public class Node {

    private int code;
    ArrayList<Operator> listOperators;
    ArrayList<Edge> edges;

    public Node(int code) {
        this.code = code;
        listOperators = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public int getCode() { return code; }

    /*public ArrayList<Operator> getListOperators() {
        return listOperators;
    }*/

    /*public void setOperator(Operator operator) {
        this.listOperators.add(operator);
    }*/

    public ArrayList<Edge> getEdges() {
        return edges;
    }

   /* public void setEdge(Edge edge) {
        this.edges.add(edge);
    }*/

    public void addNode(Node node) { edges.add(new Edge(this, node)); }
}
