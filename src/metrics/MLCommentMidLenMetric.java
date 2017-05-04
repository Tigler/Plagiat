/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import events.Event;
import events.EventMLCommentMidLen;
import events.ListenerParser;

import java.beans.Expression;

/**
 *
 * @author tigler
 */
public class MLCommentMidLenMetric implements IMetric {

    public static final int UniqNum=8;
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

    public MLCommentMidLenMetric() {
        sumLenthComment = 0;
        countComment = 0;
        middleLenComment = 0.0;
    }

    @Override
    public void calculate(Event event) {
        if (event.getCode() == Event.ONELINE_COMMENT) {
            //try {
                sumLenthComment += Integer.parseInt(event.getIdent());
                countComment++;
                middleLenComment = (double) sumLenthComment / (double) countComment;
            //}catch(Expression ex){

            //}
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
        return null;
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventMLCommentMidLen(metric,listener);
    }

}
