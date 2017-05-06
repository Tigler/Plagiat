package analyzer.code;

import java.util.ArrayList;

/**
 * Created by tigler on 06.05.17.
 */
public class ResultAnalyzeFile {
    private String nameFile;
    private ArrayList<IMetric> listMetrics;

    public ResultAnalyzeFile(String nameFile, ArrayList<IMetric> listMetrics) {
        this.nameFile = nameFile;
        this.listMetrics = (ArrayList<IMetric>) listMetrics.clone();
    }
}
