package analyzer.code;

import dynamic.DynamicAnalyzer;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.util.ArrayList;


/**
 * Created by tigler on 28.04.17.
 */
public abstract class Analyzer {
    protected ArrayList<IMetric> listMetrics;
    protected ArrayList<String> listPathFiles;
    protected Parser parser;
    protected DynamicAnalyzer dynAn;

    public abstract void parsing(String path);

    public abstract void dynamicAnalyze();

    public abstract Parser getParser();

    public ArrayList<IMetric> getListMetrics() {
        return listMetrics;
    }

    public void setListPathFiles(ArrayList<String> listPathFiles) {
        this.listPathFiles = listPathFiles;
    }

}
