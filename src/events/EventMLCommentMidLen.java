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
public class EventMLCommentMidLen extends ListenerParser{

    public EventMLCommentMidLen(IMetric ce){
        MLCommentMidLen = ce;
        successor=null;
    }

    public EventMLCommentMidLen(IMetric ce1, ListenerParser successor) {
        MLCommentMidLen = ce1;
        this.successor=successor;
    }
    

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.MULTILINE_COMMENT) {
            MLCommentMidLen.calculate(event);
            if (successor != null) {
                successor.onEvent(event);
            }
        }else{
            if(successor!=null){
                successor.onEvent(event);
            }
        }
    }
    
    
    
}
