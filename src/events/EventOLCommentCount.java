/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;

/**
 *
 * @author tigler
 */
public class EventOLCommentCount extends ListenerParser {

    public EventOLCommentCount(IMetric ce) {
        OLCommentCount = ce;
        successor = null;
    }

    public EventOLCommentCount(IMetric ce, ListenerParser successor) {
        OLCommentCount = ce;
        this.successor = successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.ONELINE_COMMENT) {
            OLCommentCount.calculate(event);
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
