package analyzer.code;

import analyzer.ProjectProgramm;
import dynamic.DynamicAnalyzer;
import graf.Node;
import org.antlr.v4.runtime.Parser;

import java.util.ArrayList;


/**
 * Created by tigler on 28.04.17.
 * абстрактный класс анализатора проекта с программой
 */
public abstract class Analyzer {

    protected ArrayList<ArrayList<Operator>> listsOperators;
    protected ArrayList<ArrayList<Node>> graf;
    protected ArrayList<ResultAnalyzeFile> resultsAnalyzeFiles;
    protected Parser parser;
    protected DynamicAnalyzer dynAn;
    protected ProjectProgramm projectProgramm;

    public abstract void parsing(String path);

    public abstract boolean dynamicAnalyzeFirst();

    public abstract boolean dynamicAnalyzeSecond();

    public ArrayList<ArrayList<Operator>> getListsOperators() {
        return listsOperators;
    }

    public ArrayList<ResultAnalyzeFile> getListResultAnalyzeFiles() {
        return resultsAnalyzeFiles;
    }

    public ProjectProgramm getProjectProgramm() {
        return projectProgramm;
    }

    public void setProjectProgramm(ProjectProgramm projectProgramm) {
        this.projectProgramm = projectProgramm;
    }
}
