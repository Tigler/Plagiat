/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.Event;
import events.EventCycleCount;
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
    public void calculate(Event event) {
        if (event.getCode() == Event.WHILE_START || event.getCode() == Event.DO_WHILE_START
                || event.getCode() == Event.FOR_START) {
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
        return EnumNamesMetric.countOperators.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventCycleCount(metric,listener);
    }
}
