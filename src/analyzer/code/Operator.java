package analyzer.code;

/**
 * Created by tigler on 01.05.17.
 */
public class Operator {
    public static final int ASSIGMENT=1;
    public static final int IF=2;
    public static final int SWITCH=3;
    public static final int DOWHILE=4;
    public static final int WHILE=5;
    public static final int FOR=6;
    public static final int GOTO=7;
    public static final int RETURN=8;
    public static final int BREAK=9;
    public static final int CONTINUE=10;
    private int keyOperator;
    private String valueOperator;

    public Operator(int keyOperator, String valueOperator) {
        this.keyOperator = keyOperator;
        this.valueOperator = valueOperator;
    }
}
