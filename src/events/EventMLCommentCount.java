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
public class EventMLCommentCount extends ListenerParser {

    public EventMLCommentCount(IMetric ce) {
        MLCommentCount = ce;
        successor = null;
    }

    public EventMLCommentCount(IMetric ce, ListenerParser successor) {
        MLCommentCount = ce;
        this.successor = successor;
    }


    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.MULTILINE_COMMENT) {
            MLCommentCount.calculate(event);
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
