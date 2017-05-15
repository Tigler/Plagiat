/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.Operator;
import graf.Node;

import java.util.ArrayList;

/**
 *
 * @author tigler
 */
public class EventSequenceOperators extends ListenerParser {


    public EventSequenceOperators(ListenerParser successor) {
        this.successor = successor;
    }

    @Override
    public void onEvent(EventParser event) {
        if (event.getCode() == EventParser.ASSIGMENT || event.getCode() == EventParser.IF_START
                || event.getCode() == EventParser.SWITCH || event.getCode() == EventParser.DO_WHILE_START
                || event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.FOR_START
                || event.getCode() == EventParser.GOTO || event.getCode() == EventParser.BREAK
                || event.getCode() == EventParser.CONTINUE || event.getCode() == EventParser.RETURN
                || event.getCode() == EventParser.FUNC_START || event.getCode() == EventParser.FUNC_END
                ) {
            switch (event.getCode()){
                case EventParser.FUNC_START:
                    listOperatorsTemp = new ArrayList<>();
                    curNode = new Node();
                    listNodeFunc = new ArrayList<>();
                    listNodeFunc.add(curNode);
                    break;
                case EventParser.FUNC_END:
                    listsOperators.add(listOperatorsTemp);
                    //graf.add(listNodeFunc);
                    break;
                case EventParser.ASSIGMENT:
                    listOperatorsTemp.add(new Operator(Operator.ASSIGMENT, "=", event.getStr(), event.getPath()));
                    break;
                case EventParser.IF_START:
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                    curNode = new Node();
                    break;
                case EventParser.SWITCH:
                    listOperatorsTemp.add(new Operator(Operator.SWITCH, "switch", event.getStr(), event.getPath()));
                    break;
                case EventParser.DO_WHILE_START:
                    listOperatorsTemp.add(new Operator(Operator.DOWHILE, "dowhile", event.getStr(), event.getPath()));
                    break;
                case EventParser.WHILE_START:
                    listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
                    break;
                case EventParser.FOR_START:
                    listOperatorsTemp.add(new Operator(Operator.FOR, "for", event.getStr(), event.getPath()));
                    break;
                case EventParser.GOTO:
                    listOperatorsTemp.add(new Operator(Operator.GOTO, "goto", event.getStr(), event.getPath()));
                    break;
                case EventParser.BREAK:
                    listOperatorsTemp.add(new Operator(Operator.BREAK, "break", event.getStr(), event.getPath()));
                    break;
                case EventParser.CONTINUE:
                    listOperatorsTemp.add(new Operator(Operator.CONTINUE, "continue", event.getStr(), event.getPath()));
                    break;
                case EventParser.RETURN:
                    listOperatorsTemp.add(new Operator(Operator.RETURN, "return", event.getStr(), event.getPath()));
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
