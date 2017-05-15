package analyzer.code;

import java.util.ArrayList;

/**
 * Created by tigler on 08.05.17.
 */
public class ProjectDB {
    private int id;
    private String author;
    private String name;
    private String desc;
    private ArrayList<ResultAnalyzeFile> listResultAnalyzeFile;

    public ProjectDB(int id, String author, String name, String desc, ArrayList<ResultAnalyzeFile> listResultAnalyzeFile) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.desc = desc;
        this.listResultAnalyzeFile = listResultAnalyzeFile;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public ArrayList<ResultAnalyzeFile> getListResultAnalyzeFile() {
        return listResultAnalyzeFile;
    }
}
