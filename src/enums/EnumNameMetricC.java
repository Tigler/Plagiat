/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Перечисление наименований метрик языка С.
 * @author tigler
 */
public enum EnumNameMetricC {
    mode1("CountOperators"),
    mode2("Level Nest"),
    mode3("Middle Len Ident");

    /**
     * Получить название метрики.
     * @return Строку- название метрики.
     */
     
    public String getName() {
        return name;
    }

    private final String name;

    private EnumNameMetricC(String name) {
        this.name = name;
    }
}
