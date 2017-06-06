package analyzer.code;

import analyzer.ProjectProgramm;
import dynamic.DynamicAnalyzer;
import graf.Node;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;


/**
 * Created by tigler on 28.04.17.
 * абстрактный класс анализатора проекта
 */
public abstract class Analyzer {

    protected ArrayList<ArrayList<Operator>> listsOperators; //списки операторов одного исходника
    protected ArrayList<ArrayList<Node>> graf; //графы методов одного исходника
    protected ArrayList<ResultAnalyzeFile> resultsAnalyzeFiles; //список результатов анализа
    protected Parser parser; //парсер из библиотеки ANTLR
    protected DynamicAnalyzer dynAn; //динамический анализатор
    protected ProjectProgramm projectProgramm; //информация о проекте

    /**
     * провести статический анализ исходника
     *
     * @param path - путь до исходника
     */
    public abstract void parsing(String path);

    /**
     * проводит динамический анализ для первого проекта
     * @return выполнен/невыполнен динамический анализ
     */
    public abstract boolean dynamicAnalyzeFirst();

    /**
     * проводит динамический анализ для второго проекта
     * @return выполнен/невыполнен динамический анализ
     */
    public abstract boolean dynamicAnalyzeSecond();

    /**
     * получить список с результатами анализа
     * @return список с результатами анализа
     */
    public ArrayList<ResultAnalyzeFile> getListResultAnalyzeFiles() {
        return resultsAnalyzeFiles;
    }

    /**
     * получить информацию о проекте
     * @return информацию о проекте
     */
    public ProjectProgramm getProjectProgramm() {
        return projectProgramm;
    }

    /**
     * задать информацию о проекте
     * @param projectProgramm - информация о проекте
     */
    public void setProjectProgramm(ProjectProgramm projectProgramm) {
        this.projectProgramm = projectProgramm;
    }

    /**
     * Преобразует исходник в специальный вид -tokenStream
     *
     * @param path- путь до файла
     * @return
     */
    public abstract TokenStream loadProject(String path);
}
