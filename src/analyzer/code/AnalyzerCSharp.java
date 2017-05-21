package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.CSharp.CSharpLexer;
import parsers.CSharp.CSharpParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 * Анализатор проекта на языке С#
 */
public class AnalyzerCSharp extends Analyzer {
    public AnalyzerCSharp() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_CSHARP);
        parser = new CSharpParser(null);
    }

    /**
     * осуществляет статический анализ файла и результат добавляется в список resultsAnalyzeFiles
     */
    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        graf = new ArrayList<>();
        ListenerParser listener = createChainListeners();
        CSharpParser cSharpParser = (CSharpParser) parser;
        cSharpParser.attach(listener);
        parser.setTokenStream(loadProject(path));

        cSharpParser.setPath(path);
        cSharpParser.compilation_unit();
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
        TokenStream tokenStream = new CommonTokenStream(new CSharpLexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }
}
