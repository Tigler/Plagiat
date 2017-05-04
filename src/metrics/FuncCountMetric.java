/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import events.Event;
import analyzer.code.IMetric;
import events.EventFuncCount;
import events.ListenerParser;

/**
 *
 * @author tigler
 */
public class FuncCountMetric implements IMetric {

    /**
     * количество поступивших комментариев
     */
    private int countFunc;

    public FuncCountMetric() {
        countFunc = 0;
    }

    @Override
    public void calculate(Event event) {
        if (event.getCode() == Event.FUNC) {
            countFunc++;
        }
    }

    @Override
    public void reset() {
        countFunc = 0;
    }

    @Override
    public double getResult() {
        return countFunc;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventFuncCount(metric,listener);
    }

}
