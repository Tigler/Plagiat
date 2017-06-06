package analyzer.code;

/**
 * Created by tigler on 01.05.17.
 */
public class Operator {
    public static final int ASSIGMENT = 1; //код присваивания
    public static final int IF = 2; //код if
    public static final int SWITCH = 3; //код switch
    public static final int DOWHILE = 4; //код dowhile
    public static final int WHILE = 5; //код while
    public static final int FOR = 6; //код for
    public static final int GOTO = 7; //код goto
    public static final int RETURN = 8; //код return
    public static final int BREAK = 9; //код break
    public static final int CONTINUE = 10; //код continue

    private int keyOperator; //ключ оператора
    private String valueOperator; //символьное представление оператора
    private int str; //номер строки где встречен оператор
    private String path; // путь до файла где встерчен оператор

    public Operator(int keyOperator, String valueOperator, int str, String path) {
        this.keyOperator = keyOperator;
        this.valueOperator = valueOperator;
        this.str = str;
        this.path = path;
    }

    /**
     * получить ключ оператора
     *
     * @return ключ оператора
     */
    public int getKeyOperator() {
        return keyOperator;
    }

    /**
     * получить символьное обозначение оператора
     * @return символьное обозначение оператора
     */
    public String getValueOperator() {
        return valueOperator;
    }

    /**
     * получить номер строки, где встречен оператор
     * @return номер строки, где встречен оператор
     */
    public int getStr() {
        return str;
    }

    /**
     * получить путь до файла, где встерчен оператор
     * @return путь до файла, где встерчен оператор
     */
    public String getPath() {
        return path;
    }
}
