package dynamic;

import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/**
 * Created by tigler on 01.05.17.
 */
public class UtiliteForLinuxC extends Utilite {

    public static final String dirCompilC = "dinamic/CompilationFilesC/";

    @Override
    public boolean executeProgramm(ArrayList<String> listPathFiles) {
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
            proc = rt.exec("gcc -o " + dirCompilC + "CProgramm" + listCompil);
            try {
                proc = rt.exec("./dinamic/LinuxC.sh");
            } catch (Exception e) {
                e.printStackTrace();
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Динамический анализ");
                alert.setHeaderText("Не удалось выполнить программу");
                alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(sw.toString())));
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setResizable(false);

            alert.setTitle("Динамический анализ");
            alert.setHeaderText("Не удалось компилировать файлы проекта или выполнить сборку");
            alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(sw.toString())));
            alert.showAndWait();

        }
        return false;
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
