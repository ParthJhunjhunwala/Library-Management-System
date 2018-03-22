package online.library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class OnlineLibrary {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try
        {
            Connection con;
            java.sql.Statement st;
            ResultSet rs;
            String driver="net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            String url="jdbc:ucanaccess://C:\\Users\\Parth\\Documents\\NetBeansProjects/OOPM.accdb";
            con=DriverManager.getConnection(url);
            String sql="SELECT * from Table1";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            mainmenu mm=new mainmenu();
            mm.setVisible(true);
        }
        catch(SQLException e)
        {
            System.out.println("Exception Caught");
        }
    }
    
}