package analyzer;

import analyzer.code.Analyzer;
import analyzer.code.IMetric;
import analyzer.code.Operator;
import metrics.CycleLevelNest;
import metrics.IfLevelNest;

import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class CalculatorPlagiat {
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

        return result;
    }

    public int calcFirstAnd(ArrayList<IMetric> listFirst, ArrayList<IMetric> listSecond) {
        int result = 0;
        return result;
    }
}
