package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Java8.Java8Lexer;
import parsers.Java8.Java8Parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 28.04.17.
 * Анализатор проекта на языке Java
 */
public class AnalyzerJava extends Analyzer {

    public AnalyzerJava() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_JAVA);
        parser = new Java8Parser(null);
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
     * осуществляет статический анализ файла и результат добавляется в список resultsAnalyzeFiles
     */
    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        graf = new ArrayList<>();
        ListenerParser listener = createListeners();
        Java8Parser java8Parser = (Java8Parser) parser;
        java8Parser.attach(listener);
        parser.setTokenStream(loadProject(path));

        java8Parser.setPath(path);
        java8Parser.compilationUnit();
        String[] paths = path.split("/");
        resultsAnalyzeFiles.add(new ResultAnalyzeFile(paths[paths.length - 1], path, listsOperators, graf));
    }

    /**
     * выполняет динамический анализ первого проекта
     *
     * @return выполнен/невыполнен динамический анализ
     */
    @Override
    public boolean dynamicAnalyzeFirst() {
        return false;
    }

    /**
     * выполняет динамический анализ второго проекта
     * @return выполнен/невыполнен динамический анализ
     */
    @Override
    public boolean dynamicAnalyzeSecond() {
        return false;
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
        TokenStream tokenStream = new CommonTokenStream(new Java8Lexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }

}
