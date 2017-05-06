package analyzer;

import analyzer.code.*;
import metrics.CycleLevelNest;
import metrics.IfLevelNest;

import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class CalculatorPlagiat {
    private ArrayList<MyMap> frequences;
    private ArrayList<MyPair> freqFirst;
    private ArrayList<MyPair> freqSecond;

    public CalculatorPlagiat() {
        frequences = new ArrayList<>();
    }

    private void compareMetrics(Analyzer first, Analyzer second) {
        for (ResultAnalyzeFile resFirst : first.getListResultAnalyzeFiles()) {
            for (ResultAnalyzeFile resSecond : second.getListResultAnalyzeFiles()) {

            }
        }
    }

    public int calcForTwoProjMetrics(Analyzer first, Analyzer second) {
        ArrayList<IMetric> listFirst = first.getListMetrics();
        ArrayList<IMetric> listSecond = second.getListMetrics();

        int result = 0;
        for (IMetric firstM : listFirst) {
            for (IMetric secondM : listSecond) {
                if (firstM.getName().equals(secondM.getName())) {
                    if (firstM instanceof CycleLevelNest && secondM instanceof CycleLevelNest) {
                        CycleLevelNest cycleLevelNestFirst = (CycleLevelNest) firstM;
                        CycleLevelNest cycleLevelNestSecond = (CycleLevelNest) secondM;
                    }

                    if (firstM instanceof IfLevelNest && secondM instanceof IfLevelNest) {
                        IfLevelNest ifLevelNestFirst = (IfLevelNest) firstM;
                        IfLevelNest ifLevelNestSecond = (IfLevelNest) secondM;
                    }


                    if (firstM.getResult() > secondM.getResult()) {

                    }
                }
            }
        }

        ArrayList<Operator> listOperatorsFirst = first.getListOperators();
        ArrayList<Operator> listOperatorsSecond = second.getListOperators();


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
        for (Operator oper : listOperatorsFirst) {
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

        for (Operator oper : listOperatorsSecond) {
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
        freqFirst = new ArrayList<>();
        freqFirst.add(new MyPair(Operator.ASSIGMENT, assigFirst));
        freqFirst.add(new MyPair(Operator.IF, ifFirst));
        freqFirst.add(new MyPair(Operator.SWITCH, switchFirst));
        freqFirst.add(new MyPair(Operator.DOWHILE, dowhileFirst));
        freqFirst.add(new MyPair(Operator.WHILE, whileFirst));
        freqFirst.add(new MyPair(Operator.FOR, forFirst));
        freqFirst.add(new MyPair(Operator.GOTO, gotoFirst));
        freqFirst.add(new MyPair(Operator.BREAK, breakFirst));
        freqFirst.add(new MyPair(Operator.CONTINUE, continueFirst));
        freqFirst.add(new MyPair(Operator.RETURN, returnFirst));

        freqSecond = new ArrayList<>();

        freqSecond.add(new MyPair(Operator.ASSIGMENT, assigSecond));
        freqSecond.add(new MyPair(Operator.IF, ifSecond));
        freqSecond.add(new MyPair(Operator.SWITCH, switchSecond));
        freqSecond.add(new MyPair(Operator.DOWHILE, dowhileSecond));
        freqSecond.add(new MyPair(Operator.WHILE, whileSecond));
        freqSecond.add(new MyPair(Operator.FOR, forSecond));
        freqSecond.add(new MyPair(Operator.GOTO, gotoSecond));
        freqSecond.add(new MyPair(Operator.BREAK, breakSecond));
        freqSecond.add(new MyPair(Operator.CONTINUE, continueSecond));
        freqSecond.add(new MyPair(Operator.RETURN, returnSecond));

        int countOperatorsFirst = listOperatorsFirst.size();
        int countOperatorsSecond = listOperatorsSecond.size();

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

        int resultOffsets = (int) (sumAllPercents / 10);


        compareSeq(listOperatorsFirst, listOperatorsSecond);

        return result;
    }

    public ArrayList<MyPair> getFreqFirst() {
        return freqFirst;
    }

    public ArrayList<MyPair> getFreqSecond() {
        return freqSecond;
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

    private void compareSeq(ArrayList<Operator> listOperatorsFirst, ArrayList<Operator> listOperatorsSecond) {
        int result = 0;
        int offsets[];
        for (int i = 0, j = 0; i < listOperatorsFirst.size(); i++) {
            //if (listOperatorsFirst.get(i).getKeyOperator() == listOperatorsSecond.get(i).getKeyOperator()) {

            //}
        }
    }

    public int calcFirstAnd(ArrayList<IMetric> listFirst, ArrayList<IMetric> listSecond) {
        int result = 0;
        return result;
    }
}
