/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author tigler
 */
public enum ResultTextReportEnum {
    macCabe("Показатели метрики МакКейба совпали на "),
    compareGrafs("Совпадение графов методом Слайсов: "),
    freqOperators("Схожесть по частотам операторов: "),
    seqOperators("Совпадение последовательностей операторов: "),
    dynamic("Динамический анализ: ");

    private final String name;

    private ResultTextReportEnum(String s) {
        name = s;
    }

    
    public String toString() {
       return this.name;
    }
}
