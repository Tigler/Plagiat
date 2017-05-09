package analyzer.code;

import dynamic.DynamicAnalyzer;
import events.EventSequenceOperators;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import metrics.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
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
 */
public class AnalyzerC extends Analyzer {


    public AnalyzerC() {
        resultsAnalyzeFiles = new ArrayList<>();
        dynAn = new DynamicAnalyzer();
        dynAn.initUtilite(LanguagePrograming.LANG_C);
        parser = new CParser(null);
        initMetrics();
        ListenerParser listener = createChainListeners();

        CParser cParser = (CParser) parser;
        cParser.attach(listener);
    }

    @Override
    public void parsing(String path) {

        parser.setTokenStream(loadProject(path));
        CParser cParser = (CParser) parser;
        cParser.setPath(path);
        cParser.compilationUnit();
        String[] paths = path.split("/");
        resultsAnalyzeFiles.add(new ResultAnalyzeFile(paths[paths.length - 1], listMetrics, listOperators));
        //resetMetrics();
    }

    @Override
    public void dynamicAnalyze() {
        dynAn.analyze(listPathFiles);
    }


    @Override
    public Parser getParser() {
        return parser;
    }

    private void initMetrics() {
        listOperators = new ArrayList<>();
        listMetrics = new ArrayList<>();
        //IMetric countOperator = new DACO();
        //listMetrics.add(countOperator);

        IMetric levelNesting = new IfLevelNest();
        listMetrics.add(levelNesting);

        IMetric cycleLevelNest = new CycleLevelNest();
        listMetrics.add(cycleLevelNest);

        IMetric middleLenIdent = new MiddleLenIdent();
        listMetrics.add(middleLenIdent);

        IMetric OLCommentCount = new OLCommentCountMetric();
        listMetrics.add(OLCommentCount);

        IMetric OLCommentMidLen = new OLCommentMidLenMetric();
        listMetrics.add(OLCommentMidLen);

        IMetric MLCommentCount = new MLCommentCountMetric();
        listMetrics.add(MLCommentCount);

        IMetric MLCommentMidLen = new MLCommentMidLenMetric();
        listMetrics.add(MLCommentMidLen);

    }

    private ListenerParser createChainListeners() {
        ListenerParser listener = null;
        for (int i = 0; i < listMetrics.size(); i++) {
            listener = listMetrics.get(i).initListener(listMetrics.get(i), listener);
        }
        listener = new EventSequenceOperators(null, listener);
        listener.setListOperators(this.listOperators);
        return listener;
    }

    private TokenStream loadProject(String path) {
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
