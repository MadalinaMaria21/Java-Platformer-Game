package PaooGame;

import java.awt.*;
import java.sql.*;
//Database este o clasa care implementeaza o baza de date  SQlite
public class Database {
    private static Database instance;
    private static RefLinks refLinks;
    private Connection connection;
    private Statement statement;
    private Database(RefLinks refLinks) throws SQLException { //constructor
        Database.refLinks = refLinks;
        // Testable conexiunea cu baza de date
        connection = DriverManager.getConnection("jdbc:sqlite:CatchTeeth_Score.db" ); //creare conexiune cu bazele sql
        String query = "CREATE TABLE IF NOT EXISTS Scores (" //creare tabela
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "Dinti_Galbeni INT,"
                + "Dinti_Albastri INT,"
                + "Dinti_Mov INT)";
        statement = connection.createStatement();
        statement.executeUpdate(query);
    }

    public static Database GetInstance() throws SQLException {
        if(instance == null)
            instance = new Database(refLinks);
        return instance;
    }


    public void insertData(int galben, int albastru, int mov) throws SQLException {
        // inserează date în tabel
        String query = "INSERT INTO Scores (Dinti_Galbeni, Dinti_Albastri, Dinti_Mov)" +
                " VALUES ('" + galben + "', '" + albastru + "', '" + mov + "')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }
    public void printData() throws SQLException {
        // Recuperează datele din tabel
        String query = "SELECT * FROM Scores";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String galben = resultSet.getString("Dinti_Galbeni");
            String albastru = resultSet.getString("Dinti_Albastri");
            String mov = resultSet.getString("Dinti_Mov");

            System.out.println("Dinti_Galbeni: " + galben + ", Dinti_Albastri: " + albastru + ", Dinti_Mov: " + mov);
        }

        resultSet.close();
        if (connection != null) {
            connection.close();
        }
    }

    public void Draw(Graphics g) throws SQLException { //deseneaza scorul pe ecran in meniul de scor
        String query = "SELECT * FROM Scores ORDER BY id DESC LIMIT 3";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int xPos = 280;

        while (resultSet.next()) {
            int galben = resultSet.getInt("Dinti_Galbeni");
            int albastru = resultSet.getInt("Dinti_Albastri");
            int mov = resultSet.getInt("Dinti_Mov");

            g.setColor(Color.MAGENTA);
            g.drawString("" + galben, xPos, 230);
            g.drawString("" + albastru, xPos, 330);
            g.drawString("" + mov, xPos, 430);

            xPos += 80;
        }

        resultSet.close();
    }

    public void closeConnection() throws SQLException {//inchide conexiunea
        // Închide conexiunea cu baza de date
        if (connection != null) {
            connection.close();
        }
    }
}
