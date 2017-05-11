package analyzer;

import analyzer.code.*;
import dynamic.DynamicAnalyzer;
import enums.EnumNameOperators;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class CalculatorPlagiat {
    private ArrayList<MyMap> freqFirst;
    private ArrayList<MyMap> freqSecond;
    private ArrayList<MyMap> freqDB;
    int resultFreq;
    int resultSeqOperators;
    int resultDynamic;


    public CalculatorPlagiat() {

    }

    private boolean calcFreq(ArrayList<ArrayList<Operator>> listsOperatorsFirst, int numAnF, ArrayList<ArrayList<Operator>> listsOperatorsSecond, int numAnS) {
        if (numAnF == numAnS) {
            return false;
        }
        int assigFirst = 0;
        int ifFirst = 0;
        int switchFirst = 0;
        int dowhileFirst = 0;
        int whileFirst = 0;
        int forFirst = 0;
        int gotoFirst = 0;
        int breakFirst = 0;
        int continueFirst = 0;
        int returnFirst = 0;

        int assigSecond = 0;
        int ifSecond = 0;
        int switchSecond = 0;
        int dowhileSecond = 0;
        int whileSecond = 0;
        int forSecond = 0;
        int gotoSecond = 0;
        int breakSecond = 0;
        int continueSecond = 0;
        int returnSecond = 0;

        int countOperatorsFirst = 0;
        int countOperatorsSecond = 0;
        for (ArrayList<Operator> listOperatorsFirst : listsOperatorsFirst) {
            for (Operator oper : listOperatorsFirst) {
                countOperatorsFirst++;
                switch (oper.getKeyOperator()) {
                    case Operator.ASSIGMENT:
                        assigFirst++;
                        break;
                    case Operator.IF:
                        ifFirst++;
                        break;
                    case Operator.SWITCH:
                        switchFirst++;
                        break;
                    case Operator.DOWHILE:
                        dowhileFirst++;
                        break;
                    case Operator.WHILE:
                        whileFirst++;
                        break;
                    case Operator.FOR:
                        forFirst++;
                        break;
                    case Operator.GOTO:
                        gotoFirst++;
                        break;
                    case Operator.BREAK:
                        breakFirst++;
                        break;
                    case Operator.CONTINUE:
                        continueFirst++;
                        break;
                    case Operator.RETURN:
                        returnFirst++;
                        break;
                    default:
                        break;
                }
            }
        }

        for (ArrayList<Operator> listOperatorsSecond : listsOperatorsSecond) {
            for (Operator oper : listOperatorsSecond) {
                countOperatorsSecond++;
                switch (oper.getKeyOperator()) {
                    case Operator.ASSIGMENT:
                        assigSecond++;
                        break;
                    case Operator.IF:
                        ifSecond++;
                        break;
                    case Operator.SWITCH:
                        switchSecond++;
                        break;
                    case Operator.DOWHILE:
                        dowhileSecond++;
                        break;
                    case Operator.WHILE:
                        whileSecond++;
                        break;
                    case Operator.FOR:
                        forSecond++;
                        break;
                    case Operator.GOTO:
                        gotoSecond++;
                        break;
                    case Operator.BREAK:
                        breakSecond++;
                        break;
                    case Operator.CONTINUE:
                        continueSecond++;
                        break;
                    case Operator.RETURN:
                        returnSecond++;
                        break;
                    default:
                        break;
                }
            }
        }
        if (numAnF == 1 || numAnS == 1) {
            freqFirst = new ArrayList<>();
            freqFirst.add(new MyMap(assigFirst, EnumNameOperators.Assigment.getName()));
            freqFirst.add(new MyMap(ifFirst, EnumNameOperators.If.getName()));
            freqFirst.add(new MyMap(switchFirst, EnumNameOperators.Switch.getName()));
            freqFirst.add(new MyMap(dowhileFirst, EnumNameOperators.Dowhile.getName()));
            freqFirst.add(new MyMap(whileFirst, EnumNameOperators.While.getName()));
            freqFirst.add(new MyMap(forFirst, EnumNameOperators.For.getName()));
            freqFirst.add(new MyMap(gotoFirst, EnumNameOperators.Goto.getName()));
            freqFirst.add(new MyMap(breakFirst, EnumNameOperators.Break.getName()));
            freqFirst.add(new MyMap(continueFirst, EnumNameOperators.Continue.getName()));
            freqFirst.add(new MyMap(returnFirst, EnumNameOperators.Return.getName()));
        }


        if (numAnF == 2 || numAnS == 2) {
            freqSecond = new ArrayList<>();
            freqSecond.add(new MyMap(assigSecond, EnumNameOperators.Assigment.getName()));
            freqSecond.add(new MyMap(ifSecond, EnumNameOperators.If.getName()));
            freqSecond.add(new MyMap(switchSecond, EnumNameOperators.Switch.getName()));
            freqSecond.add(new MyMap(dowhileSecond, EnumNameOperators.Dowhile.getName()));
            freqSecond.add(new MyMap(whileSecond, EnumNameOperators.While.getName()));
            freqSecond.add(new MyMap(forSecond, EnumNameOperators.For.getName()));
            freqSecond.add(new MyMap(gotoSecond, EnumNameOperators.Goto.getName()));
            freqSecond.add(new MyMap(breakSecond, EnumNameOperators.Break.getName()));
            freqSecond.add(new MyMap(continueSecond, EnumNameOperators.Continue.getName()));
            freqSecond.add(new MyMap(returnSecond, EnumNameOperators.Return.getName()));
        }

        if (numAnF == 3 || numAnS == 3) {
            freqDB = new ArrayList<>();
            freqDB.add(new MyMap(assigSecond, EnumNameOperators.Assigment.getName()));
            freqDB.add(new MyMap(ifSecond, EnumNameOperators.If.getName()));
            freqDB.add(new MyMap(switchSecond, EnumNameOperators.Switch.getName()));
            freqDB.add(new MyMap(dowhileSecond, EnumNameOperators.Dowhile.getName()));
            freqDB.add(new MyMap(whileSecond, EnumNameOperators.While.getName()));
            freqDB.add(new MyMap(forSecond, EnumNameOperators.For.getName()));
            freqDB.add(new MyMap(gotoSecond, EnumNameOperators.Goto.getName()));
            freqDB.add(new MyMap(breakSecond, EnumNameOperators.Break.getName()));
            freqDB.add(new MyMap(continueSecond, EnumNameOperators.Continue.getName()));
            freqDB.add(new MyMap(returnSecond, EnumNameOperators.Return.getName()));
        }


        double sumAllPercents = 0;

        double percentFirst = percentOneOp(assigFirst, countOperatorsFirst);
        double percentSecond = percentOneOp(assigSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(ifFirst, countOperatorsFirst);
        percentSecond = percentOneOp(ifSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(switchFirst, countOperatorsFirst);
        percentSecond = percentOneOp(switchSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(dowhileFirst, countOperatorsFirst);
        percentSecond = percentOneOp(dowhileSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(whileFirst, countOperatorsFirst);
        percentSecond = percentOneOp(whileFirst, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(forFirst, countOperatorsFirst);
        percentSecond = percentOneOp(forSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(gotoFirst, countOperatorsFirst);
        percentSecond = percentOneOp(gotoSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(breakFirst, countOperatorsFirst);
        percentSecond = percentOneOp(breakSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(continueFirst, countOperatorsFirst);
        percentSecond = percentOneOp(continueSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        percentFirst = percentOneOp(returnFirst, countOperatorsFirst);
        percentSecond = percentOneOp(returnSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);

        resultFreq = (int) (sumAllPercents / 10);
        return true;
    }

    public void compareProjectDB(Analyzer progAnalyzer, int numAnalyzer) {
        try {
            ConnectorDB.prepeareStmt(ConnectorDB.selectProjects);
            ResultSet resultSetProj = ConnectorDB.executeQuery();
            ArrayList<ProjectDB> projectsDB = new ArrayList<>();

            while (resultSetProj.next()) {
                int idProj = resultSetProj.getInt(1);
                String author = resultSetProj.getString(2);
                String name = resultSetProj.getString(3);

                ConnectorDB.getConnection();
                PreparedStatement preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.selectSource);
                preparedStatement.setInt(1, idProj);
                ResultSet resultSetSrc = ConnectorDB.executeQuery();
                while (resultSetSrc.next()) {
                    int idSrc = resultSetSrc.getInt(1);
                    resultSetSrc.getString(2);
                    resultSetSrc.getString(3);

                    ConnectorDB.getConnection();
                    PreparedStatement preparedStatement1 = ConnectorDB.prepeareStmt(ConnectorDB.selectOperator);
                    preparedStatement1.setInt(1, idSrc);
                    ResultSet resultSetOper = ConnectorDB.executeQuery();

                    ArrayList<Operator> listOperators = new ArrayList<>();
                    while (resultSetOper.next()) {
                        int idOper = resultSetOper.getInt(1);
                        String operator = resultSetOper.getString(2);
                        int keyOper = resultSetOper.getInt(3);
                        listOperators.add(new Operator(keyOper, operator, -1, null));
                    }

                    ArrayList<ArrayList<Operator>> listOperatorsAnalyzer = progAnalyzer.getListsOperators();
                    //calcFreq(listOperatorsAnalyzer, numAnalyzer, listOperators, 3);
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<MyMap> getFreqFirst() {
        return freqFirst;
    }

    public ArrayList<MyMap> getFreqSecond() {
        return freqSecond;
    }

    public int getResultFreq() {
        return resultFreq;
    }

    private double percentOneOp(int countOp, int countAllOp) {
        if (countAllOp == 0) {
            return 0;
        }
        return 100 * countOp / countAllOp;
    }

    private double percentCoin(double percentFirst, double percentSecond) {

        if (percentFirst == 0 && percentSecond == 0) {
            return 100;
        }
        if (percentFirst > percentSecond) {
            if (percentSecond == 0) {
                return 0;
            }
            return percentSecond / percentFirst * 100;
        } else {
            if (percentFirst == 0) {
                return 0;
            }
            return percentFirst / percentSecond * 100;
        }
    }

    private int compareSeq(Analyzer first, Analyzer second) {
        int result = 0;
        int offsets[];
        ;
        ArrayList<int[]> firAr = new ArrayList<>();
        ArrayList<int[]> secAr = new ArrayList<>();
        for (int k = 0; k < first.getListResultAnalyzeFiles().size(); k++) {
            for (int i = 0; i < first.getListResultAnalyzeFiles().get(k).getListsOperators().size(); i++) {
                int firstSeq[] = new int[first.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).size()];
                for (int j = 0; j < first.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).size(); j++) {
                    firstSeq[j] = first.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).get(j).getKeyOperator();
                }
                firAr.add(firstSeq);
            }
        }
        for (int k = 0; k < second.getListResultAnalyzeFiles().size(); k++) {
            for (int i = 0; i < second.getListResultAnalyzeFiles().get(k).getListsOperators().size(); i++) {
                int secondSeq[] = new int[second.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).size()];
                for (int j = 0; j < second.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).size(); j++) {
                    secondSeq[j] = second.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).get(j).getKeyOperator();
                }
                secAr.add(secondSeq);
            }
        }

        ArrayList<Integer> lenSeqs = new ArrayList<>();

        for (int i = 0; i < firAr.size(); i++) {
            int max = 0;
            for (int j = 0; j < secAr.size(); j++) {
                int[] seq = getLCS(firAr.get(i), secAr.get(j));
                if (seq.length > max) {
                    max = seq.length;
                }
            }
            lenSeqs.add(max);
        }

        int percentSeqOper = 0;
        int countIter = 0;
        for (int k = 0; k < first.getListResultAnalyzeFiles().size(); k++) {
            for (int i = 0; i < first.getListResultAnalyzeFiles().get(k).getListsOperators().size(); i++) {
                percentSeqOper += (lenSeqs.get(i + k).intValue() * 100 / first.getListResultAnalyzeFiles().get(k).getListsOperators().get(i).size());
                countIter++;
            }
        }

        percentSeqOper = percentSeqOper / countIter;
        return percentSeqOper;
    }

    public void calcForTwoProj(Analyzer firstAnalyzer, Analyzer secondAnalyzer) {
        calcFreq(firstAnalyzer.getListsOperators(), 1, secondAnalyzer.getListsOperators(), 2);
        resultSeqOperators = compareSeq(firstAnalyzer, secondAnalyzer);
    }

    public static int[] getLCS(int[] x, int[] y) {
        int m = x.length;
        int n = y.length;
        int[][] len = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i] == y[j]) {
                    len[i + 1][j + 1] = len[i][j] + 1;
                } else {
                    len[i + 1][j + 1] = Math.max(len[i + 1][j], len[i][j + 1]);
                }
            }
        }
        int cnt = len[m][n];
        int[] res = new int[cnt];
        for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; ) {
            if (x[i] == y[j]) {
                res[--cnt] = x[i];
                --i;
                --j;
            } else if (len[i + 1][j] > len[i][j + 1]) {
                --j;
            } else {
                --i;
            }
        }
        return res;
    }

    public int getResultSeqOperators() {
        return resultSeqOperators;
    }

    public void calcDynamic(Analyzer firstAnalyzer, Analyzer secondAnalyzer) {
        boolean dynExecFirst = firstAnalyzer.dynamicAnalyzeFirst();
        boolean dynExecSecond = secondAnalyzer.dynamicAnalyzeSecond();
        ArrayList<String> resultPars1 = parsingValgrindResult(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C1);
        ArrayList<String> resultPars2 = parsingValgrindResult(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C2);
        if (resultPars1.size() == 13 && resultPars2.size() == 13) {
            int result = 0;
            if (Integer.parseInt(resultPars1.get(0)) + 50 > Integer.parseInt(resultPars2.get(0)) &&
                    Integer.parseInt(resultPars1.get(0)) - 50 < Integer.parseInt(resultPars2.get(0))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(1)) + 20 > Integer.parseInt(resultPars2.get(1)) &&
                    Integer.parseInt(resultPars1.get(1)) - 20 < Integer.parseInt(resultPars2.get(1))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(2)) + 20 > Integer.parseInt(resultPars2.get(2)) &&
                    Integer.parseInt(resultPars1.get(2)) - 20 < Integer.parseInt(resultPars2.get(2))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(3)) + 0.1 > Double.parseDouble(resultPars2.get(3)) &&
                    Double.parseDouble(resultPars1.get(3)) - 0.1 < Double.parseDouble(resultPars2.get(3))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(4)) + 0.2 > Double.parseDouble(resultPars2.get(4)) &&
                    Double.parseDouble(resultPars1.get(4)) - 0.2 < Double.parseDouble(resultPars2.get(4))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(5)) + 50 > Integer.parseInt(resultPars2.get(5)) &&
                    Integer.parseInt(resultPars1.get(5)) - 50 < Integer.parseInt(resultPars2.get(5))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(6)) + 20 > Integer.parseInt(resultPars2.get(6)) &&
                    Integer.parseInt(resultPars1.get(6)) - 20 < Integer.parseInt(resultPars2.get(6))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(7)) + 20 > Integer.parseInt(resultPars2.get(7)) &&
                    Integer.parseInt(resultPars1.get(7)) - 20 < Integer.parseInt(resultPars2.get(7))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(8)) + 0.1 > Double.parseDouble(resultPars2.get(8)) &&
                    Double.parseDouble(resultPars1.get(8)) - 0.1 < Double.parseDouble(resultPars2.get(8))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(9)) + 0.1 > Double.parseDouble(resultPars2.get(9)) &&
                    Double.parseDouble(resultPars1.get(9)) - 0.1 < Double.parseDouble(resultPars2.get(9))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(10)) + 20 > Integer.parseInt(resultPars2.get(10)) &&
                    Integer.parseInt(resultPars1.get(10)) - 20 < Integer.parseInt(resultPars2.get(10))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(11)) + 20 > Integer.parseInt(resultPars2.get(11)) &&
                    Integer.parseInt(resultPars1.get(11)) - 20 < Integer.parseInt(resultPars2.get(11))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(12)) + 0.1 > Double.parseDouble(resultPars2.get(12)) &&
                    Double.parseDouble(resultPars1.get(12)) - 0.1 < Double.parseDouble(resultPars2.get(12))) {
                result++;
            }

            resultDynamic = 100 * result / 13;
        }

    }

    public ArrayList<String> parsingValgrindResult(String path) {

        ArrayList<String> result = new ArrayList<>();
        BufferedReader reader = null;
        String text = "";
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path), Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parsLine = line.split(" ");
                if (parsLine.length > 5) {
                    if (parsLine[1].equals("I") && parsLine[4].equals("refs:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("I1") && parsLine[3].equals("misses:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LLi") && parsLine[2].equals("misses:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("I1") && parsLine[3].equals("miss") && parsLine[4].equals("rate:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LLi") && parsLine[2].equals("miss") && parsLine[3].equals("rate:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("D") && parsLine[4].equals("refs:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("D1") && parsLine[3].equals("misses:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LLd") && parsLine[2].equals("misses:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("D1") && parsLine[3].equals("miss") && parsLine[4].equals("rate:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LLd") && parsLine[2].equals("miss") && parsLine[3].equals("rate:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LL") && parsLine[2].equals("refs:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LL") && parsLine[2].equals("misses:")) {
                        addInListResPars(parsLine, result);
                    }
                    if (parsLine[1].equals("LL") && parsLine[2].equals("miss") && parsLine[3].equals("rate:")) {
                        addInListResPars(parsLine, result);
                    }
                }

            }
        } catch (IOException e) {
            // log error
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // log warning
                }
            }
        }
        return result;

    }

    private void addInListResPars(String[] parsLine, ArrayList<String> result) {
        for (int i = 5; i < 30; i++) {
            if (!parsLine[i].equals("")) {
                String[] parsRes = parsLine[i].split(",");
                if (parsRes.length > 1) {
                    String tmp = "";
                    for (int j = 0; j < parsRes.length; j++) {
                        tmp += parsRes[j];
                    }
                    result.add(tmp);
                    break;
                }
                parsRes = parsLine[i].split("%");
                if (parsRes.length == 1) {
                    result.add(parsRes[0]);
                    break;
                }


            }
        }
    }
}
