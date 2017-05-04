/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;
import events.Event;

/**
 * @author tigler
 */
public class EventIfLevelNest extends ListenerParser {

    public EventIfLevelNest(IMetric ln) {
        ifLevelNest = ln;
        successor = null;
    }

    public EventIfLevelNest(IMetric ln, ListenerParser successor) {
        ifLevelNest = ln;
        this.successor = successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.IF_START
                || event.getCode() == Event.IF_END) {
            ifLevelNest.calculate(event);
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
