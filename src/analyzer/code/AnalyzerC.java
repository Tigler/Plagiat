package analyzer.code;

import dynamic.DynamicAnalyzer;
import dynamic.Utilite;
import events.EventMiddleLenIdent;
import events.ListenerParser;
import jdk.internal.util.xml.impl.ReaderUTF8;
import languageProg.LanguageProg;
import metrics.*;
import org.antlr.runtime.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import parsers.C.CLexer;
import parsers.C.CParser;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by tigler on 28.04.17.
 */
public class AnalyzerC extends Analyzer {


    public AnalyzerC() {
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
        cParser.compilationUnit();
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
