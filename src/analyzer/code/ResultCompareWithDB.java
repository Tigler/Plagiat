package analyzer.code;

/**
 * Created by tigler on 16.05.17.
 */
public class ResultCompareWithDB {
    String author;
    String name;
    String desc;
    String seq;
    String freq;
    String allRes;

    public ResultCompareWithDB(String author, String name, String desc, String seq, String freq, String allRes) {
        this.author = author;
        this.name = name;
        this.desc = desc;
        this.seq = seq;
        this.freq = freq;
        this.allRes = allRes;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public String getAllRes() {
        return allRes;
    }

    public void setAllRes(String allRes) {
        this.allRes = allRes;
    }
}
