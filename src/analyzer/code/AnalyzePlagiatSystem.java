/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzer.code;

import analyzer.CalculatorPlagiat;

import java.util.ArrayList;

/**
 * @author tigler
 */
public class AnalyzePlagiatSystem {
    private Analyzer firstAnalyzer;
    private Analyzer secondAnalyzer;
    private CalculatorPlagiat calculatorPlagiat;

    public AnalyzePlagiatSystem() {
        firstAnalyzer = null;
        secondAnalyzer = null;
    }

    /**
     * инициализирует первый анализатор
     *
     * @param codeLang - код языка програмирования
     */
    public void setFirstAnalyzer(int codeLang) {
        firstAnalyzer = initAnalyzer(codeLang);
    }

    /**
     * инициализирует первый анализатор
     *
     * @param codeLang - код языка програмирования
     */
    public void setSecondAnalyzer(int codeLang) {
        secondAnalyzer = initAnalyzer(codeLang);
    }

    public void parsingFirst(String path) {
        firstAnalyzer.parsing(path);
    }

    public void parsingSecond(String path) {
        secondAnalyzer.parsing(path);
    }

    public Analyzer getFirstAnalyzer() {
        return firstAnalyzer;
    }

    public Analyzer getSecondAnalyzer() {
        return secondAnalyzer;
    }

    /**
     * инициализирует анализатор по коду языка программирования, и возвращает ссылку на него
     *
     * @param lang - код языка програмирования
     * @return если язык программирования есть с кодом параметра,то ссылку на необходимый анализатор, иначе null
     */

    private Analyzer initAnalyzer(int lang) {
        Analyzer analyzer = null;
        switch (lang) {
            case LanguagePrograming.LANG_C:
                analyzer = new AnalyzerC();
                break;
            case LanguagePrograming.LANG_JAVA:
                analyzer = new AnalyzerJava();
                break;
            default:
        }
        return analyzer;
    }


    /**
     * создает список языков программирования(объектов LanguagePrograming)
     *
     * @return список языков программирования
     */
    public ArrayList<LanguagePrograming> initLanguages() {
        ArrayList<LanguagePrograming> listLanguages = new ArrayList<>();
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_C, "C"));
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_JAVA, "Java"));
        return listLanguages;
    }

    public int analyzeProjects(){
        return calculatorPlagiat.calcForTwoProjMetrics(firstAnalyzer.getListMetrics(),secondAnalyzer.getListMetrics());
    }

    public int analyzeFirstProjAndDB(){
        return calculatorPlagiat.calcForTwoProjMetrics(firstAnalyzer.getListMetrics(),secondAnalyzer.getListMetrics());
    }

    public int fullAnalyze(){
        firstAnalyzer.dynamicAnalyze();
        return 1;////1;calculatorPlagiat.calcForTwoProjMetrics(firstAnalyzer.getListMetrics(),secondAnalyzer.getListMetrics());
    }

   public void setFirstFiles(ArrayList<String> pathFiles){
        firstAnalyzer.setListPathFiles(pathFiles);
    }

    public void firstProjCompareDB() {
        //
    }
}
