/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.EventOLCommentCount;
import events.EventParser;
import events.ListenerParser;

/**
 *
 * @author tigler
 */
public class OLCommentCountMetric implements IMetric{

    public static final int UniqNum=9;
    /**
     * количество поступивших комментариев
     */
    private int countComment;

    public OLCommentCountMetric() {
        countComment=0;
    }
    
    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.ONELINE_COMMENT) {
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
        return EnumNamesMetric.OLCommentCount.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventOLCommentCount(metric,listener);
    }

}
