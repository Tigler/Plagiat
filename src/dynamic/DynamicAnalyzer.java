/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic;

import analyzer.code.LanguagePrograming;

import java.util.ArrayList;

/**
 * Динамический анализатор, предназначен для проведения динамическго анализа проекта
 * @author tigler
 */
public class DynamicAnalyzer {
    // Путь до файла с результатом профилирования первой программы
    public final static String DYNAMIC_RESULT_PATH_C1 = "dinamic/CompilationFilesC1/valgrindResult1.txt";
    // Путь до файла с результатом профилирования второй программы
    public final static String DYNAMIC_RESULT_PATH_C2 = "dinamic/CompilationFilesC2/valgrindResult2.txt";
    //Утилита для динамического анализа
    private Utilite utilite;

    /**
     * Инициализация утилиты
     *
     * @param lp - код языка программирования
     * @return флаг успешности инициализция
     */
    public boolean initUtilite(int lp) {
        int os = getOS();
        switch (lp) {
            case LanguagePrograming.LANG_C:
                switch (os) {
                    case 1:
                        utilite = new UtiliteForLinuxC();
                        break;
                    default:
                        utilite = null;
                }break;
            default:
                utilite = null;
        }
        if (utilite == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Провести динамический анализ
     * @param listPathFiles - список путей до файлов проекта
     * @param numAnalyzer - номер анализатора
     * @return флаг успешности динамического анализа
     */
    public boolean analyze(ArrayList<String> listPathFiles, int numAnalyzer) {
        return utilite.executeProgramm(listPathFiles, numAnalyzer);
    }


    /**
     * Получить ОС на которой запущена данная программа
     *
     * @return 0 - не удалось определить или не одна из следующих, 1 - linux, 2 - windows, 3 - mac
     */
    private int getOS() {
        if (isUnix()) {
            return 1;
        }
        if (isWindows()) {
            return 2;
        }
        if (isMac()) {
            return 3;
        }
        return 0;
    }

    private static boolean isWindows() {

        String os = System.getProperty("os.name").toLowerCase();
        //windows
        return (os.indexOf("win") >= 0);

    }

    private static boolean isMac() {

        String os = System.getProperty("os.name").toLowerCase();
        //Mac
        return (os.indexOf("mac") >= 0);

    }

    private static boolean isUnix() {

        String os = System.getProperty("os.name").toLowerCase();
        //linux or unix
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);
    }
}
