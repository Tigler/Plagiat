package analyzer.code;

import java.util.ArrayList;

/**
 * Created by tigler on 06.05.17.
 */
public class ResultAnalyzeFile {
    private String nameFile;

    public String getPath() {
        return path;
    }

    public ArrayList<ArrayList<Operator>> getListsOperators() {
        return listsOperators;
    }

    private String path;
    private ArrayList<ArrayList<Operator>> listsOperators;

    public ResultAnalyzeFile(String nameFile, String path, ArrayList<ArrayList<Operator>> listsOperators) {
        this.nameFile = nameFile;
        this.path = path;
        this.listsOperators = (ArrayList<ArrayList<Operator>>) listsOperators.clone();
    }

    public String getNameFile() {
        return nameFile;
    }

    //public ArrayList<IMetric> getListMetrics() {
    //return listMetrics;
    //}

    // public ArrayList<ArrayList<Operator>> getOperators() {
    //  return listsOperators;
    // }
}
