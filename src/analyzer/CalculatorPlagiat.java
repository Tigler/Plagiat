package analyzer;

import analyzer.code.*;
import enums.EnumNameOperators;
import metrics.CycleLevelNest;
import metrics.IfLevelNest;

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
    ArrayList<Operator> listOperatorsFirst;
    ArrayList<Operator> listOperatorsSecond;

    public CalculatorPlagiat() {

    }

    private boolean calcFreq(ArrayList<Operator> listOperatorsFirst, int numAnF, ArrayList<Operator> listOperatorsSecond, int numAnS) {
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

                    ArrayList<Operator> listOperatorsAnalyzer = progAnalyzer.getListOperators();
                    calcFreq(listOperatorsAnalyzer, numAnalyzer, listOperators, 3);
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        calcFreq(listOperatorsFirst, 1, listOperatorsSecond, 2);

        compareSeq(first, second);

        return result;
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

    private void compareSeq(Analyzer first, Analyzer second) {
        int result = 0;
        int offsets[];
        for (int i = 0; i < first.getListOperators().size(); i++) {
            for (int j = 0; j < second.getListOperators().size(); j++) {
                //if (listOperatorsFirst.get(i).getKeyOperator() == listOperatorsSecond.get(i).getKeyOperator()) {

                //}
            }
        }
    }

    public int calcFirstAnd(ArrayList<IMetric> listFirst, ArrayList<IMetric> listSecond) {
        int result = 0;
        return result;
    }
}
