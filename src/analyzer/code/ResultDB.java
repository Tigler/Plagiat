package analyzer.code;

/**
 * Created by tigler on 12.05.17.
 */
public class ResultDB {
    String author;
    String name;
    String desc;
    String seqRes;
    String freqRes;
    String allRes;

    public ResultDB(String author, String name, String desc, String seqRes, String freqRes, String allRes) {
        this.author = author;
        this.name = name;
        this.desc = desc;
        this.seqRes = seqRes;
        this.freqRes = freqRes;
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

    public String getSeqRes() {
        return seqRes;
    }

    public void setSeqRes(String seqRes) {
        this.seqRes = seqRes;
    }

    public String getFreqRes() {
        return freqRes;
    }

    public void setFreqRes(String freqRes) {
        this.freqRes = freqRes;
    }

    public String getAllRes() {
        return allRes;
    }

    public void setAllRes(String allRes) {
        this.allRes = allRes;
    }
}
