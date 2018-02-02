import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Connect_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/BOOKS";
        String user = "rot";
        String pwd = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement stmt = conn.createStatement();
            String update = "ALTER TABLE Customer ADD DEPARTAMENT VARCHAR(30)";
            int rs = stmt.executeUpdate(update);
               
            out.println("Conexão realizada sem erros!");
        }
        catch (SQLException update) {
            out.println(update.getMessage());
        }
        catch (Exception se) {
            out.println("Usuário inválido");
           
        }
    }   
}
