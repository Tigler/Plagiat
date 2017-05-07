package FXML.ReportPlagiat.CoinMetrics;

/**
 * Created by tigler on 07.05.17.
 */
public class ViewMetrics {
    private String name;
    private String cycleCount;
    private String cycleLevelNest;
    private String ifLevelNest;
    private String middleLenIdent;
    private String MLCommentCount;
    private String MLCommentMidLen;
    private String OLCommentCount;
    private String OLCommentMidLen;

    public ViewMetrics(String name, String cycleCount, String cycleLevelNest, String ifLevelNest, String middleLenIdent,
                       String MLCommentCount, String MLCommentMidLen, String OLCommentCount, String OLCommentMidLen) {
        this.name = name;
        this.cycleCount = cycleCount;
        this.cycleLevelNest = cycleLevelNest;
        this.ifLevelNest = ifLevelNest;
        this.middleLenIdent = middleLenIdent;
        this.MLCommentCount = MLCommentCount;
        this.MLCommentMidLen = MLCommentMidLen;
        this.OLCommentCount = OLCommentCount;
        this.OLCommentMidLen = OLCommentMidLen;
    }

    public String getName() {
        return name;
    }

    public String getCycleCount() {
        return cycleCount;
    }


    public String getIfLevelNest() {
        return ifLevelNest;
    }

    public String getMiddleLenIdent() {
        return middleLenIdent;
    }

    public String getMLCommentCount() {
        return MLCommentCount;
    }

    public String getMLCommentMidLen() {
        return MLCommentMidLen;
    }

    public String getOLCommentCount() {
        return OLCommentCount;
    }

    public String getOLCommentMidLen() {
        return OLCommentMidLen;
    }
}
