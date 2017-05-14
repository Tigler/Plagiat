/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;
import analyzer.code.Operator;
import graf.Node;

import java.util.ArrayList;

/**
 *
 * @author tigler
 */
public abstract class ListenerParser {


    IMetric ifLevelNest;
    IMetric cycleLevNest;
    ArrayList<ArrayList<Operator>> listsOperators;
    ArrayList<Operator> listOperatorsTemp;

    ArrayList<ArrayList<Node>> graf;
    ArrayList<Node> listNodeFunc;
    Node curNode;

    ListenerParser successor;

    public abstract void onEvent(EventParser event);

    public void setListOperators(ArrayList<ArrayList<Operator>> listsOperators) {
        this.listsOperators = listsOperators;
    }

}
