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
public enum EnumNameOperators {
    Assigment("="),
    If("if"),
    Switch("switch"),
    Dowhile("dowhile"),
    While("while"),
    For("for"),
    Goto("goto"),
    Break("break"),
    Continue("continue"),
    Return("return");


    /**
     * Получить название метрики.
     * @return Строку- название метрики.
     */
     
    public String getName() {
        return name;
    }

    private final String name;

    private EnumNameOperators(String name) {
        this.name = name;
    }
}
