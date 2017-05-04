/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;
import analyzer.code.Operator;

/**
 *
 * @author tigler
 */
public class EventSequenceOperators extends ListenerParser {

    public EventSequenceOperators(IMetric ce) {
        OLCommentCount = ce;
        successor = null;
    }

    public EventSequenceOperators(IMetric ce, ListenerParser successor) {
        OLCommentCount = ce;
        this.successor = successor;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getCode() == Event.ASSIGMENT || event.getCode() == Event.IF_START
                || event.getCode() == Event.SWITCH || event.getCode() == Event.DO_WHILE_START
                || event.getCode() == Event.WHILE_START || event.getCode() == Event.FOR_START
                || event.getCode() == Event.GOTO || event.getCode() == Event.BREAK
                || event.getCode() == Event.CONTINUE || event.getCode() == Event.RETURN
                ) {
            switch (event.getCode()){
                case Operator.ASSIGMENT:  listOperators.add(new Operator(Operator.ASSIGMENT,"="));break;
                case Operator.IF:  listOperators.add(new Operator(Operator.IF,"if"));break;
                case Operator.SWITCH:  listOperators.add(new Operator(Operator.SWITCH,"switch"));break;
                case Operator.DOWHILE:  listOperators.add(new Operator(Operator.DOWHILE,"dowhile"));break;
                case Operator.WHILE:  listOperators.add(new Operator(Operator.WHILE,"while"));break;
                case Operator.FOR:  listOperators.add(new Operator(Operator.FOR,"for"));break;
                case Operator.GOTO:  listOperators.add(new Operator(Operator.GOTO,"goto"));break;
                case Operator.BREAK:  listOperators.add(new Operator(Operator.BREAK,"break"));break;
                case Operator.CONTINUE:  listOperators.add(new Operator(Operator.CONTINUE,"continue"));break;
                case Operator.RETURN:  listOperators.add(new Operator(Operator.RETURN,"return"));break;
            }
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
