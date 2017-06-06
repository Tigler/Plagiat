package analyzer;

import analyzer.code.*;
import dynamic.DynamicAnalyzer;
import enums.EnumNameOperators;
import graf.Edge;
import graf.Node;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class CalculatorPlagiat {
    private ArrayList<MyMap> freqFirst; //Частоты первого проекта
    private ArrayList<MyMap> freqSecond; //Частоты второго проекта
    private ArrayList<MyMap> freqDB; //Частоты проекта базы данных
    private int resultFreq; //Результат сравнения частот
    private int resultSeqOperators; //Результат сравнения последовательностей операторов
    private int resultDynamic; //Результат сравнения результатов динамического анализа
    private int resultMacCabe; //Результат сравнения метрик макКейба
    private int resultComapreGrafs; //Результат сравнения графов


    public CalculatorPlagiat() {

    }

    /**
     * Сравнивает частоты операторов двух проектов
     *
     * @param listResFirst  список результатов анализа первого проекта
     * @param numAnF        - номер первого анализатора
     * @param listResSecond список результатов анализа первого проекта
     * @param numAnS        - номер первого анализатора
     * @return
     */
    private boolean calcFreq(ArrayList<ResultAnalyzeFile> listResFirst, int numAnF,
                             ArrayList<ResultAnalyzeFile> listResSecond, int numAnS) {
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
        for (int i = 0; i < listResFirst.size(); i++) {
            for (ArrayList<Operator> listOperatorsFirst : listResFirst.get(i).getListsOperators()) {
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
        }

        for (int i = 0; i < listResSecond.size(); i++) {
            for (ArrayList<Operator> listOperatorsSecond : listResSecond.get(i).getListsOperators()) {
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

        int countOper = 0;
        double percentFirst = percentOneOp(assigFirst, countOperatorsFirst);
        double percentSecond = percentOneOp(assigSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(ifFirst, countOperatorsFirst);
        percentSecond = percentOneOp(ifSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(switchFirst, countOperatorsFirst);
        percentSecond = percentOneOp(switchSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(dowhileFirst, countOperatorsFirst);
        percentSecond = percentOneOp(dowhileSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;


        percentFirst = percentOneOp(whileFirst, countOperatorsFirst);
        percentSecond = percentOneOp(whileFirst, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(forFirst, countOperatorsFirst);
        percentSecond = percentOneOp(forSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(gotoFirst, countOperatorsFirst);
        percentSecond = percentOneOp(gotoSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(breakFirst, countOperatorsFirst);
        percentSecond = percentOneOp(breakSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(continueFirst, countOperatorsFirst);
        percentSecond = percentOneOp(continueSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        percentFirst = percentOneOp(returnFirst, countOperatorsFirst);
        percentSecond = percentOneOp(returnSecond, countOperatorsSecond);
        sumAllPercents += percentCoin(percentFirst, percentSecond);
        countOper++;

        resultFreq = (int) (sumAllPercents / countOper);
        return true;
    }

    /**
     * Сравнивает проект с базой данных
     *
     * @param analyzer     анализатор
     * @param numAn        номер анализатора
     * @param projectsDB   проекты базы данных
     * @param levelPlagiat - процент выше которого включить в результат
     * @return список результатов сравнения с базой банных
     */
    public ArrayList<ResultCompareWithDB> compareProjectDB(Analyzer analyzer, int numAn,
                                                           ArrayList<ProjectDB> projectsDB, int levelPlagiat) {
        ArrayList<ResultCompareWithDB> resultsCompareWithDB = new ArrayList<>();
        for (ProjectDB proj : projectsDB) {
            calcFreq(analyzer.getListResultAnalyzeFiles(), 1, proj.getListResultAnalyzeFile(), 3);
            resultSeqOperators = compareSeq(analyzer.getListResultAnalyzeFiles(), proj.getListResultAnalyzeFile());
            resultMacCabe = compareMacCabeFiles(analyzer.getListResultAnalyzeFiles(), proj.getListResultAnalyzeFile());
            resultComapreGrafs = compareGrafs(analyzer.getListResultAnalyzeFiles(), proj.getListResultAnalyzeFile());
            if ((resultFreq + resultSeqOperators + resultMacCabe + resultComapreGrafs) / 4 >= levelPlagiat) {
                resultsCompareWithDB.add(new ResultCompareWithDB(proj.getAuthor(), proj.getName(), proj.getDesc(),
                        String.valueOf(resultSeqOperators), String.valueOf(resultFreq), String.valueOf(resultMacCabe),
                        String.valueOf(resultComapreGrafs),
                        String.valueOf((resultFreq + resultSeqOperators + resultMacCabe + resultComapreGrafs) / 4)));
            }
        }
        return resultsCompareWithDB;
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

    private int compareSeq(ArrayList<ResultAnalyzeFile> listResFirst, ArrayList<ResultAnalyzeFile> listResSecond) {
        ArrayList<int[]> firAr = new ArrayList<>();
        ArrayList<int[]> secAr = new ArrayList<>();
        for (int k = 0; k < listResFirst.size(); k++) {
            for (int i = 0; i < listResFirst.get(k).getListsOperators().size(); i++) {
                int firstSeq[] = new int[listResFirst.get(k).getListsOperators().get(i).size()];
                for (int j = 0; j < listResFirst.get(k).getListsOperators().get(i).size(); j++) {
                    firstSeq[j] = listResFirst.get(k).getListsOperators().get(i).get(j).getKeyOperator();
                }
                firAr.add(firstSeq);
            }
        }
        for (int k = 0; k < listResSecond.size(); k++) {
            for (int i = 0; i < listResSecond.get(k).getListsOperators().size(); i++) {
                int secondSeq[] = new int[listResSecond.get(k).getListsOperators().get(i).size()];
                for (int j = 0; j < listResSecond.get(k).getListsOperators().get(i).size(); j++) {
                    secondSeq[j] = listResSecond.get(k).getListsOperators().get(i).get(j).getKeyOperator();
                }
                secAr.add(secondSeq);
            }
        }

        int percentSeqOper = 0;
        int countIter = 0;
        for (int i = 0; i < firAr.size(); i++) {
            int max = 0;
            int idxSec = -1;
            int num = 0;
            for (int j = 0; j < secAr.size(); j++) {
                int[] seq = getLCS(firAr.get(i), secAr.get(j));
                if (max <= seq.length) {
                    max = seq.length;
                    idxSec = j;
                    if (firAr.get(i).length == max) {
                        num = 1;
                        break;
                    }
                    if (secAr.get(j).length == max) {
                        num = 2;
                        break;
                    }
                }
            }
            int maxSeq = 0;
            if (idxSec != -1) {
                if (num == 0) {
                    if (firAr.get(i).length > secAr.get(idxSec).length) {
                        maxSeq = firAr.get(i).length;
                    } else {
                        maxSeq = secAr.get(idxSec).length;
                    }
                } else {
                    if (num == 1) {
                        maxSeq = firAr.get(i).length;
                    } else {
                        maxSeq = secAr.get(idxSec).length;
                    }
                }

                percentSeqOper += (max * 100 / maxSeq);
                countIter++;

            }

        }


        if (countIter == 0) {
            return 0;
        } else {
            percentSeqOper = percentSeqOper / countIter;
        }
        return percentSeqOper;
    }

    /**
     * Сраванивает 2 проекта
     *
     * @param firstAnalyzer  -первый анализатора
     * @param secondAnalyzer - второй анализатор
     */
    public void calcForTwoProj(Analyzer firstAnalyzer, Analyzer secondAnalyzer) {
        calcFreq(firstAnalyzer.getListResultAnalyzeFiles(), 1, secondAnalyzer.getListResultAnalyzeFiles(), 2);
        resultSeqOperators = compareSeq(firstAnalyzer.getListResultAnalyzeFiles(), secondAnalyzer.getListResultAnalyzeFiles());
        resultMacCabe = compareMacCabeFiles(firstAnalyzer.getListResultAnalyzeFiles(), secondAnalyzer.getListResultAnalyzeFiles());
        resultComapreGrafs = compareGrafs(firstAnalyzer.getListResultAnalyzeFiles(), secondAnalyzer.getListResultAnalyzeFiles());
    }

    private int compareMacCabeFiles(ArrayList<ResultAnalyzeFile> listFirstResultAnalyzeFiles,
                                    ArrayList<ResultAnalyzeFile> listSecondResultAnalyzeFiles) {
        int sumRes = 0;
        int countComp = 0;
        int max = 0;
        for (ResultAnalyzeFile res : listFirstResultAnalyzeFiles) {
            for (ArrayList<Node> graf1 : res.getGraf()) {
                max = 0;
                int result = 0;
                for (ResultAnalyzeFile res1 : listSecondResultAnalyzeFiles) {
                    for (ArrayList<Node> graf2 : res1.getGraf()) {


                        int countEdgesFirst = 0;
                        int countNodesFirst = 0;
                        for (Node node : graf1) {
                            countEdgesFirst += node.getEdges().size();
                        }
                        countNodesFirst = graf1.size();

                        int macCabeFirst = countEdgesFirst - countNodesFirst + 1;

                        int countEdgesSecond = 0;
                        int countNodesSecond = 0;
                        for (Node node : graf2) {
                            countEdgesSecond += node.getEdges().size();
                        }
                        countNodesSecond = graf2.size();

                        int macCabeSecond = countEdgesSecond - countNodesSecond + 1;

                        if (macCabeFirst > macCabeSecond) {
                            result = macCabeSecond * 100 / macCabeFirst;
                        } else if (macCabeFirst < macCabeSecond) {
                            result = macCabeFirst * 100 / macCabeSecond;
                        } else {
                            result = 100;
                        }
                        //int resCalc = calcMacCabeMetric(graf1, graf2);
                        if (max < result) {
                            max = result;
                        }
                    }
                }
                sumRes += max;
                ++countComp;
            }
        }
        if (countComp == 0) {
            return 0;
        }
        sumRes /= countComp;
        return sumRes;
    }


    private int calcMacCabeMetric(ArrayList<Node> graf1, ArrayList<Node> graf2) {

        int result = 0;


        return result;
    }

    /**
     * Найти наибольшую общую подпоследовательность
     *
     * @param x массив первой подпоследовательности
     * @param y массив второй подпоследовательности
     * @return массив результирующей подпоследовательности
     */
    private static int[] getLCS(int[] x, int[] y) {
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


    /**
     * Выполняет динамический анализ и сравнивает результаты
     *
     * @param firstAnalyzer  первый анализатор
     * @param secondAnalyzer второй анализатор
     */
    public void calcDynamic(Analyzer firstAnalyzer, Analyzer secondAnalyzer) {
        boolean dynExecFirst = firstAnalyzer.dynamicAnalyzeFirst();
        boolean dynExecSecond = secondAnalyzer.dynamicAnalyzeSecond();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> resultPars1 = parsingValgrindResult(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C1);
        ArrayList<String> resultPars2 = parsingValgrindResult(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C2);
        if (resultPars1.size() == 13 && resultPars2.size() == 13) {
            int result = 0;
            if (Integer.parseInt(resultPars1.get(0)) + 5000 > Integer.parseInt(resultPars2.get(0)) &&
                    Integer.parseInt(resultPars1.get(0)) - 5000 < Integer.parseInt(resultPars2.get(0))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(1)) + 10 > Integer.parseInt(resultPars2.get(1)) &&
                    Integer.parseInt(resultPars1.get(1)) - 10 < Integer.parseInt(resultPars2.get(1))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(2)) + 10 > Integer.parseInt(resultPars2.get(2)) &&
                    Integer.parseInt(resultPars1.get(2)) - 10 < Integer.parseInt(resultPars2.get(2))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(3)) + 0.2 > Double.parseDouble(resultPars2.get(3)) &&
                    Double.parseDouble(resultPars1.get(3)) - 0.2 < Double.parseDouble(resultPars2.get(3))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(4)) + 0.2 > Double.parseDouble(resultPars2.get(4)) &&
                    Double.parseDouble(resultPars1.get(4)) - 0.2 < Double.parseDouble(resultPars2.get(4))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(5)) + 5000 > Integer.parseInt(resultPars2.get(5)) &&
                    Integer.parseInt(resultPars1.get(5)) - 5000 < Integer.parseInt(resultPars2.get(5))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(6)) + 10 > Integer.parseInt(resultPars2.get(6)) &&
                    Integer.parseInt(resultPars1.get(6)) - 10 < Integer.parseInt(resultPars2.get(6))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(7)) + 10 > Integer.parseInt(resultPars2.get(7)) &&
                    Integer.parseInt(resultPars1.get(7)) - 10 < Integer.parseInt(resultPars2.get(7))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(8)) + 0.2 > Double.parseDouble(resultPars2.get(8)) &&
                    Double.parseDouble(resultPars1.get(8)) - 0.2 < Double.parseDouble(resultPars2.get(8))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(9)) + 0.2 > Double.parseDouble(resultPars2.get(9)) &&
                    Double.parseDouble(resultPars1.get(9)) - 0.2 < Double.parseDouble(resultPars2.get(9))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(10)) + 10 > Integer.parseInt(resultPars2.get(10)) &&
                    Integer.parseInt(resultPars1.get(10)) - 10 < Integer.parseInt(resultPars2.get(10))) {
                result++;
            }
            if (Integer.parseInt(resultPars1.get(11)) + 10 > Integer.parseInt(resultPars2.get(11)) &&
                    Integer.parseInt(resultPars1.get(11)) - 10 < Integer.parseInt(resultPars2.get(11))) {
                result++;
            }
            if (Double.parseDouble(resultPars1.get(12)) + 0.2 > Double.parseDouble(resultPars2.get(12)) &&
                    Double.parseDouble(resultPars1.get(12)) - 0.2 < Double.parseDouble(resultPars2.get(12))) {
                result++;
            }

            resultDynamic = 100 * result / 13;
        }

    }

    /**
     * Анализирует результат утилиты динамического анализа
     *
     * @param path путь до файла
     * @return Список значений профилирования
     */
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

    /**
     * Сраванивает графы методом Слайсов
     */
    private int compareGrafs(ArrayList<ResultAnalyzeFile> listFirstResultAnalyzeFiles,
                             ArrayList<ResultAnalyzeFile> listSecondResultAnalyzeFiles) {
        int compareResult = 0;
        int countCopare = 0;


        for (ResultAnalyzeFile resFirst : listFirstResultAnalyzeFiles) {
            for (ArrayList<Node> nodeArrayList : resFirst.getGraf()) {
                int max = 0;
                for (ResultAnalyzeFile resSecond : listSecondResultAnalyzeFiles) {
                    for (ArrayList<Node> nodeArrayList1 : resSecond.getGraf()) {

                        for (ResultAnalyzeFile resFirst1 : listFirstResultAnalyzeFiles) {
                            for (ArrayList<Node> nodeArrayList2 : resFirst1.getGraf()) {
                                for (Node node : nodeArrayList2) {
                                    node.setVisit(false);
                                }
                            }
                        }

                        for (ResultAnalyzeFile resS : listSecondResultAnalyzeFiles) {
                            for (ArrayList<Node> nodeArrayList2 : resS.getGraf()) {
                                for (Node node : nodeArrayList2) {
                                    node.setVisit(false);
                                }
                            }
                        }

                        ArrayList<ArrayList<Node>> retList = compareTwoGrafs(nodeArrayList, nodeArrayList1);
                        int percentFirst = retList.get(0).size() * 100 / nodeArrayList.size();
                        int percentSecond = retList.get(1).size() * 100 / nodeArrayList1.size();
                        int minPercent = 0;
                        if (percentFirst > percentSecond) {
                            minPercent = percentSecond;
                        } else {
                            minPercent = percentFirst;
                        }
                        if (max < minPercent) {
                            max = minPercent;
                        }
                    }

                }
                compareResult += max;
                countCopare++;
            }


            //compareResult = compareTwoListsGrafs(resFirst.getGraf(), resSecond.getGraf());
            //if (max < compareResult) {
            //    max = compareResult;
            //}
            // }
            // compareResult += max;
            // compareResult /= ++countCopare;
        }
        if (countCopare == 0) {
            return 0;
        }
        compareResult /= countCopare;
        return compareResult;
    }

    //private int compareTwoListsGrafs(ArrayList<ArrayList<Node>> grafsFirst, ArrayList<ArrayList<Node>> grafsSecond) {

    //   return percentCompare;
    // }

    private ArrayList<ArrayList<Node>> compareTwoGrafs(ArrayList<Node> grafFirst, ArrayList<Node> grafSecond) {
        ArrayList<Node> resListNodesFirstReturn = null;
        ArrayList<Node> resListNodesSecondReturn = null;
        for (Node nodeF : grafFirst) {
            ArrayList<Node> resListNodesFirst = new ArrayList<>();
            ArrayList<Node> resListNodesSecond = new ArrayList<>();
            for (Node nodeS : grafSecond) {
                if (nodeF.getCode() == nodeS.getCode() && !nodeF.isVisit() && !nodeS.isVisit()) {
                    resListNodesFirst.add(nodeF);
                    resListNodesSecond.add(nodeS);
                    for (int i = 0; i < resListNodesFirst.size(); i++) {
                        for (int j = 0; j < resListNodesSecond.size(); j++) {
                            if (resListNodesFirst.get(i).getCode() == resListNodesSecond.get(j).getCode()
                                    && !resListNodesFirst.get(i).isVisit() && !resListNodesSecond.get(j).isVisit()) {
                                resListNodesFirst.get(i).setVisit(true);
                                resListNodesSecond.get(j).setVisit(true);
                                for (Edge eF : resListNodesFirst.get(i).getEdges()) {
                                    for (Edge eS : resListNodesSecond.get(j).getEdges()) {
                                        if (eF.getEnd().getCode() == eS.getEnd().getCode() && !eF.getEnd().isVisit()
                                                && !eS.getEnd().isVisit()) {
                                            resListNodesFirst.add(eF.getEnd());
                                            resListNodesSecond.add(eS.getEnd());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int maxRet = 0;
                if (resListNodesFirstReturn != null) {
                    if (resListNodesFirstReturn.size() > resListNodesSecondReturn.size()) {
                        maxRet = resListNodesSecondReturn.size();
                    } else {
                        maxRet = resListNodesFirstReturn.size();
                    }
                    if (resListNodesFirst.size() > resListNodesSecond.size()) {
                        if (maxRet < resListNodesSecond.size()) {
                            resListNodesFirstReturn = resListNodesFirst;
                            resListNodesSecondReturn = resListNodesSecond;
                        }
                    } else {
                        if (maxRet < resListNodesFirst.size()) {
                            resListNodesFirstReturn = resListNodesFirst;
                            resListNodesSecondReturn = resListNodesSecond;
                        }
                    }
                } else {
                    resListNodesFirstReturn = resListNodesFirst;
                    resListNodesSecondReturn = resListNodesSecond;
                }
            }

        }
        ArrayList<ArrayList<Node>> retList = new ArrayList<>();
        retList.add(resListNodesFirstReturn);
        retList.add(resListNodesSecondReturn);
        return retList;
    }

    /**
     * Получить список частот первого проекта
     *
     * @return список частот первого проекта
     */
    public ArrayList<MyMap> getFreqFirst() {
        return freqFirst;
    }

    /**
     * Получить список частот второго проекта
     *
     * @return список частот второго проекта
     */
    public ArrayList<MyMap> getFreqSecond() {
        return freqSecond;
    }

    /**
     * Получить результат сравнивания последовательностей операторов
     *
     * @return результат сравнивания последовательностей операторов
     */
    public int getResultSeqOperators() {
        return resultSeqOperators;
    }

    /**
     * Получить результат сравнивания частот
     *
     * @return результат сравнивания частот
     */
    public int getResultFreq() {
        return resultFreq;
    }

    /**
     * Получить результат сравнивания динамического анализа
     *
     * @return результат сравнивания динамического анализа
     */
    public int getResultDynamic() {
        return resultDynamic;
    }

    /**
     * Получить результат сравнивания метрик МакКейба
     *
     * @return результат сравнивания метрик МакКейба
     */
    public int getResultMacCabe() {
        return resultMacCabe;
    }

    /**
     * Получить результат сравнивания графов методом слайсов
     *
     * @return результат сравнивания графов методом слайсов
     */
    public int getResultComapreGrafs() {
        return resultComapreGrafs;
    }
}
