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


    public EventSequenceOperators(IMetric ce, ListenerParser successor) {
        this.successor = successor;
    }

    @Override
    public void onEvent(EventParser event) {
        if (event.getCode() == EventParser.ASSIGMENT || event.getCode() == EventParser.IF_START
                || event.getCode() == EventParser.SWITCH || event.getCode() == EventParser.DO_WHILE_START
                || event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.FOR_START
                || event.getCode() == EventParser.GOTO || event.getCode() == EventParser.BREAK
                || event.getCode() == EventParser.CONTINUE || event.getCode() == EventParser.RETURN
                ) {
            switch (event.getCode()){
                case EventParser.ASSIGMENT:
                    listOperators.add(new Operator(Operator.ASSIGMENT, "=", event.getStr(), event.getPath()));
                    break;
                case EventParser.IF_START:
                    listOperators.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                    break;
                case EventParser.SWITCH:
                    listOperators.add(new Operator(Operator.SWITCH, "switch", event.getStr(), event.getPath()));
                    break;
                case EventParser.DO_WHILE_START:
                    listOperators.add(new Operator(Operator.DOWHILE, "dowhile", event.getStr(), event.getPath()));
                    break;
                case EventParser.WHILE_START:
                    listOperators.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
                    break;
                case EventParser.FOR_START:
                    listOperators.add(new Operator(Operator.FOR, "for", event.getStr(), event.getPath()));
                    break;
                case EventParser.GOTO:
                    listOperators.add(new Operator(Operator.GOTO, "goto", event.getStr(), event.getPath()));
                    break;
                case EventParser.BREAK:
                    listOperators.add(new Operator(Operator.BREAK, "break", event.getStr(), event.getPath()));
                    break;
                case EventParser.CONTINUE:
                    listOperators.add(new Operator(Operator.CONTINUE, "continue", event.getStr(), event.getPath()));
                    break;
                case EventParser.RETURN:
                    listOperators.add(new Operator(Operator.RETURN, "return", event.getStr(), event.getPath()));
                    break;
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
