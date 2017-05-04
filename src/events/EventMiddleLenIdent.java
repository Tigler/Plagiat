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
public class EventMiddleLenIdent extends ListenerParser{

    public EventMiddleLenIdent(IMetric mli) {
        middleLenIdent = mli;
        successor=null;
    }
    
    public EventMiddleLenIdent(IMetric mli,ListenerParser succsessor) {
        middleLenIdent = mli;
        this.successor=succsessor;
    }
    
    @Override
    public void onEvent(Event event) {   
        if(event.getCode() == Event.ISIDENT){
            middleLenIdent.calculate(event);
        }else{
            if(successor!=null){
                successor.onEvent(event);
            }
        }
        
    }
}
