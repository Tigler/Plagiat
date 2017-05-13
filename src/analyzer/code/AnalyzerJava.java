package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Java.JavaLexer;
import parsers.Java.JavaParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 28.04.17.
 */
public class AnalyzerJava extends Analyzer {
    ListenerParser listener;
    ListenerParser listener1;
    ListenerParser listener2;

    IMetric countOperator;
    IMetric levelNesting;
    IMetric middleLenIdent;

    public AnalyzerJava() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_JAVA);
        parser = new JavaParser(null);


    }

    private ListenerParser createChainListeners() {
        ListenerParser listener = null;
        listener = new EventSequenceOperators(null, listener);
        listener.setListOperators(this.listsOperators);
        return listener;
    }

    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        ListenerParser listener = createChainListeners();
        JavaParser javaParser = (JavaParser) parser;
        javaParser.attach(listener);
        parser.setTokenStream(loadProject(path));

        javaParser.setPath(path);
        javaParser.compilationUnit();
        String[] paths = path.split("/");
        resultsAnalyzeFiles.add(new ResultAnalyzeFile(paths[paths.length - 1], path, listsOperators));
    }

    @Override
    public boolean dynamicAnalyzeFirst() {
        return false;
    }

    @Override
    public boolean dynamicAnalyzeSecond() {
        return false;
    }


    private TokenStream loadProject(String path) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new ReaderUTF8(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TokenStream tokenStream = new CommonTokenStream(new JavaLexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }

}
