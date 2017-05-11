package dynamic;

import javafx.scene.control.Alert;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class UtiliteForLinuxC extends Utilite {


    @Override
    public boolean executeProgramm(ArrayList<String> listPathFiles, int numAnalyzer) {
        String nameProgram = null;
        String pathProgramm = null;
        String dirCompilC = null;
        String logFile = null;
        switch (numAnalyzer) {
            case 1:
                nameProgram = "CProgramm1";
                pathProgramm = "dinamic/CompilationFilesC1/CProgramm1";
                dirCompilC = "dinamic/CompilationFilesC1/";
                logFile = "dinamic/CompilationFilesC1/valgrindResult1.txt";
                break;
            case 2:
                nameProgram = "CProgramm2";
                pathProgramm = "dinamic/CompilationFilesC2/CProgramm2";
                dirCompilC = "dinamic/CompilationFilesC2/";
                logFile = "dinamic/CompilationFilesC2/valgrindResult2.txt";
                break;
            default:
                return false;
        }
        Runtime rt = Runtime.getRuntime();
        try {
            Process proc = rt.exec("chmod 777 -R dinamic");
            for (int i = 0; i < listPathFiles.size(); i++) {
                proc = rt.exec("gcc -c " + listPathFiles.get(i) + " -o " + dirCompilC + i + ".o");
            }
            String listCompil = " ";
            for (int i = 0; i < listPathFiles.size(); i++) {
                listCompil += dirCompilC + i + ".o ";
            }

            proc = rt.exec("gcc -o " + dirCompilC + nameProgram + listCompil);

            if (!(new File(pathProgramm)).exists()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setResizable(false);
                alert.setTitle("Динамический анализ");
                alert.setHeaderText("Не удалось компилировать файлы проекта или выполнить сборку");
                alert.showAndWait();
                return false;
            }
            proc = rt.exec("valgrind --tool=cachegrind --cachegrind-out-file=dinamic/cachegrind/out --log-file=" + logFile + " ./" + pathProgramm);


        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}


//метод опередляющий ос для установки
   /* Runtime rt = Runtime.getRuntime();
        try {
                Process proc = rt.exec("chmod 777 -R dinamic");
                proc = rt.exec("./dinamic/scriptAboutOS.sh");
                BufferedReader reader = null;
                try {
                reader = new BufferedReader(
                new InputStreamReader(
                new FileInputStream("dinamic/osabout.txt"), Charset.forName("UTF-8")));
                String line;
                int countStr = 0;
                while ((line = reader.readLine()) != null && countStr < 1) {
        countStr++;
        }
        String[] lineParse = line.split("\t");

        String os = lineParse[1];

        switch (os) {
        case "Fedora":
        case "Debian":
        case "Ubuntu":
        case "Centos":
default:
        }

        } catch (IOException e) {
        // log error
        } finally {
        if (reader != null) {
        try {
        reader.close();
        } catch (IOException e) {
        // log warning
        }
        }
        }
        // proc = rt.exec("./dinamic/LinuxC.sh");
        } catch (IOException e) {
        e.printStackTrace();
        }
        return false;
        }*/
