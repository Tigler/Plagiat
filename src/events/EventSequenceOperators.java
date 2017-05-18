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
 * @author tigler
 */
public class EventSequenceOperators extends ListenerParser {

    private Stack<Node> stack = new Stack<>();


    public EventSequenceOperators(ListenerParser successor) {
        this.successor = successor;
    }

    @Override
    public void onEvent(EventParser event) {
        if (event.getCode() == EventParser.ASSIGMENT ||
                event.getCode() == EventParser.IF_START || event.getCode() == EventParser.IF_END
                || event.getCode() == EventParser.ELSE_START || event.getCode() == EventParser.ELSE_END
                || event.getCode() == EventParser.SWITCH_START || event.getCode() == EventParser.DO_WHILE_START
                || event.getCode() == EventParser.WHILE_START || event.getCode() == EventParser.WHILE_END
                || event.getCode() == EventParser.FOR_START
                || event.getCode() == EventParser.GOTO || event.getCode() == EventParser.BREAK
                || event.getCode() == EventParser.CONTINUE || event.getCode() == EventParser.RETURN
                || event.getCode() == EventParser.FUNC_START || event.getCode() == EventParser.FUNC_END
                || event.getCode() == EventParser.CASE_START || event.getCode() == EventParser.DEFAULT_START
                || event.getCode() == EventParser.CASE_END || event.getCode() == EventParser.DEFAULT_END
                ) {
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

//                            curNode = null;
                    graf.add(listNodeFunc);
                    break;
                }
                case EventParser.ASSIGMENT: {
                    listOperatorsTemp.add(new Operator(Operator.ASSIGMENT, "=", event.getStr(), event.getPath()));
                    break;
                }
                case EventParser.IF_START: {
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.peek();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.IF_END: {
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
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
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
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
                    listOperatorsTemp.add(new Operator(Operator.SWITCH, "switch", event.getStr(), event.getPath()));
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
                    while (stack.peek().getCode() != EventParser.CASE_START) {
                        stack.pop();
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
                    listOperatorsTemp.add(new Operator(Operator.IF, "if", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.pop();
                    s.addNode(n);
                    if (s.getCode() == EventParser.DEFAULT_START) {
                        stack.add(n);
                        break;
                    }
                    while (stack.peek().getCode() != EventParser.DEFAULT_START) {
                        stack.pop();
                    }
                    s = stack.pop();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.WHILE_START: {
                    listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.peek();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.WHILE_END: {
                    listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
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
                    listOperatorsTemp.add(new Operator(Operator.DOWHILE, "dowhile", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.peek();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.DO_WHILE_END: {
                    //listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
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
                    listOperatorsTemp.add(new Operator(Operator.FOR, "for", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.peek();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.FOR_END: {
                    //listOperatorsTemp.add(new Operator(Operator.WHILE, "while", event.getStr(), event.getPath()));
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
                    listOperatorsTemp.add(new Operator(Operator.GOTO, "goto", event.getStr(), event.getPath()));
                    break;
                case EventParser.BREAK: {
                    listOperatorsTemp.add(new Operator(Operator.BREAK, "break", event.getStr(), event.getPath()));
                    Node n = new Node(event.getCode());
                    listNodeFunc.add(n);
                    Node s = stack.peek();
                    s.addNode(n);
                    stack.add(n);
                    break;
                }
                case EventParser.CONTINUE:
                    listOperatorsTemp.add(new Operator(Operator.CONTINUE, "continue", event.getStr(), event.getPath()));
                    break;
                case EventParser.RETURN: {
                    Node n = stack.lastElement();
                    stack.clear();
                    stack.add(n);
                    listOperatorsTemp.add(new Operator(Operator.RETURN, "return", event.getStr(), event.getPath()));
                    break;
                }
            }
            if (successor != null) {
                successor.onEvent(event);
            }
        } else {
            if (successor != null) {
                successor.onEvent(event);
                int a = 0, b = 0, c = 0, d = 0, e = 0;

                if (a >= b) {
                    c = d + b;
                    e = 1; //новое выражение
                    d = d + 1;
                } else
                    c = d - a;
            }
        }
    }

}
