package dynamic;

import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public interface Utilite {
    /**
     * Проводит компилирование исходников, сборку и анализ утилитой
     *
     * @param listPathFiles список путей до исходников проекта
     * @param numAnalyzer   - номер анализатора
     * @return флаг успешности
     */
    boolean executeProgramm(ArrayList<String> listPathFiles, int numAnalyzer);
}
