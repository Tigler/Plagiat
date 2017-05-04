/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *Перечисление оценок для метрики "Максимальный уровень вложенности if"
 * @author tigler
 */
public enum EnumMarkLevelNest {
    mode1("Уровень вложенности\nоператоров if большой."),
    mode2("Уровень вложенности\nоператоров if в норме"),
    mode3("Уровень вложенности\nоператоров if\nсоответвтвует\nкачественному коду");

    private final String name;

    private EnumMarkLevelNest(String s) {
        name = s;
    }

    /**
     * Получить строку с оценкой.
     * @return Строку с оценкой.
     */
    public String toString() {
        return this.name;
    }
}
