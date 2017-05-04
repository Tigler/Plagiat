package analyzer.code;

import events.EventDACO;
import events.EventIfLevelNest;
import events.EventMiddleLenIdent;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import metrics.DACO;
import metrics.IfLevelNest;
import metrics.MiddleLenIdent;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Java.JavaLexer;
import parsers.Java.JavaParser;

import java.io.*;
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
        //String path="/home/tigler/Desktop/input.txt";

        parser = new JavaParser(null);

        listMetrics = new ArrayList<>();
        countOperator = new DACO();
        listMetrics.add(countOperator);

        levelNesting = new IfLevelNest();
        listMetrics.add(levelNesting);

        middleLenIdent = new MiddleLenIdent();
        listMetrics.add(middleLenIdent);

        listener = new EventDACO(countOperator);
        listener1 = new EventIfLevelNest(levelNesting, listener);
        listener2 = new EventMiddleLenIdent(middleLenIdent, listener1);
        JavaParser javaParser = (JavaParser) parser;
        javaParser.attach(listener2);
    }

    @Override
    public void parsing(String path) {
        parser.setTokenStream(loadProject(path));
        JavaParser javaParser = (JavaParser) parser;
        javaParser.compilationUnit();
    }

    @Override
    public void dynamicAnalyze() {

    }

    @Override
    public Parser getParser() {
        return null;
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
