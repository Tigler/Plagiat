/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;
import events.Event;

/**
 *
 * @author tigler
 */
public class EventDACO extends ListenerParser {

    public EventDACO(IMetric ce) {
        daco = ce;
        successor=null;
    }
    
    public EventDACO(IMetric ce,ListenerParser successor) {
        daco = ce;
        this.successor=successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.ASSIGMENT
                || event.getCode() == Event.DESCRIPTION
                || event.getCode() == Event.OPERATOR) {
            daco.calculate(event);
        }else{
            if(successor!=null){
                successor.onEvent(event);
            }
        }
    }
}
