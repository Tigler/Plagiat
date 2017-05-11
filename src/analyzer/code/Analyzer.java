package analyzer.code;

import dynamic.DynamicAnalyzer;
import org.antlr.v4.runtime.Parser;

import java.util.ArrayList;


/**
 * Created by tigler on 28.04.17.
 */
public abstract class Analyzer {
    protected ArrayList<IMetric> listMetrics;
    protected ArrayList<ArrayList<Operator>> listsOperators;
    protected ArrayList<String> listPathFiles;
    protected String nameProject;
    protected ArrayList<ResultAnalyzeFile> resultsAnalyzeFiles;
    protected Parser parser;
    protected DynamicAnalyzer dynAn;

    public abstract void parsing(String path);

    public abstract boolean dynamicAnalyzeFirst();

    public abstract boolean dynamicAnalyzeSecond();

    public void resetMetrics() {
        for (IMetric metr : listMetrics) {
            metr.reset();
        }
    }

    public abstract Parser getParser();

    public ArrayList<IMetric> getListMetrics() {
        return listMetrics;
    }

    public ArrayList<ArrayList<Operator>> getListsOperators() {
        return listsOperators;
    }

    public ArrayList<ResultAnalyzeFile> getListResultAnalyzeFiles() {
        return resultsAnalyzeFiles;
    }

    public void setListPathFiles(ArrayList<String> listPathFiles) {
        this.listPathFiles = listPathFiles;
    }

    public ArrayList<String> getListPathFiles() {
        return listPathFiles;
    }

    //public void setListOperators(ArrayList<Operator> listOperators) {
    //  this.listOperators = listOperators;
    //}

    public void setNameProject(String name) {
        this.nameProject = name;
    }

    public String getNameProject() {
        return nameProject;
    }

}
