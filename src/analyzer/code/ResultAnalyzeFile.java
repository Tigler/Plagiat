package analyzer.code;

import graf.Node;

import java.util.ArrayList;

/**
 * результат анализа файлов - исходник в необходимых представлениях
 * Created by tigler on 06.05.17.
 */
public class ResultAnalyzeFile {
    private String nameFile; //название файла
    private String path; //путь до файла
    private ArrayList<ArrayList<Operator>> listsOperators; //списки операторов одного исходника
    private ArrayList<ArrayList<Node>> graf; //графы методов одного исходника
    private ArrayList<Integer> macCabeValues; //список значений метрики маккейба

    public ResultAnalyzeFile(String nameFile, String path, ArrayList<ArrayList<Operator>> listsOperators,
                             ArrayList<ArrayList<Node>> graf) {
        this.nameFile = nameFile;
        this.path = path;
        this.listsOperators = (ArrayList<ArrayList<Operator>>) listsOperators.clone();
        this.graf = graf;
        this.macCabeValues = new ArrayList<>();
        calcMacCabe();
    }

    public ResultAnalyzeFile(String nameFile, String path, ArrayList<ArrayList<Operator>> listsOperators,
                             ArrayList<ArrayList<Node>> graf, ArrayList<Integer> macCabeValues) {
        this.nameFile = nameFile;
        this.path = path;
        this.listsOperators = (ArrayList<ArrayList<Operator>>) listsOperators.clone();
        this.graf = graf;
        this.macCabeValues = macCabeValues;
    }

    private void calcMacCabe() {
        int countEdgesFirst = 0;
        int countNodesFirst = 0;
        for (ArrayList<Node> listNodes : graf) {
            for (Node node : listNodes) {
                countEdgesFirst += node.getEdges().size();
            }
            countNodesFirst = listNodes.size();
            macCabeValues.add(countEdgesFirst - countNodesFirst);
        }
    }


    public String getNameFile() {
        return nameFile;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<ArrayList<Operator>> getListsOperators() {
        return listsOperators;
    }

    public ArrayList<ArrayList<Node>> getGraf() {
        return graf;
    }

    public ArrayList<Integer> getMacCabeValues() {
        return macCabeValues;
    }

    public int getMacCabeValue(int idx) {
        return macCabeValues.get(idx);
    }
}
