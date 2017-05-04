/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import enums.EnumMarkCountOperators;
import enums.EnumNamesMetric;
import events.Event;
import analyzer.code.IMetric;
import events.EventDACO;
import events.ListenerParser;;
import java.util.ArrayList;

/**
 * Метрика - количество операторов
 * между описанием и инициализацией переменной
 * @author tigler
 */
public class DACO implements IMetric {

    /**
     * список переменных
     * @see class Variable
     */
    private ArrayList<Variable> variables;
    /**
     * максимальное количество операторов между описанием и присваиванием
     */
    private int maxCountOperator;
    /**
     * финализированная переменая.Плохая оценка количетва операторов между описанием и присваиванием.
     */
    public final static double MINSETTING = 5.0;
    /**
     * финализированная переменая.Хорошая оценка количетва операторов между описанием и присваиванием.
     */
    public final static double MAXSETTING = 10.0;

    /**
     * Конструктор без параметров - инициализирует переменные класса:
     * ArrayList<Variable> variables, и int maxCountOperator
     */
    public DACO() {
        variables = new ArrayList<>();
        maxCountOperator = 0;
    }
    
    /**
     * В зависимости от кода параметра event:
     *      Добавить переменную в список variables , если событие - описание;     
     *      Для каждой переменной из списка инкрементировать их количество, если событие - оператор;    
     *      Вычислить максимальное количество операторов maxCountOperator, если событие- присваивание;
     *      Либо, не делать ничего.
     * @param event - событие возникшее в синтаксическом анализаторе
     */
    
    @Override
    public void calculate(Event event) {
        if (event.getCode() == Event.DESCRIPTION) {
            Variable var = new Variable(event.getIdent());
            variables.add(var);
        }
        if (event.getCode() == Event.OPERATOR) {
            for (int i = 0; i < variables.size(); i++) {
                variables.get(i).incCountOperators();
            }
        }
        if (event.getCode() == Event.ASSIGMENT) {
            for (int i = 0; i < variables.size(); i++) {
                if (variables.get(i).ident.equals(event.getIdent())) {
                    if (variables.get(i).getCountOperators() > maxCountOperator) {
                        maxCountOperator = variables.get(i).getCountOperators();
                    }
                }
            }
        }
    }

    /**
     * Получить значение переменной maxCountOperator максимальное количество операторов между описанием и присваиванием
     * @see - использует данные поступившие в метод calculate
     * @return переменную maxCountOperator
     */
    @Override
    public double getResult() {
        return maxCountOperator;
    }

    /**
     * cбрасывает значения переменных до начальных
     */
    @Override
    public void reset() {
        variables = new ArrayList<>();
        maxCountOperator = 0;
    }
    
    /**
     * Статический метод для получения названия метрики.
     * Использует перечисление EnumNamesMetric с названиями метрик. 
     * @return Строку - навание метрики.
     */
    @Override
    public String getName() {
        return EnumNamesMetric.countOperators.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventDACO(metric,listener);
    }

    /**
     * Статический метод для получения описания оценки.
     * 
     * @param bad - значение плохой оценки
     * @param good - значение хорошей оценки
     * @param metric - текущая оценка
     * @return Строку оценки, в зависимости от значений параметров
     */
    public static String getMark(double bad, double good, double metric) {
        if(metric>bad && metric<good){
            return EnumMarkCountOperators.mode2.toString();
        }
        if (metric >= bad) {
            return EnumMarkCountOperators.mode1.toString();
        }
        if (metric <= good) {
            return EnumMarkCountOperators.mode3.toString();
        }
        return null;
    }

}
