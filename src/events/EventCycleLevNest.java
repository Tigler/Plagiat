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
    public void onEvent(EventParser event) {
        if (event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.WHILE_END
                || event.getCode() == EventParser.DO_WHILE_START || event.getCode() == EventParser.DO_WHILE_END
                || event.getCode() == EventParser.FOR_START || event.getCode() == EventParser.FOR_END) {
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
