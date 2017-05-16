/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzer.code;

import events.EventParser;

/**
 *
 * @author tigler
 */
public interface IMetric {

    public void calculate(EventParser event);

    public void reset();

    public double getResult();
    
}
