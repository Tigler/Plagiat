package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Cpp.CPP14Lexer;
import parsers.Cpp.CPP14Parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 * Анализатор проекта на языке С++
 */
public class AnalyzerCpp extends Analyzer {
    public AnalyzerCpp() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_CPP);
        parser = new CPP14Parser(null);
    }

    /**
     * осуществляет статический анализ файла и результат добавляется в список resultsAnalyzeFiles
     */
    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        graf = new ArrayList<>();
        ListenerParser listener = createChainListeners();
        CPP14Parser cpp14Parser = (CPP14Parser) parser;
        cpp14Parser.attach(listener);
        parser.setTokenStream(loadProject(path));

        cpp14Parser.setPath(path);
        cpp14Parser.translationunit();
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


    private ListenerParser createChainListeners() {
        ListenerParser listener = null;
        listener = new EventSequenceOperators(listener);
        listener.setListOperators(this.listsOperators);
        listener.setGraf(graf);
        return listener;
    }

    private TokenStream loadProject(String path) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new ReaderUTF8(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TokenStream tokenStream = new CommonTokenStream(new CPP14Lexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }
}
