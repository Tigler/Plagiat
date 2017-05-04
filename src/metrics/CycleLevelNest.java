/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import events.Event;
import events.EventCycleLevNest;
import events.ListenerParser;


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

    public CycleLevelNest() {
        maxLevel = 0;
        curLevel = 0;
    }


    @Override
    public void calculate(Event event) {
        if (event.getCode() == Event.WHILE_START || event.getCode() == Event.DO_WHILE_START
                || event.getCode() == Event.FOR_START) {
            curLevel++;
            if (maxLevel < curLevel) {
                maxLevel = curLevel;
            }
        }
        if (event.getCode() == Event.WHILE_END || event.getCode() == Event.DO_WHILE_END
                || event.getCode() == Event.FOR_END) {
            curLevel--;
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
        return null;
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener){
        return new EventCycleLevNest(metric,listener);
    }

}
