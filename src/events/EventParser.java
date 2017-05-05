/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 * Событие происходящее в синтаксическом анализаторе.
 * Типы событий: начало if, конец if, описание переменной, присваивание, оператор, индентификатор.
 *
 * @author tigler
 */
public class EventParser {

    /**
     * финализированная переменная. Произошеднее событие: начало if
     */
    public final static int IF_START = 1;
    /**
     * финализированная переменная. Произошеднее событие: конец if
     */
    public final static int IF_END = 2;
    /**
     * финализированная переменная. Произошеднее событие: описание
     */
    public final static int DESCRIPTION = 3;
    /**
     * финализированная переменная. Произошеднее событие: присваивание
     */
    public final static int ASSIGMENT = 4;
    /**
     * финализированная переменная. Произошеднее событие: какой-либо оператор
     */
    public final static int OPERATOR = 5;
    /**
     * финализированная переменная. Произошеднее событие: идентификатор
     */
    public final static int ISIDENT = 6;

    /**
     * финализированная переменная. Произошеднее событие: однострочный комментарий
     */
    public final static int ONELINE_COMMENT = 7;

    /**
     * финализированная переменная. Произошеднее событие: многострочный комментарий
     */
    public final static int MULTILINE_COMMENT = 8;

    /**
     * финализированная переменная. Произошеднее событие: while
     */
    public final static int WHILE_START = 9;

    /**
     * финализированная переменная. Произошеднее событие: doWhile
     */
    public final static int WHILE_END = 10;

    /**
     * финализированная переменная. Произошеднее событие: функция
     */
    public final static int FUNC = 11;

    /**
     * финализированная переменная. Произошеднее событие: начало else
     */
    public final static int ELSE_START = 12;

    /**
     * финализированная переменная. Произошеднее событие: конец else
     */
    public final static int ELSE_END = 13;

    /**
     * финализированная переменная. Произошеднее событие: switch
     */
    public final static int SWITCH = 14;

    /**
     * финализированная переменная. Произошеднее событие: case
     */
    public final static int CASE = 15;

    /**
     * финализированная переменная. Произошеднее событие: default
     */
    public final static int DEFAULT = 16;

    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int FOR_START = 17;
    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int FOR_END = 18;
    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int DO_WHILE_START = 19;
    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int DO_WHILE_END = 20;

    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int GOTO = 21;

    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int BREAK = 22;

    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int CONTINUE = 23;
    /**
     * финализированная переменная. Произошеднее событие: for
     */
    public final static int RETURN = 24;

    /**
     * строковая переменная - идентификатор. Представляет собой непосредственно текст идентификатора.
     */
    private String ident;

    /**
     * код события
     */
    private int code;
    /**
     * номер строки где произошло собитие
     */
    private int str;
    /**
     * путь до файла где произошлло собитие
     */
    private String path;

    /**
     * Конструктор с параметрами
     *
     * @param ident - текст идентификатора
     * @param code  - код события
     */
    public EventParser(String ident, int code, int str, String path) {
        this.ident = ident;
        this.code = code;
        this.str = str;
        this.path = path;
    }

    public String getIdent() {
        return ident;
    }

    public int getCode() {
        return code;
    }


    public int getStr() {
        return str;
    }

    public String getPath() {
        return path;
    }
}
