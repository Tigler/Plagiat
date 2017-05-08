package analyzer.code;

/**
 * Created by tigler on 08.05.17.
 */
public class ProjectDB {
    private int id;
    private String author;
    private String name;
    private String ifCount;

    public ProjectDB(int id, String author, String name, String ifCount) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.ifCount = ifCount;
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

    public String getIfCount() {
        return ifCount;
    }
}
