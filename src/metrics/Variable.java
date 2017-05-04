/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

/**
 * Опеределяет переменную, в исходном коде.
 * @author tigler
 */
public class Variable {
    String ident;
    int countOperators;

    /**
     * Конструктор с параметром
     * @param ident - Строка - идентификатор переменной.
     */
    public Variable(String ident) {
        this.ident = ident;
        countOperators=0;
    }
    
    /**
     * инкрементирует переменную класса countOperators(увеличение количества операторов)
     */
    public void incCountOperators(){
        countOperators++;
    }
    
    /**
     * Получить количество операторов.
     * @return  - countOperators
     */  
    public int getCountOperators(){
        return countOperators;
    }
}
