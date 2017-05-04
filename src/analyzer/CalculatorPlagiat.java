package analyzer;

import analyzer.code.IMetric;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by tigler on 01.05.17.
 */
public class CalculatorPlagiat {
    public int calcForTwoProjMetrics(ArrayList<IMetric> listFirst, ArrayList<IMetric> listSecond) {
        int result = 0;
        for (IMetric firstM : listFirst) {
            for (IMetric secondM : listFirst) {
                if (firstM.getName().equals(secondM.getName())) {
                    if (firstM.getResult() > secondM.getResult()) {

                    }
                }
            }
        }
        return result;
    }

    public int calcFirstAnd(ArrayList<IMetric> listFirst, ArrayList<IMetric> listSecond) {
        int result = 0;
        return result;
    }
}
