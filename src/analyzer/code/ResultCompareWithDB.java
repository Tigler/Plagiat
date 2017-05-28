package analyzer.code;

/**
 * Created by tigler on 16.05.17.
 */
public class ResultCompareWithDB {
    private String author;
    private String name;
    private String desc;
    private String seq;
    private String freq;
    private String macCabe;
    private String compGrafs;
    private String allRes;

    public ResultCompareWithDB(String author, String name, String desc, String seq, String freq, String macCabe,
                               String compGrafs, String allRes) {
        this.author = author;
        this.name = name;
        this.desc = desc;
        this.seq = seq;
        this.freq = freq;
        this.macCabe = macCabe;
        this.compGrafs = compGrafs;
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

    public String getMacCabe() {
        return macCabe;
    }

    public void setMacCabe(String macCabe) {
        this.macCabe = macCabe;
    }

    public String getCompGrafs() {
        return compGrafs;
    }

    public void setCompGrafs(String compGrafs) {
        this.compGrafs = compGrafs;
    }

    public String getAllRes() {
        return allRes;
    }

    public void setAllRes(String allRes) {
        this.allRes = allRes;
    }
}
