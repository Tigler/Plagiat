package analyzer.code;

import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Java.JavaLexer;
import parsers.Java.JavaParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;

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


    }

    @Override
    public void parsing(String path) {
        parser.setTokenStream(loadProject(path));
        JavaParser javaParser = (JavaParser) parser;
        javaParser.compilationUnit();
    }

    @Override
    public boolean dynamicAnalyzeFirst() {
        return false;
    }

    @Override
    public boolean dynamicAnalyzeSecond() {
        return false;
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
