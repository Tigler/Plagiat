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
 * слушатель парсера
 * @author tigler
 */
public abstract class ListenerParser {
    protected ArrayList<ArrayList<Operator>> listsOperators; //списки операторов одного исходника
    protected ArrayList<Operator> listOperatorsTemp; //временный список операторов, для сбора операторов в одном методе

    protected ArrayList<ArrayList<Node>> graf; //графы методов одного исходника
    protected ArrayList<Node> listNodeFunc;  //временный список узлов, одного метода

    protected ListenerParser successor;

    /**
     * произошло событие в парсере
     *
     * @param event - конкретное событие
     */
    public abstract void onEvent(EventParser event);

    /**
     * задать списки операторов одного исходника
     * @param listsOperators -списки операторов одного исходника
     */
    public void setListOperators(ArrayList<ArrayList<Operator>> listsOperators) {
        this.listsOperators = listsOperators;
    }

    /**
     * задать графы методов одного исходника
     * @param graf - графы методов одного исходника
     */
    public void setGraf(ArrayList<ArrayList<Node>> graf) {
        this.graf = graf;
    }

}
