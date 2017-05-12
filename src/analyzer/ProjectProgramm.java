package analyzer;

import java.util.ArrayList;

/**
 * Created by tigler on 12.05.17.
 */
public class ProjectProgramm {
    String author;
    String desc;
    String name;
    ArrayList<String> pathsSrc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ProjectProgramm(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPathsSrc() {
        return pathsSrc;
    }

    public void setPathsSrc(ArrayList<String> pathsSrc) {
        this.pathsSrc = pathsSrc;
    }
}
