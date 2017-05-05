/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.EventMLCommentCount;
import events.EventParser;
import events.ListenerParser;

/**
 *
 * @author tigler
 */
public class MLCommentCountMetric implements IMetric{

   /**
     * количество поступивших комментариев
     */
    private int countComment;

    public MLCommentCountMetric() {
        countComment=0;
    }
    
    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.MULTILINE_COMMENT) {
            countComment++;
        }
    }

    @Override
    public void reset() {
        countComment=0;
    }

    @Override
    public double getResult() {
        return countComment;
    }

    @Override
    public String getName() {
        return EnumNamesMetric.MLCommentCount.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventMLCommentCount(metric,listener);
    }

}
