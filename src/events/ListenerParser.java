/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import analyzer.code.IMetric;
import analyzer.code.Operator;
import events.Event;

import java.util.ArrayList;

/**
 *
 * @author tigler
 */
public abstract class ListenerParser {

    IMetric daco;
    IMetric ifLevelNest;
    IMetric middleLenIdent;
    IMetric MLCommentCount;
    IMetric MLCommentMidLen;
    IMetric OLCommentCount;
    IMetric OLCommentMidLen;
    IMetric funcCount;
    IMetric cycleCount;
    IMetric cycleLevNest;
    ArrayList<Operator> listOperators;

    ListenerParser successor;

    public abstract void onEvent(Event event);
}
