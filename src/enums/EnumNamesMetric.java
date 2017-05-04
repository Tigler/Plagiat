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
    levelNest ("Level Nest"),
    midLenIdent ("Middle Len Ident");

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
