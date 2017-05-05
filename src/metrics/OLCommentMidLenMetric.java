/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumNamesMetric;
import events.EventOLCommentMidLen;
import events.EventParser;
import events.ListenerParser;

/**
 * @author tigler
 */
public class OLCommentMidLenMetric implements IMetric {

    /**
     * сумма длин поступавших комментариев
     */
    private int sumLenthComment;
    /**
     * количество поступивших комментариев
     */
    private int countComment;
    /**
     * средняя длина поступивших комментариев
     */
    private double middleLenComment;

    public OLCommentMidLenMetric() {
        sumLenthComment = 0;
        countComment = 0;
        middleLenComment = 0.0;
    }

    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.ONELINE_COMMENT) {
            sumLenthComment += Integer.parseInt(event.getIdent());
            countComment++;
            middleLenComment = (double) sumLenthComment / (double) countComment;
        }
    }

    @Override
    public void reset() {
        sumLenthComment = 0;
        countComment = 0;
        middleLenComment = 0.0;
    }

    @Override
    public double getResult() {
        return middleLenComment;
    }

    @Override
    public String getName() {
        return EnumNamesMetric.OLCommentMidLen.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventOLCommentMidLen(metric, listener);
    }

}
