package analyzer.code;



import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

import java.sql.*;
import java.util.logging.Logger;

/**
 * Created by tigler on 04.05.17.
 */
public class ConnectorDB {
    private static final Logger LOGGER = Logger.getLogger(ConnectorDB.class.getName());
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/SourcesDB?characterEncoding=UTF-8";
    private static final String user = "root";
    private static final String password = ";&jhl-f!n3Cd";
    private static final String driverName = "com.mysql.jdbc.Driver";

    // JDBC variables for opening and managing connection
    private static Connection myConn = null;
    private static PreparedStatement myStmt = null;
    private static ResultSet myRs = null;

    // Подготовленные запросы
    //для таблицы проект
    public static final String selectProjects = "select Project.id,Project.Author,Project.Name,Project.Description" +
            " from Project";
    public static final String selectProjects2 = "select Project.id,Project.Author,Project.Name,Project.Description," +
            " Source.id,Source.ifCount" +
            " from Project" +
            " inner join Source on Source.id_project=Project.id";
    public static final String selectProjects1 = "select Project.id,Project.Author,Project.Name,Project.Description" +
            " Source.id,Source.ifCount" +
            " Operator.id,Operator.operator, Operator.keyOper,Operator.idx" +
            " from Project" +
            " inner join Source on Source.id_project=Project.id" +
            " inner join Operator on Operator.id_source=Source.id";
    public static final String insertNewProject = "insert into Project (Author,Name, MidLenOLCom) values (?, ?, ?)";
    public static final String deleteProject = "delete from Project where id = ?";
    public static final String updateProject = "update Project set MidLenOLCom = ? WHERE id = ?";

    //для таблицы проект
    public static final String selectSource = "select id,Name,Expension,Text,ifCount from Source where id_project=?";
    public static final String insertNewSource = "insert into Project (Author,Name, MidLenOLCom) values (?, ?, ?)";
    public static final String deleteSource = "delete from Project where id = ?";
    public static final String updateSource = "update Project set MidLenOLCom = ? WHERE id = ?";

    public static final String selectOperator = "select id,operator,keyOper,idx from Operator where id_source=? order by idx ASC";
    public static final String insertNewOperator = "insert into Project (Author,Name, MidLenOLCom) values (?, ?, ?)";
    public static final String deleteOperator = "delete from Project where id = ?";
    public static final String updateOperator = "update Project set MidLenOLCom = ? WHERE id = ?";



    /**
     * Инициализирует соединение с БД
     *
     * @return Connection to database
     */
    public static Connection getConnection() {
        if (myConn == null) {
            try {
                Class.forName(driverName);

                // Get a connection to database
                myConn = DriverManager.getConnection(url, user, password);

            } catch (ClassNotFoundException ex) {
                LOGGER.info("Driver not found");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка подключения к базе данных");
                alert.setHeaderText("Mysql драйвер не найден");
                alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(ex.toString())));
                alert.showAndWait();

                System.exit(-1);
            } catch (SQLException ex) {
                LOGGER.info("Failed to create the database connection.");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка подключения к базе данных");
                alert.setHeaderText("Ошибка подключения к базе данных MySql");
                alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(ex.toString())));
                alert.showAndWait();

                System.exit(-1);
            }
        }
        return myConn;
    }

    /**
     * Prepare statement
     *
     * @param query - строка запроса
     * @return PreparedStatement для заполнения параметров
     * @throws SQLException - ошибка запроса
     */
    public static PreparedStatement prepeareStmt(String query) throws SQLException {
        myStmt = myConn.prepareStatement(query);
        return myStmt;
    }


    /**
     * Prepare statement with ret key
     *
     * @param query - строка запроса
     * @return PreparedStatement для заполнения параметров
     * @throws SQLException - ошибка запроса
     */
    public static PreparedStatement prepeareStmtRetKey(String query) throws SQLException {
        myStmt = myConn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        return myStmt;
    }

    /**
     * Execute SQL query
     *
     * @return ResultSet
     * @throws SQLException - ошибка запроса
     */
    public static ResultSet executeQuery() throws SQLException {
        myRs = myStmt.executeQuery();
        return myRs;
    }

    /**
     * Execute SQL update
     *
     * @return кол-во обновлённых строк или сгенерированный id
     * @throws SQLException - ошибка запроса
     */
    public static int executeUpdate() throws SQLException {
        return myStmt.executeUpdate();
    }

    /**
     * Получаем сгенерированный Id
     *
     * @return - сгенерированный id
     * @throws SQLException - ошибка запроса
     */
    public static int getinsertId() throws SQLException {
        try (ResultSet generatedKeys = myStmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return (int) generatedKeys.getLong(1);
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
    }

    /**
     * Execute SQL
     *
     * @return Флаг выполнения
     * @throws SQLException - ошибка запроса
     */
    public static boolean execute() throws SQLException {
        boolean rez = myStmt.execute();
        return rez;
    }


    public static void closeStmt() {
        try {
            if (myStmt != null) {
                myStmt.close();
            }
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
