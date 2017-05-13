package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import parsers.Python3.Python3Lexer;
import parsers.Python3.Python3Parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by tigler on 13.05.17.
 */
public class AnalyzerPython3 extends Analyzer {
    public AnalyzerPython3() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_PYTHON3);
        parser = new Python3Parser(null);
    }

    @Override
    public void parsing(String path) {
        listsOperators = new ArrayList<>();
        ListenerParser listener = createChainListeners();
        Python3Parser python3Parser = (Python3Parser) parser;
        python3Parser.attach(listener);
        parser.setTokenStream(loadProject(path));

        python3Parser.setPath(path);
        python3Parser.single_input();
        String[] paths = path.split("/");
        resultsAnalyzeFiles.add(new ResultAnalyzeFile(paths[paths.length - 1], path, listsOperators));
    }

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
        listener = new EventSequenceOperators(null, listener);
        listener.setListOperators(this.listsOperators);
        return listener;
    }

    private TokenStream loadProject(String path) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new ReaderUTF8(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TokenStream tokenStream = new CommonTokenStream(new Python3Lexer(new UnbufferedCharStream(reader)));
        return tokenStream;
    }
}
