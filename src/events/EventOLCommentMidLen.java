/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;

/**
 * @author tigler
 */
public class EventOLCommentMidLen extends ListenerParser {

    public EventOLCommentMidLen(IMetric ce) {
        OLCommentMidLen = ce;
        successor = null;
    }

    public EventOLCommentMidLen(IMetric ce1, ListenerParser successor) {
        OLCommentMidLen = ce1;
        this.successor = successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.ONELINE_COMMENT) {
            OLCommentMidLen.calculate(event);
            if (successor != null) {
                successor.onEvent(event);
            }
        } else {
            if (successor != null) {
                successor.onEvent(event);
            }
        }
    }

}
