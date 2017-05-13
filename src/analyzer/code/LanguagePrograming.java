package analyzer.code;

/**
 * Created by tigler on 29.04.17.
 */
public class LanguagePrograming {


    public static final int LANG_C = 0;
    public static final int LANG_JAVA = 1;
    public static final int LANG_CPP = 2;
    public static final int LANG_CSHARP = 3;
    public static final int LANG_PYTHON3 = 4;

    private int code;
    private String name;
    private String extension;

    public LanguagePrograming(int code, String name) {
        this.code = code;
        this.name = name;
        switch (code) {
            case LANG_C:
                extension = "c";
                break;
            case LANG_JAVA:
                extension = "java";
                break;
            case LANG_CPP:
                extension = "cpp";
                break;
            case LANG_CSHARP:
                extension = "cs";
                break;
            case LANG_PYTHON3:
                extension = "py";
                break;
            default:
                extension = null;
                break;
        }
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}
