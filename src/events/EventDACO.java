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
    public void onEvent(EventParser event) {
        if (event.getCode() == EventParser.ASSIGMENT
                || event.getCode() == EventParser.DESCRIPTION
                || event.getCode() == EventParser.OPERATOR) {
            daco.calculate(event);
        }else{
            if(successor!=null){
                successor.onEvent(event);
            }
        }
    }
}
