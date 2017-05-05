/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.EventCycleCount;
import events.EventParser;
import events.ListenerParser;


/**
 * @author tigler
 */
public class CycleCount implements IMetric {
    /**
     * количество поступивших комментариев
     */
    private int countCycle;

    public CycleCount() {
        countCycle = 0;
    }

    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.DO_WHILE_START
                || event.getCode() == EventParser.FOR_START) {
            countCycle++;
        }
    }

    @Override
    public void reset() {
        countCycle = 0;
    }

    @Override
    public double getResult() {
        return countCycle;
    }

    /**
     * Статический метод для получения названия метрики.
     * Использует перечисление EnumNamesMetric с названиями метрик.
     *
     * @return Строку - навание метрики.
     */
    @Override
    public String getName() {
        return EnumNamesMetric.cycleCount.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventCycleCount(metric,listener);
    }
}
