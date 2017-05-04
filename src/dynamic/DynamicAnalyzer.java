/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic;

import java.util.ArrayList;

/**
 * @author tigler
 */
public class DynamicAnalyzer {
    private Utilite utilite;

    public boolean initUtilite(int r) {
        int os = getOS();
        switch (os) {
            case 1:
                utilite = new UtiliteForLinuxC();
                break;
            case 2:
               // utilite = new UtiliteForWindows();
                break;
            case 3:
                //utilite = new UtiliteForMac();
                break;
            default:
                utilite = null;
        }
        if (utilite == null) {
            return false;
        } else {
            return true;
        }
    }

    public void analyze(ArrayList<String> listPathFiles) {
        utilite.executeProgramm(listPathFiles);
    }

    public Utilite getUtilite() {
        return utilite;
    }

    /**
     * получить ОС на которой запущена данная программа
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
