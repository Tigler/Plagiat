package analyzer.code;

import java.util.ArrayList;

/**
 * Created by tigler on 06.05.17.
 */
public class ResultAnalyzeFile {
    private String nameFile;
    private ArrayList<IMetric> listMetrics;
    private ArrayList<Operator> listOperators;

    public ResultAnalyzeFile(String nameFile, ArrayList<IMetric> listMetrics, ArrayList<Operator> listOperators) {
        this.nameFile = nameFile;
        this.listMetrics = (ArrayList<IMetric>) listMetrics.clone();
        this.listOperators = (ArrayList<Operator>) listOperators.clone();
    }

    public String getNameFile() {
        return nameFile;
    }

    public ArrayList<IMetric> getListMetrics() {
        return listMetrics;
    }

    public ArrayList<Operator> getOperators() {
        return listOperators;
    }
}
