package graf;

/**
 * Created by tigler on 13.05.17.
 */
public class Edge {
    Node start;
    Node end;

    public Edge() {
    }

    public Edge(Node start, Node end) {
        this.start = start;
        this.end = end;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
}
