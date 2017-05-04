/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import enums.EnumMarkLevelNest;
import enums.EnumNamesMetric;
import events.Event;
import analyzer.code.IMetric;
import events.EventIfLevelNest;
import events.ListenerParser;

/**
 * Метрика  - Определяет максимальный уровень вложенности оператара if
 * @author tigler
 */
public class IfLevelNest implements IMetric {

    /**
     * максимальный уровень вложенности проанализироанных операторов
     */
    int maxLevel;
    /**
     * текущий уровень вложенности проанализироанных операторов
     */
    int curLevel;
    /**
     * финализированная переменая.Плохая оценка уровня вложенности.
     */
    public final static double MINSETTING = 1.0;
    /**
     * финализированная переменая.Хорошая оценка уровная вложенности.
     */
    public final static double MAXSETTING = 6.0;

    /**
     * Конструктор без параметров, инициализирует переменные экзмепляра нулевыми значениями.
     */
    public IfLevelNest() {
        maxLevel = 0;
        curLevel = 0;
    }

    /**
     * В зависимости от кода параметра event, изменяет максимальный, и текущий уровень вложенности.
     * Максимальный уровень вложенности - максимальное значение из текущего уровня вложенности.
     * @param event - - событие возникшее в синтаксическом анализаторе
     */
    @Override
    public void calculate(Event event) {
        if (event.getCode() == Event.IF_START) {
            curLevel++;
            if (maxLevel < curLevel) {
                maxLevel = curLevel;
            }
        }
        if (event.getCode() == Event.IF_END) {
            curLevel--;
        }
    }

    /**
     * Получить максимальный уровень вложенности
     * @see  - Использует данные полученные в методе calculate
     * @return Максимальный уровень вложенности.
     */
    @Override
    public double getResult() {
        return maxLevel;
    }

    /**
     * Инициализировать переменные начальными значениями - нулевыми.
     */
    @Override
    public void reset() {
        maxLevel = 0;
        curLevel = 0;
    }

    /**
     * Статический метод для получения названия метрики.
     * Использует перечисление EnumNamesMetric с названиями метрик. 
     * @return  Строку - навание метрики.
     */
    public String getName() {
        return EnumNamesMetric.levelNest.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventIfLevelNest(metric,listener);
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
        if (metric >= bad && metric <= good) {
            return EnumMarkLevelNest.mode2.toString();
        }
        if (metric < bad) {
            return EnumMarkLevelNest.mode3.toString();
        }
        if (metric > good) {
            return EnumMarkLevelNest.mode1.toString();
        }
        return null;
    }

}
