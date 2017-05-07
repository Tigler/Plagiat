/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Перечисление наименований метрик языка.
 * @author tigler
 */
public enum EnumNamesMetric {
    countOperators ("CountOperators"),
    levelNest("ifLevelNest"),
    midLenIdent("middleLenIdent"),
    cycleCount("cycleCount"),
    cycleLevelNest("cycleLevelNest"),
    MLCommentCount("MLCommentCount"),
    MLCommentMidLen("MLCommentMidLen"),
    OLCommentCount("MLCommentCount"),
    OLCommentMidLen("MLCommentMidLen");


    private final String name;       

    private EnumNamesMetric(String s) {
        name = s;
    }

     /**
     * Получить название метрики.
     * @return Строку- название метрики.
     */
     
    public String toString() {
       return this.name;
    }
}
