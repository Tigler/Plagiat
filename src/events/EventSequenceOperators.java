/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.Operator;
import graf.Node;

import java.util.ArrayList;
import java.util.Stack;

/**
 * конкретный слушатель, используется для построения последовательностей операторов и графа
 *
 * @author tigler
 */
public class EventSequenceOperators extends ListenerParser {

    private Stack<Node> stack = new Stack<>(); //стек, используется для построения графа


    public EventSequenceOperators(ListenerParser successor) {
        this.successor = successor;
    }

    /**
     * произошло событие в парсере
     *
     * @param event - конкретное событие
     */
    @Override
    public void onEvent(EventParser event) {

        switch (event.getCode()) {
            case EventParser.FUNC_START: {
                stack = new Stack<>();
                listOperatorsTemp = new ArrayList<>();
                Node n = new Node(event.getCode());
                stack.add(n);
                listNodeFunc = new ArrayList<>();
                listNodeFunc.add(n);
                break;
            }
            case EventParser.FUNC_END: {
                listsOperators.add(listOperatorsTemp);
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = null;
                if (stack.size() > 0) {
                    while (stack.peek().getCode() != EventParser.FUNC_START) {
                        s = stack.pop();
                    }

                    s = stack.pop();
                    s.addNode(n);
                }
                graf.add(listNodeFunc);
                break;
            }
            case EventParser.ASSIGMENT: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.ASSIGMENT, "=", event.getStr(), event.getPath()));
                }
                break;
            }
            case EventParser.IF_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.IF_END: {
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.IF_START) {
                    stack.add(n);
                    break;
                }
                while (stack.peek().getCode() != EventParser.IF_START) {
                    stack.pop();
                }
                s = stack.pop();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.ELSE_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.ELSE_END: {
                listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.ELSE_START) {
                    stack.add(n);
                    break;
                }
                while (stack.peek().getCode() != EventParser.ELSE_START) {
                    stack.pop();
                }
                stack.add(n);
                break;
            }
            case EventParser.SWITCH_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.SWITCH, "switch", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.SWITCH_END: {
                //listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.SWITCH_START) {
                    stack.add(n);
                    break;
                }
                boolean flagLastCase = false;
                while (stack.peek().getCode() != EventParser.SWITCH_START) {
                    Node node = stack.pop();
                    if ((node.getCode() == EventParser.CASE_END || node.getCode() == EventParser.DEFAULT_END) && !flagLastCase) {
                        flagLastCase = true;
                        node.addNode(n);
                    }
                    if (node.getCode() == EventParser.BREAK) {
                        node.addNode(n);
                    }
                }
                s = stack.pop();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.CASE_START: {
                //listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.CASE_END: {
                // listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.CASE_START) {
                    stack.add(n);
                    break;
                }
                Stack<Node> tmpStack = new Stack<>();
                while (stack.peek().getCode() != EventParser.CASE_START) {
                    Node tmpNode = stack.pop();
                    if (tmpNode.getCode() == EventParser.BREAK) {
                        //tmpStack.add(tmpNode);
                    }
                }
                while (!tmpStack.empty()) {
                    //stack.add(tmpStack.pop());
                }
                s = stack.pop();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.DEFAULT_START: {
                //listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.DEFAULT_END: {
                //listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.DEFAULT_START) {
                    stack.add(n);
                    break;
                }
                Stack<Node> tmpStack = new Stack<>();
                while (stack.peek().getCode() != EventParser.DEFAULT_START) {
                    Node tmpNode = stack.pop();
                    if (tmpNode.getCode() == EventParser.BREAK) {
                        // tmpStack.add(tmpNode);
                    }
                }
                while (!tmpStack.empty()) {
                    //stack.add(tmpStack.pop());
                }
                s = stack.pop();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.WHILE_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.WHILE_END: {
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.WHILE_START) {
                    stack.add(n);
                    break;
                }
                while (stack.peek().getCode() != EventParser.WHILE_START) {
                    stack.pop();
                }
                stack.add(n);
                break;
            }
            case EventParser.DO_WHILE_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.DOWHILE, "dowhile", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.DO_WHILE_END: {
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.DO_WHILE_START) {
                    stack.add(n);
                    break;
                }
                while (stack.peek().getCode() != EventParser.DO_WHILE_START) {
                    stack.pop();
                }
                stack.add(n);
                break;
            }
            case EventParser.FOR_START: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.FOR, "for", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.FOR_END: {
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.pop();
                s.addNode(n);
                if (s.getCode() == EventParser.FOR_START) {
                    stack.add(n);
                    break;
                }
                while (stack.peek().getCode() != EventParser.FOR_START) {
                    stack.pop();
                }
                stack.add(n);
                break;
            }

            case EventParser.GOTO:
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.GOTO, "goto", event.getStr(), event.getPath()));
                }
                break;
            case EventParser.BREAK: {
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.BREAK, "break", event.getStr(), event.getPath()));
                }
                Node n = new Node(event.getCode());
                listNodeFunc.add(n);
                Node s = stack.peek();
                s.addNode(n);
                stack.add(n);
                break;
            }
            case EventParser.CONTINUE:
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.CONTINUE, "continue", event.getStr(), event.getPath()));
                }
                break;
            case EventParser.RETURN: {
                //Node n = stack.lastElement();
                //stack.clear();
                //stack.add(n);
                if (listOperatorsTemp != null) {
                    listOperatorsTemp.add(new Operator(Operator.RETURN, "return", event.getStr(), event.getPath()));
                }
                break;
            }
        }
        if (successor != null) {
            successor.onEvent(event);
        }
    }

}
