/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzer.code;

import java.util.ArrayList;

/**
 * Используется для скопления нераспознанных лексем
 * @author tigler
 */
public class Unknown {
    ArrayList<String> errorSynax;

    /**
     * Конструктор без параметров, инициализирует контейнер для неизвестных лексем
     */
    public Unknown() {
        errorSynax=new ArrayList<>();
    }
    
    /**
     * Запомнить неизвестную лексемму
     * @param err - Строка - вносимая лексема.
     */
    public void setError(String err){
        errorSynax.add(err);
    }
    
}
