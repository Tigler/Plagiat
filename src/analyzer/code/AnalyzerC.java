package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventParser;
import events.EventSequenceOperators;
import events.ListenerParser;
import graf.Edge;
import graf.Node;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.C.CLexer;
import parsers.C.CParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 28.04.17.
 * Анализатор проекта на языке С
 */
public class AnalyzerC extends Analyzer {

    public AnalyzerC() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_C);
        parser = new CParser(null);
    }

    /**
     * осуществляет статический анализ файла и результат добавляется в список resultsAnalyzeFiles
     */
    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        graf = new ArrayList<>();
        ListenerParser listener = createListeners();
        CParser cParser = (CParser) parser;
        cParser.attach(listener);
        parser.setTokenStream(loadProject(path));

        cParser.setPath(path);
        cParser.compilationUnit();
        String[] paths = path.split("/");
        resultsAnalyzeFiles.add(new ResultAnalyzeFile(paths[paths.length - 1], path, listsOperators, graf));
        printGraf();
    }

    /**
     * отладочный метод - печать графа
     */
    private void printGraf() {
        for (ArrayList<Node> list : graf) {
            for (Node n : list) {
                String res = null;
                switch (n.getCode()) {
                    case EventParser.IF_START:
                        res = "if_start ";
                        break;
                    case EventParser.IF_END:
                        res = "if_end ";
                        break;
                    case EventParser.ELSE_START:
                        res = "else_start ";
                        break;
                    case EventParser.ELSE_END:
                        res = "else_end ";
                        break;
                    case EventParser.WHILE_START:
                        res = "while_start ";
                        break;
                    case EventParser.WHILE_END:
                        res = "while_end ";
                        break;
                    case EventParser.SWITCH_END:
                        res = "switch_end ";
                        break;
                    case EventParser.SWITCH_START:
                        res = "switch_Start ";
                        break;
                    case EventParser.CASE_START:
                        res = "case_start ";
                        break;
                    case EventParser.DEFAULT_START:
                        res = "default_start ";
                        break;
                    case EventParser.CASE_END:
                        res = "case_end ";
                        break;
                    case EventParser.DEFAULT_END:
                        res = "default_end ";
                        break;
                    case EventParser.FUNC_START:
                        res = "func_start ";
                        break;
                    case EventParser.FUNC_END:
                        res = "func_end ";
                        break;
                    case EventParser.FOR_START:
                        res = "for_start ";
                        break;
                    case EventParser.FOR_END:
                        res = "for_end ";
                        break;
                }
                System.out.print(res);
                //System.out.println(n.getCode());
                for (Edge e : n.getEdges()) {
                    String res1 = null;
                    switch (e.getEnd().getCode()) {
                        case EventParser.FUNC_START:
                            res1 = "func_start ";
                            break;
                        case EventParser.FUNC_END:
                            res1 = "func_end ";
                            break;
                        case EventParser.IF_START:
                            res1 = "if_start ";
                            break;
                        case EventParser.IF_END:
                            res1 = "if_end ";
                            break;
                        case EventParser.ELSE_START:
                            res1 = "else_start ";
                            break;
                        case EventParser.ELSE_END:
                            res1 = "else_end ";
                            break;
                        case EventParser.WHILE_START:
                            res1 = "while_start ";
                            break;
                        case EventParser.WHILE_END:
                            res1 = "while_end ";
                            break;
                        case EventParser.SWITCH_END:
                            res1 = "switch_end ";
                            break;
                        case EventParser.SWITCH_START:
                            res1 = "switch_Start ";
                            break;
                        case EventParser.CASE_START:
                            res1 = "case_start ";
                            break;
                        case EventParser.DEFAULT_START:
                            res1 = "default_start ";
                            break;
                        case EventParser.CASE_END:
                            res1 = "case_end ";
                            break;
                        case EventParser.DEFAULT_END:
                            res1 = "default_end ";
                            break;
                        case EventParser.FOR_START:
                            res1 = "for_start ";
                            break;
                        case EventParser.FOR_END:
                            res1 = "for_end ";
                            break;
                    }
                    System.out.print(res1);
                }
                System.out.println();
            }
        }
    }



    /**
     * выполняет динамический анализ первого проекта
     *
     * @return выполнен/невыполнен динамический анализ
     */
    @Override
    public boolean dynamicAnalyzeFirst() {
        return dynAn.analyze(projectProgramm.getPathsSrc(), 1);
    }

    /**
     * выполняет динамический анализ второго проекта
     * @return выполнен/невыполнен динамический анализ
     */
    @Override
    public boolean dynamicAnalyzeSecond() {
        return dynAn.analyze(projectProgramm.getPathsSrc(), 2);
    }


    /**
     * создает слушателя
     *
     * @return слушателя
     */
    private ListenerParser createListeners() {
        ListenerParser listener = null;
        listener = new EventSequenceOperators(listener);
        listener.setListOperators(this.listsOperators);
        listener.setGraf(graf);
        return listener;
    }

    /**
     * Преобразует исходник в специальный вид -tokenStream
     *
     * @param path- путь до файла
     * @return
     */
    @Override
    public TokenStream loadProject(String path) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new ReaderUTF8(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TokenStream tokenStream = new CommonTokenStream(new CLexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }


}
