package graf;

import analyzer.code.Operator;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 */
public class Node implements Serializable {

    private int code;
    ArrayList<Operator> listOperators;
    ArrayList<Edge> edges;
    private boolean visit;

    public Node(int code) {
        this.code = code;
        listOperators = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public Node(int code, ArrayList<Edge> edges) {
        this.code = code;
        listOperators = new ArrayList<>();
        this.edges = edges;
    }

    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
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

    public Node clone() {
        return new Node(this.code, this.edges);

    }
}
