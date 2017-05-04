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
public class EventCycleLevNest extends ListenerParser{

    public EventCycleLevNest(IMetric ce1, ListenerParser successor) {
        cycleLevNest = ce1;
        this.successor = successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.WHILE_START || event.getCode() == Event.WHILE_END
                || event.getCode() == Event.DO_WHILE_START || event.getCode() == Event.DO_WHILE_END
                || event.getCode() == Event.FOR_START || event.getCode() == Event.FOR_END) {
            cycleLevNest.calculate(event);
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
