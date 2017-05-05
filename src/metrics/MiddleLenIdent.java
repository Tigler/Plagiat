/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import analyzer.code.IMetric;
import enums.EnumMarkMiddleLenIdent;
import enums.EnumNamesMetric;
import events.EventMiddleLenIdent;
import events.EventParser;
import events.ListenerParser;

/**
 * Вычисляет среднюю длину идентификаторов
 *
 * @author tigler
 */
public class MiddleLenIdent implements IMetric {

    /**
     * сумма длин поступавших идентификаторов
     */
    int sumLenthIdents;
    /**
     * количество поступивших идентификаторов
     */
    int countIdent;
    /**
     * средняя длина поступивших идентификаторов
     */
    double middleLenIdent;
    /**
     * финализированная переменая.Плохая оценка средней длинны идентификаторов.
     */
    public final static double MINSETTING = 3.0;
    /**
     * финализированная переменая.Хорошая оценка средней длинны идентификаторов.
     */
    public final static double MAXSETTING = 15.0;

    /**
     * Конструктор без параметров, иницианилизирует все переменные нулевыми
     * значениями.
     */
    public MiddleLenIdent() {
        sumLenthIdents = 0;
        countIdent = 0;
        middleLenIdent = 0.0;
    }

    /**
     * Суммирует длинну идентификаторов поступающих в параметре event. Сумма
     * длинн переменных в сохраняется в переменной sumLenthIdents. Количество
     * поступивших идентификаторов в переменной countIdent.
     *
     * @param event - событие возникшее в синтаксическом анализаторе
     */
    @Override
    public void calculate(EventParser event) {
        if (event.getCode() == EventParser.ISIDENT) {
            sumLenthIdents += event.getIdent().length();
            countIdent++;
            middleLenIdent = (double) sumLenthIdents / (double) countIdent;
        }

    }

    /**
     * Вычисляет и возвращает среднюю длину идентификаторов.
     *
     * @see - Использует данные поступившие в метод calculate.
     * @return Среднюю длину идентификаторов.
     */
    @Override
    public double getResult() {
        return middleLenIdent;
    }

    /**
     * cбрасывает значения переменных до начальных(нулевых)
     */
    @Override
    public void reset() {
        sumLenthIdents = 0;
        countIdent = 0;
        middleLenIdent = 0.0;
    }

    /**
     * Статический метод для получения названия метрики. Использует перечисление
     * EnumNamesMetric с названиями метрик.
     *
     * @return Строку - навание метрики.
     */
    public String getName() {
        return EnumNamesMetric.midLenIdent.toString();
    }

    @Override
    public ListenerParser initListener(IMetric metric, ListenerParser listener) {
        return new EventMiddleLenIdent(metric,listener);
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
            return EnumMarkMiddleLenIdent.mode2.toString();
        }
        if (metric < bad) {
            return EnumMarkMiddleLenIdent.mode1.toString();
        }
        if (metric > good) {
            return EnumMarkMiddleLenIdent.mode3.toString();
        }
        return null;
    }

}
