/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.EventCycleLevNest;
import events.EventParser;
import events.ListenerParser;

import java.util.ArrayList;


/**
 * @author tigler
 */
public class CycleLevelNest implements IMetric {

    /**
     * максимальный уровень вложенности проанализироанных операторов
     */
    int maxLevel;
    /**
     * текущий уровень вложенности проанализироанных операторов
     */
    int curLevel;
    /**
     * финализированная переменая.Плохая оценка уровня вложенности.
     */
    public final static double MINSETTING = 1.0;
    /**
     * финализированная переменая.Хорошая оценка уровная вложенности.
     */
    public final static double MAXSETTING = 6.0;

    private ArrayList<Integer> seqLevelsNest;

    public CycleLevelNest() {
        maxLevel = 0;
        curLevel = 0;
        seqLevelsNest = new ArrayList<>();
    }


    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.DO_WHILE_START
                || event.getCode() == EventParser.FOR_START) {
            curLevel++;
            if (maxLevel < curLevel) {
                maxLevel = curLevel;
            }
        }
        if (event.getCode() == EventParser.WHILE_END || event.getCode() == EventParser.DO_WHILE_END
                || event.getCode() == EventParser.FOR_END) {
            curLevel--;
            if (curLevel == 0) {
                seqLevelsNest.add(maxLevel);
                maxLevel = curLevel = 0;
            }
        }
    }

    @Override
    public void reset() {
        maxLevel = 0;
        curLevel = 0;
    }

    @Override
    public double getResult() {
        return maxLevel;
    }

    @Override
    public String getName() {
        return EnumNamesMetric.cycleLevelNest.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventCycleLevNest(metric, listener);
    }

    public ArrayList<Integer> getSeqLevelsNest() {
        return seqLevelsNest;
    }

}
