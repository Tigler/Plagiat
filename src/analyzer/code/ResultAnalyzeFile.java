package analyzer.code;

import graf.Node;

import java.util.ArrayList;

/**
 * Created by tigler on 06.05.17.
 */
public class ResultAnalyzeFile {
    private String nameFile;
    private String path;
    private ArrayList<ArrayList<Operator>> listsOperators;
    ArrayList<ArrayList<Node>> graf;

    public ResultAnalyzeFile(String nameFile, String path, ArrayList<ArrayList<Operator>> listsOperators, ArrayList<ArrayList<Node>> graf) {
        this.nameFile = nameFile;
        this.path = path;
        this.listsOperators = (ArrayList<ArrayList<Operator>>) listsOperators.clone();
        this.graf = graf;
    }

    public String getNameFile() {
        return nameFile;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<ArrayList<Operator>> getListsOperators() {
        return listsOperators;
    }

    public ArrayList<ArrayList<Node>> getGraf() {
        return graf;
    }
}
