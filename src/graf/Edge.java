package graf;

import java.io.Serializable;

/**
 * Created by tigler on 13.05.17.
 */
public class Edge implements Serializable {
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

    public Node getEnd() {
        return end;
    }
}
