/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Перечисление оценок для метрики "Средняя длина идентификатора"
 * @author tigler
 */
public enum EnumMarkMiddleLenIdent {
    mode1("Длина идентификатора\nслишком мала.\nКод не читаемый"),
    mode2("Длина идентификаторов\nв норме.\nКод читаемый"),
    mode3("Длина идентификаторов\nслишком велика\nсоздается нагромождение");

    private final String name;

    private EnumMarkMiddleLenIdent(String s) {
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
